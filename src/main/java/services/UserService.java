/**
 * 
 */
package services;

import java.util.List;

import beans.User;

/**
 * @author Administrateur
 *
 */
public interface UserService {
	/**
	 * @return 
	 * 
	 */
	public List<Pokemon> findAll();

	public User findById(int idUser);
	
	public String create(User userToCreate);


	/**
	 * @param nextInt
	 */
	public String delete(int idUser);

	/** 
	 * @param user
	 * @return
	 */
	public String update(User userToUpdate);

	public User login(User logUser);
}
