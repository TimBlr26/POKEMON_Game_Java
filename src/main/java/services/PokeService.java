/**
 * 
 */
package services;

import java.util.List;

import beans.Capacity;
import beans.Pokemon;



/**
 * @author tblossier2021
 * POKEMON_Game_Java
 * 5 nov. 2021
 */
public interface PokeService {
	public List<Pokemon> findAll();

	public Pokemon findById(int id);
	
	public String create(Pokemon PokemonToCreate);

	public Pokemon findByNickname(String nickname);

	public String delete(int id);
	/**
	 * 
	 */
	public List<Capacity> findAllCap();
	
	public Capacity findByIdCap(int id);
	
	public String createCap(Capacity CapacityToCreate);
	
	public String deleteCap(int CapacityIdToDelete);
	
	public List<Capacity> findByTypeCap(int id);


}
