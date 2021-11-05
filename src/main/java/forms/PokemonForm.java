/**
 * 
 */
package forms;

import java.util.Random;

/**
 * @author mcharpentier2021
 *5 nov. 2021
forms
POKEMON_Game_Java
09:18:49
 */
public class PokemonForm {
	//-------------------------------------------------------------------------
	//Variables
	private int id;
	private String nickName = "Prenom de votre pokémon";
	private int pV = 100;
	private int attack = CompetenceChoice(40);
	private int defence = CompetenceChoice(50);
	private int speed = CompetenceChoice(60);
	private int typePoke = 0;
	private int capacity = 0;
	
	private boolean isError = false;
	private String result;
	private String errorMessage;

	
	
	//-------------------------------------------------------------------------
	//Méthodes
	
	
	//-------------------------------------------------------------------------
	//Constructeurs
	
	
	/**
	 * @param nickName
	 * @param pV
	 * @param attack
	 * @param defence
	 * @param speed
	 * @param typePoke
	 * @param capacity
	 * @param isError
	 * @param result
	 * @param errorMessage
	 */
	public PokemonForm(String nickName, int pV, int attack, int defence, int speed, int typePoke, int capacity,
			boolean isError, String result, String errorMessage) {
		super();
		this.nickName = nickName;
		this.pV = pV;
		this.attack = attack;
		this.defence = defence;
		this.speed = speed;
		this.typePoke = typePoke;
		this.capacity = capacity;
		this.isError = isError;
		this.result = result;
		this.errorMessage = errorMessage;
	}



	/**
	 * 
	 */
	public PokemonForm() {
		super();
	}

	
	
	public int CompetenceChoice(int limite) {
		///PokemonForm pokemonForm = new PokemonForm();
		Random ra = new Random();
		int choiceA =limite + ra.nextInt(101-limite);
		return choiceA;
	}
	
	
	//-------------------------------------------------------------------------
	//Accesseurs
	

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}



	/**
	 * @return the nickName
	 */
	public String getNickName() {
		return nickName;
	}



	/**
	 * @param nickName the nickName to set
	 */
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}



	/**
	 * @return the pV
	 */
	public int getpV() {
		return pV;
	}



	/**
	 * @param pV the pV to set
	 */
	public void setpV(int pV) {
		this.pV = pV;
	}



	/**
	 * @return the attack
	 */
	public int getAttack() {
		return attack;
	}



	/**
	 * @param attack the attack to set
	 */
	public void setAttack(int attack) {
		this.attack = attack;
	}



	/**
	 * @return the defence
	 */
	public int getDefence() {
		return defence;
	}



	/**
	 * @param defence the defence to set
	 */
	public void setDefence(int defence) {
		this.defence = defence;
	}



	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}



	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}



	/**
	 * @return the typePoke
	 */
	public int getTypePoke() {
		return typePoke;
	}



	/**
	 * @param typePoke the typePoke to set
	 */
	public void setTypePoke(int typePoke) {
		this.typePoke = typePoke;
	}



	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return capacity;
	}



	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}



	/**
	 * @return the isError
	 */
	public boolean isError() {
		return isError;
	}



	/**
	 * @param isError the isError to set
	 */
	public void setError(boolean isError) {
		this.isError = isError;
	}



	/**
	 * @return the result
	 */
	public String getResult() {
		return result;
	}



	/**
	 * @param result the result to set
	 */
	public void setResult(String result) {
		this.result = result;
	}



	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}



	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}


	
	//-------------------------------------------------------------------------
	//Override
	@Override
	public String toString() {
		return "PokemonForm [id=" + id + ", nickName=" + nickName + ", pV=" + pV + ", attack=" + attack + ", defence="
				+ defence + ", speed=" + speed + ", typePoke=" + typePoke + ", capacity=" + capacity + ", isError="
				+ isError + ", result=" + result + ", errorMessage=" + errorMessage + "]";
	}

	
	
	
	
	
	
	
	
}
