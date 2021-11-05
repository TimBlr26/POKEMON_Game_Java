package daos;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import beans.Capacity;
import beans.Pokemon;



public class PokeDAOImpl implements PokeDAO {

	@Override
	public List<Pokemon> findAll() {
		System.out.println("[PokemonDAOImpl findAll]");
		// Etape 1 : Création de la liste
		List<Pokemon> userList = new ArrayList<Pokemon>();
		
		// Etape 2 : Connexion à la BDD
		Connection connection = DAOUtil.getConnection();
		
		// Etape 3 : Préparation de notre requete
		String request = "SELECT * FROM Pokedex";
		
		try {
			// Etape 4 : Exécuter la requete
			// Préparation
			PreparedStatement prepareStmt = connection.prepareStatement(request);
			// Exécuter la requete
			ResultSet resultSet = prepareStmt.executeQuery();
			
			// Etape 5 : Traiter les données
			// Tant que j'ai des lignes dans les résultats
			while(resultSet.next()) {
				Pokemon pokemon = new Pokemon(
					resultSet.getInt("Id"),
					resultSet.getString("Nickname"),
					resultSet.getInt("PV"),
					resultSet.getInt("Attack"),
					resultSet.getInt("Defence"),
					resultSet.getInt("Speed"),
					resultSet.getInt("TypePoke"),
					resultSet.getInt("CapacityId")
				);
				
				userList.add(pokemon);
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
	public Pokemon findById(int id) {
		System.out.println("[PokemonDAOImpl findById]");
		// Etape 1 : Création du User
		Pokemon pokemon = null;
		
		// Etape 2 : Connexion à la BDD
		Connection connection = DAOUtil.getConnection();
		
		// Etape 3 : Préparation de notre requete
		String request = "SELECT * FROM Pokedex WHERE Id = ?";
		
		try {
			// Etape 4 : Exécuter la requete
			// Préparation
			PreparedStatement prepareStmt = connection.prepareStatement(request);
			prepareStmt.setInt(1, id);
			// Exécuter la requete
			ResultSet resultSet = prepareStmt.executeQuery();
			
			// Etape 5 : Traiter les données
			// Tant que j'ai des lignes dans les résultats
			while(resultSet.next()) {
				pokemon = new Pokemon(
						resultSet.getInt("Id"),
						resultSet.getString("Nickname"),
						resultSet.getInt("PV"),
						resultSet.getInt("Attack"),
						resultSet.getInt("Defence"),
						resultSet.getInt("Speed"),
						resultSet.getInt("TypePoke"),
						resultSet.getInt("CapacityId")
				);
			}
			
			// Etape 6 : Fermeture de la connexion à la BDD
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pokemon;
	}

	@Override
	public String create(Pokemon PokemonToCreate) {
		System.out.println("[PokemonDAOImpl create]");
		// Etape 1 : Création du User
		Pokemon pokemon = null;
		
		// Etape 2 : Connexion à la BDD
		Connection connection = DAOUtil.getConnection();
		
		// Etape 3 : Préparation de notre requete
		String request = "INSERT INTO Pokedex (Nickname, PV, Attack,Defence,Speed,TypePoke,CapacityId) VALUES (?,?,?,?,?,?,?)";
		System.out.println("[PokemonDAOImpl String request]");
		try {
			// Etape 4 : Exécuter la requete
			// Préparation
			PreparedStatement prepareStmt = connection.prepareStatement(request);
			prepareStmt.setString(1, PokemonToCreate.getNickName());
			prepareStmt.setInt(2, PokemonToCreate.getpV());
			prepareStmt.setInt(3, PokemonToCreate.getAttack());
			prepareStmt.setInt(4, PokemonToCreate.getDefence());
			prepareStmt.setInt(5, PokemonToCreate.getSpeed());
			prepareStmt.setInt(6, PokemonToCreate.getTypePoke());
			prepareStmt.setInt(7, PokemonToCreate.getCapacity());
			// Exécuter la requete
			prepareStmt.executeUpdate();
			System.out.println("[PokemonDAOImpl prepareStmt.executeUpdate]");
			// Etape 5 : Fermeture de la connexion à la BDD
			connection.close();
			return "La création de l'utilisateur s'est bien passée";
		} catch (SQLException e) {
			e.printStackTrace();
			return "La création de l'utilisateur ne s'est pas bien passée";
		}
		
	}



	@Override
	public String delete(int PokemonIdToDelete) {
		System.out.println("[PokemonDAOImpl delete]");
		
		// Etape 1 : Connexion à la BDD
		Connection connection = DAOUtil.getConnection();
		
		// Etape 2 : Préparation de notre requete
		String request = "DELETE FROM Pokedex WHERE Id = ?";
		
		try {
			// Etape 3 : Exécuter la requete
			// Préparation
			PreparedStatement prepareStmt = connection.prepareStatement(request);
			prepareStmt.setInt(1, PokemonIdToDelete);
			
			// Exécuter la requete
			prepareStmt.executeUpdate();
			
			// Etape 4 : Fermeture de la connexion à la BDD
			connection.close();
			return "La suppression de l'utilisateur s'est bien passée";
		} catch (SQLException e) {
			e.printStackTrace();
			return "La suppression de l'utilisateur ne s'est pas bien passée";
		}
	}
	
	@Override
	public Pokemon findByNickname(String nickname) {
		System.out.println("[PokemonDAOImpl findById]");
		// Etape 1 : Création du User
		Pokemon pokemon = null;
		
		// Etape 2 : Connexion à la BDD
		Connection connection = DAOUtil.getConnection();
		
		// Etape 3 : Préparation de notre requete
		String request = "SELECT * FROM Pokedex WHERE Nickname = ?";
		
		try {
			// Etape 4 : Exécuter la requete
			// Préparation
			PreparedStatement prepareStmt = connection.prepareStatement(request);
			prepareStmt.setString(1, nickname);
			// Exécuter la requete
			ResultSet resultSet = prepareStmt.executeQuery();
			
			// Etape 5 : Traiter les données
			// Tant que j'ai des lignes dans les résultats
			while(resultSet.next()) {
				pokemon = new Pokemon(
						resultSet.getInt("Id"),
						resultSet.getString("Nickname"),
						resultSet.getInt("PV"),
						resultSet.getInt("Attack"),
						resultSet.getInt("Defence"),
						resultSet.getInt("Speed"),
						resultSet.getInt("TypePoke"),
						resultSet.getInt("CapacityId")
				);
			}
			
			// Etape 6 : Fermeture de la connexion à la BDD
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return pokemon;
	}
	
	
	@Override
	public List<Capacity> findAllCap() {
		System.out.println("[CapacityDAOImpl findAll]");
		// Etape 1 : Création de la liste
		List<Capacity> userList = new ArrayList<Capacity>();
		
		// Etape 2 : Connexion à la BDD
		Connection connection = DAOUtil.getConnection();
		
		// Etape 3 : Préparation de notre requete
		String request = "SELECT * FROM Capacity";
		
		try {
			// Etape 4 : Exécuter la requete
			// Préparation
			PreparedStatement prepareStmt = connection.prepareStatement(request);
			// Exécuter la requete
			ResultSet resultSet = prepareStmt.executeQuery();
			
			// Etape 5 : Traiter les données
			// Tant que j'ai des lignes dans les résultats
			while(resultSet.next()) {
				Capacity capacity = new Capacity(
					resultSet.getInt("CapacityId"),
					resultSet.getString("CapName"),
					resultSet.getInt("TypePoke"),
					resultSet.getInt("CapHeal"),
					resultSet.getInt("CapAttack")
				);
				
				userList.add(capacity);
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
	public Capacity findByIdCap(int id) {
		System.out.println("[CapacityDAOImpl findById]");
		// Etape 1 : Création du User
		Capacity capacity = null;
		
		// Etape 2 : Connexion à la BDD
		Connection connection = DAOUtil.getConnection();
		
		// Etape 3 : Préparation de notre requete
		String request = "SELECT * FROM Capacity WHERE CapacityId = ?";
		
		try {
			// Etape 4 : Exécuter la requete
			// Préparation
			PreparedStatement prepareStmt = connection.prepareStatement(request);
			prepareStmt.setInt(1, id);
			// Exécuter la requete
			ResultSet resultSet = prepareStmt.executeQuery();
			
			// Etape 5 : Traiter les données
			// Tant que j'ai des lignes dans les résultats
			while(resultSet.next()) {
				capacity = new Capacity(
						resultSet.getInt("CapacityId"),
						resultSet.getString("CapName"),
						resultSet.getInt("TypePoke"),
						resultSet.getInt("CapHeal"),
						resultSet.getInt("CapAttack")
				);
			}
			
			// Etape 6 : Fermeture de la connexion à la BDD
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return capacity;
	}
	
	@Override
	public String createCap(Capacity CapacityToCreate) {
		System.out.println("[CapacityDAOImpl create]");
		// Etape 1 : Création du User
		Capacity capacity = null;
		
		// Etape 2 : Connexion à la BDD
		Connection connection = DAOUtil.getConnection();
		
		// Etape 3 : Préparation de notre requete
		String request = "INSERT INTO Capacity (CapacityId, CapName, TypePoke,CapHeal,CapAttack) VALUES (?,?,?,?,?)";
		System.out.println("[CapacityDAOImpl String request]");
		try {
			// Etape 4 : Exécuter la requete
			// Préparation
			PreparedStatement prepareStmt = connection.prepareStatement(request);
			prepareStmt.setInt(1, CapacityToCreate.getId());
			prepareStmt.setString(2, CapacityToCreate.getCapName());
			prepareStmt.setInt(3, CapacityToCreate.getTypePoke());
			prepareStmt.setInt(4, CapacityToCreate.getCapHeal());
			prepareStmt.setInt(5, CapacityToCreate.getCapAttack());
			// Exécuter la requete
			prepareStmt.executeUpdate();
			System.out.println("[CapacityDAOImpl prepareStmt.executeUpdate]");
			// Etape 5 : Fermeture de la connexion à la BDD
			connection.close();
			return "La création de l'utilisateur s'est bien passée";
		} catch (SQLException e) {
			e.printStackTrace();
			return "La création de l'utilisateur ne s'est pas bien passée";
		}
		
	}

	@Override
	public String deleteCap(int CapacityIdToDelete) {
		System.out.println("[CapacityDAOImpl delete]");
		
		// Etape 1 : Connexion à la BDD
		Connection connection = DAOUtil.getConnection();
		
		// Etape 2 : Préparation de notre requete
		String request = "DELETE FROM Capacity WHERE CapacityId = ?";
		
		try {
			// Etape 3 : Exécuter la requete
			// Préparation
			PreparedStatement prepareStmt = connection.prepareStatement(request);
			prepareStmt.setInt(1, CapacityIdToDelete);
			
			// Exécuter la requete
			prepareStmt.executeUpdate();
			
			// Etape 4 : Fermeture de la connexion à la BDD
			connection.close();
			return "La suppression de l'utilisateur s'est bien passée";
		} catch (SQLException e) {
			e.printStackTrace();
			return "La suppression de l'utilisateur ne s'est pas bien passée";
		}
	}

	@Override
	public Capacity findByTypeCap(int id) {
		System.out.println("[CapacityDAOImpl findByTypeCap]");
		// Etape 1 : Création du User
		Capacity capacity = null;
		
		// Etape 2 : Connexion à la BDD
		Connection connection = DAOUtil.getConnection();
		
		// Etape 3 : Préparation de notre requete
		String request = "SELECT * FROM Capacity WHERE TypePoke = ?";
		
		try {
			// Etape 4 : Exécuter la requete
			// Préparation
			PreparedStatement prepareStmt = connection.prepareStatement(request);
			prepareStmt.setInt(1, id);
			// Exécuter la requete
			ResultSet resultSet = prepareStmt.executeQuery();
			
			// Etape 5 : Traiter les données
			// Tant que j'ai des lignes dans les résultats
			while(resultSet.next()) {
				capacity = new Capacity(
						resultSet.getInt("CapacityId"),
						resultSet.getString("CapName"),
						resultSet.getInt("TypePoke"),
						resultSet.getInt("CapHeal"),
						resultSet.getInt("CapAttack")
				);
			}
			
			// Etape 6 : Fermeture de la connexion à la BDD
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return capacity;
	}
}