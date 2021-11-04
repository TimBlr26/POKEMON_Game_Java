/**
 * 
 */
package services;

import java.util.List;

import beans.User;
import daos.UserDAO;
import daos.UserDAOImpl;
import utils.Encryption;

/**
 * @author Administrateur
 *
 */
public class UserServiceImpl implements UserService {

	@Override
	public List<User> findAll() {
		UserDAO userDAO = new UserDAOImpl();
		List<User> userList = userDAO.findAll();
		return userList;
	}

	@Override
	public User findById(int idUser) {
		UserDAO userDAO = new UserDAOImpl();
		return userDAO.findById(idUser);
	}
	
	@Override
	public User login(User logUser) {
		UserDAO userDAO = new UserDAOImpl();
		User returnUser = userDAO.findByPseudo(logUser.getUserName());
		if (returnUser.getPassword()== null || !returnUser.getPassword().equals(Encryption.encrypt(logUser.getPassword()))) {
			return null;
		} else {
			return returnUser;
		}
	}

	@Override
	public String create(User userToCreate) {
		UserDAO userDAO = new UserDAOImpl();
		return userDAO.create(userToCreate);
	}

	@Override
	public String delete(int idUser) {
		UserDAO userDAO = new UserDAOImpl();
		return userDAO.delete(idUser);
	}

	@Override
	public String update(User userToUpdate) {
		UserDAO userDAO = new UserDAOImpl();
		return userDAO.update(userToUpdate);
	}


}
