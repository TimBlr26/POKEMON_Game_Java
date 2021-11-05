package daos;

import java.util.List;

import beans.Pokemon;



public interface PokeDAO {
	public List<Pokemon> findAll();
	public Pokemon findById(int id);
	public String create(Pokemon userToCreate);
	//public String update(Pokemon userToUpdate);
	public String delete(int userIdToDelete);
	public Pokemon findByNickname(String nickname);
	
	public List<Capacity> findAllCap();
	public Capacity findByIdCap(int id);
	public String createCap(Capacity CapacityToCreate);
	
	public String deleteCap(int CapacityIdToDelete);
}