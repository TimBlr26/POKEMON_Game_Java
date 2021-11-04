package daos;

import java.util.List;

import beans.User;

public interface UserDAO {

	List<User> findAll();

	User findById(int idUser);
	User findByPseudo(String pseudo);

	String create(User userToCreate);

	String delete(int idUser);

	String update(User userToUpdate);


}
