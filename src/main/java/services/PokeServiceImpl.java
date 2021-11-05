/**
 * 
 */
package services;

import java.util.List;

import beans.Pokemon;
import daos.PokeDAO;
import daos.PokeDAOImpl;


/**
 * @author tblossier2021
 * POKEMON_Game_Java
 * 5 nov. 2021
 */
public class PokeServiceImpl implements PokeService {
	@Override
	public List<Pokemon> findAll() {
		PokeDAO pokeDAO = new PokeDAOImpl();
		List<Pokemon> pokeList = pokeDAO.findAll();
		return pokeList;
	}

	@Override
	public Pokemon findById(int id) {
		PokeDAO pokeDAO = new PokeDAOImpl();
		return pokeDAO.findById(id);
	}
	

	@Override
	public String create(Pokemon PokemonToCreate) {
		PokeDAO pokeDAO = new PokeDAOImpl();
		return pokeDAO.create(PokemonToCreate);
	}

	@Override
	public String delete(int PokemonIdToDelete) {
		PokeDAO pokeDAO = new PokeDAOImpl();
		return pokeDAO.delete(PokemonIdToDelete);
	}

	@Override
	public Pokemon findByNickname(String nickname) {
		PokeDAO pokeDAO = new PokeDAOImpl();
		return pokeDAO.findByNickname(nickname);
	}

	@Override
	public List<Capacity> findAllCap() {
		PokeDAO capDAO = new PokeDAOImpl();
		List<Capacity> capList = capDAO.findAllCap();
		return capList;
	}

	@Override
	public Capacity findByIdCap(int id) {
		PokeDAO capDAO = new PokeDAOImpl();
		return capDAO.findByIdCap(id);
	}
	

	@Override
	public String createCap(Capacity CapacityToCreate) {
		PokeDAO capDAO = new PokeDAOImpl();
		return capDAO.createCap(CapacityToCreate);
	}

	@Override
	public String deleteCap(int CapacityIdToDelete) {
		PokeDAO capDAO = new PokeDAOImpl();
		return capDAO.deleteCap(CapacityIdToDelete);
	}

}
