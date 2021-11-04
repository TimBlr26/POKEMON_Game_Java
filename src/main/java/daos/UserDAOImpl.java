package daos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.User;
import utils.Encryption;

public class UserDAOImpl implements UserDAO {

	@Override
	public List<User> findAll() {
		// Etape 1 : Création de la liste
		List<User> userList = new ArrayList<User>();

		// Etape 2 : Connexion à la BDD
		Connection connection = DAOUtil.getConnection();

		// Etape 3 : Préparation de notre requete
		String request = "SELECT * FROM users";

		try {
			// Etape 4 : Exécuter la requete
			// Préparation
			PreparedStatement prepareStmt = connection.prepareStatement(request);
			// Exécuter la requete
			ResultSet resultSet = prepareStmt.executeQuery();

			// Etape 5 : Traiter les données
			// Tant que j'ai des lignes dans les résultats
			while (resultSet.next()) {
				User user = new User(resultSet.getInt("id"), resultSet.getString("userName"),
						resultSet.getDate("birthday").toLocalDate(), resultSet.getString("userName"));

				userList.add(user);
			}

			// Etape 6 : Fermeture de la connexion à la BDD
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return userList;
	}

	@Override
	public User findById(int idUser) {
		// Etape 1 : Création de la liste
		User user = new User();

		// Etape 2 : Connexion à la BDD
		Connection connection = DAOUtil.getConnection();

		// Etape 3 : Préparation de notre requete
		String request = "SELECT * FROM users WHERE id = ? ";

		try {
			// Etape 4 : Exécuter la requete
			// Préparation
			PreparedStatement prepareStmt = connection.prepareStatement(request);
			prepareStmt.setInt(1, idUser);
			// Exécuter la requete
			ResultSet resultSet = prepareStmt.executeQuery();

			// Etape 5 : Traiter les données
			// Tant que j'ai des lignes dans les résultats
			while (resultSet.next()) {
				user.setId(resultSet.getInt("id"));
				user.setUserName(resultSet.getString("userName"));
				user.setBirthday(resultSet.getDate("birthday").toLocalDate());
				user.setPassword(resultSet.getString("password"));
			}

			// Etape 6 : Fermeture de la connexion à la BDD
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return user;
	}
	@Override
	public User findByPseudo(String pseudo) {
		// Etape 1 : Création de la liste
				User user = new User();

				// Etape 2 : Connexion à la BDD
				Connection connection = DAOUtil.getConnection();

				// Etape 3 : Préparation de notre requete
				String request = "SELECT * FROM users WHERE username = ? ";

				try {
					// Etape 4 : Exécuter la requete
					// Préparation
					PreparedStatement prepareStmt = connection.prepareStatement(request);
					prepareStmt.setString(1, pseudo);
					// Exécuter la requete
					ResultSet resultSet = prepareStmt.executeQuery();

					// Etape 5 : Traiter les données
					// Tant que j'ai des lignes dans les résultats
					while (resultSet.next()) {
						user.setId(resultSet.getInt("id"));
						user.setUserName(resultSet.getString("username"));
						user.setBirthday(resultSet.getDate("birthday").toLocalDate());
						user.setPassword(resultSet.getString("password"));
					}
					// Etape 6 : Fermeture de la connexion à la BDD
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				return user;
	}

	@Override
	public String create(User userToCreate) {
		// Etape 1 : Connexion à la BDD
		Connection connection = DAOUtil.getConnection();

		// Etape 2 : Préparation de notre requete
		String request = "INSERT INTO users (userName, birthday, password) VALUES (?,?,?)";

		try {
			// Etape 3 : Exécuter la requete
			// Préparation
			PreparedStatement prepareStmt;
			prepareStmt = connection.prepareStatement(request);
			prepareStmt.setString(1, userToCreate.getUserName()); // 1er ?
			prepareStmt.setDate(2,
					Date.valueOf(userToCreate.getBirthday())); // 2eme
																													// ?
			prepareStmt.setString(3, Encryption.encrypt(userToCreate.getPassword())); // 3eme ?

			// Exécuter la requete
			prepareStmt.executeUpdate(); // Car on fait une modification

			connection.close();
			return "La cr�ation s'est bien pass�e";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "La cr�ation ne s'est pas bien pass�e";
		}
	}

	@Override
	public String delete(int idUser) {
		// Etape 1 : Connexion à la BDD
		Connection connection = DAOUtil.getConnection();

		// Etape 2 : Préparation de notre requete
		String request = "DELETE FROM users WHERE id = ?";

		try {
			// Etape 3 : Exécuter la requete
			// Préparation
			PreparedStatement prepareStmt;
			prepareStmt = connection.prepareStatement(request);
			prepareStmt.setInt(1, idUser); // 1er ?

			// Exécuter la requete
			prepareStmt.executeUpdate(); // Car on fait une modification

			connection.close();

			return "La supression s'est bien pass�e";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "La supression ne s'est pas bien pass�e";
		}
	}

	@Override
	public String update(User userToUpdate) {
		// Etape 1 : Connexion à la BDD
		Connection connection = DAOUtil.getConnection();

		// Etape 2 : Préparation de notre requete
		String request = "UPDATE users SET userName = ?, birthday = ? password = ? WHERE id = ?";

		try {
			// Etape 3 : Exécuter la requete
			// Préparation
			PreparedStatement prepareStmt;
			prepareStmt = connection.prepareStatement(request);
			prepareStmt.setString(1, userToUpdate.getUserName()); // 1er ?
			prepareStmt.setDate(2,
					Date.valueOf(userToUpdate.getBirthday())); // 1er
																													// ?
			prepareStmt.setString(1, userToUpdate.getPassword()); // 1er ?
			prepareStmt.setInt(4, userToUpdate.getId()); // 2eme ?

			// Exécuter la requete
			prepareStmt.executeUpdate(); // Car on fait une modification

			connection.close();

			return "La mise � jour s'est bien pass�e";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "La mise � jour ne s'est pas bien pass�e";
		}
	}

	
	
	
	
}
