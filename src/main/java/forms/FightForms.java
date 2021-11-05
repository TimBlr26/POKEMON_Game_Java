/**
 * 
 */
package forms;

import java.util.List;

import beans.Pokemon;
import services.PokeService;
import services.PokeServiceImpl;

/**
 * @author tblossier2021
 * POKEMON_Game_Java
 * 5 nov. 2021
 */
public class FightForms {
	
	private int choosenPokemon ;
		
	private Pokemon iaPokemon ;
	
	private List<String> fightActions ;
	
	private String fightResult ;

	/**
	 * 
	 */
	public FightForms() {
		
	}

	/**
	 * @return the choosenPokemon
	 */
	public Pokemon getChoosenPokemon() {
		PokeService pokeService = new PokeServiceImpl();
		return pokeService.findById(choosenPokemon);
	}

	/**
	 * @param choosenPokemon the choosenPokemon to set
	 */
	public void setChoosenPokemon(int choosenPokemon) {
		this.choosenPokemon = choosenPokemon;
	}

	/**
	 * @return the iaPokemon
	 */
	public Pokemon getIaPokemon() {
		return iaPokemon;
	}

	/**
	 * @param iaPokemon the iaPokemon to set
	 */
	public void setIaPokemon(Pokemon iaPokemon) {
		this.iaPokemon = iaPokemon;
	}

	/**
	 * @return the fightActions
	 */
	public List<String> getFightActions() {
		return fightActions;
	}

	/**
	 * @param fightActions the fightActions to set
	 */
	public void setFightActions(List<String> fightActions) {
		this.fightActions = fightActions;
	}

	/**
	 * @return the fightResult
	 */
	public String getFightResult() {
		return fightResult;
	}

	/**
	 * @param fightResult the fightResult to set
	 */
	public void setFightResult(String fightResult) {
		this.fightResult = fightResult;
	}

	@Override
	public String toString() {
		return "FightForms [choosenPokemon=" + choosenPokemon + ", iaPokemon=" + iaPokemon + ", fightActions="
				+ fightActions + ", fightResult=" + fightResult + "]";
	}
	
	
	
	
	

}
