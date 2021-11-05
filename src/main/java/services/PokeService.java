/**
 * 
 */
package services;

import java.util.List;

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
	/**
	 * @param nextInt
	 */
	public String delete(int id);


}
