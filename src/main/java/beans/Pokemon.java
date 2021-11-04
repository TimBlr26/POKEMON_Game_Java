/**
 * 
 */
package beans;

/**
 * @author mcharpentier2021
 *4 nov. 2021
beans
POKEMON_Game_Java
14:45:51
 */
public class Pokemon {
	//-------------------------------------------------------------------------
	//Variables
	private int id;
	private String NickName;
	private int PV;
	private int Attack;
	private int Defence;
	private int Speed;
	private int TypePoke;
	private int Capacity;

	
	//-------------------------------------------------------------------------
	//Méthodes
	
	
	
	
	//-------------------------------------------------------------------------
	//Constructeurs
	
	/**
	 * 
	 */
	public Pokemon() {
		super();
	}
	
	/**
	 * @param nickName
	 * @param pV
	 * @param attack
	 * @param defence
	 * @param speed
	 * @param typePoke
	 * @param capacity
	 */
	public Pokemon(String nickName, int pV, int attack, int defence, int speed, int typePoke, int capacity) {
		super();
		NickName = nickName;
		PV = pV;
		Attack = attack;
		Defence = defence;
		Speed = speed;
		TypePoke = typePoke;
		Capacity = capacity;
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
		return NickName;
	}

	/**
	 * @param nickName the nickName to set
	 */
	public void setNickName(String nickName) {
		NickName = nickName;
	}

	/**
	 * @return the pV
	 */
	public int getPV() {
		return PV;
	}

	/**
	 * @param pV the pV to set
	 */
	public void setPV(int pV) {
		PV = pV;
	}

	/**
	 * @return the attack
	 */
	public int getAttack() {
		return Attack;
	}

	/**
	 * @param attack the attack to set
	 */
	public void setAttack(int attack) {
		Attack = attack;
	}

	/**
	 * @return the defence
	 */
	public int getDefence() {
		return Defence;
	}

	/**
	 * @param defence the defence to set
	 */
	public void setDefence(int defence) {
		Defence = defence;
	}

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return Speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		Speed = speed;
	}

	/**
	 * @return the typePoke
	 */
	public int getTypePoke() {
		return TypePoke;
	}

	/**
	 * @param typePoke the typePoke to set
	 */
	public void setTypePoke(int typePoke) {
		TypePoke = typePoke;
	}

	/**
	 * @return the capacity
	 */
	public int getCapacity() {
		return Capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(int capacity) {
		Capacity = capacity;
	}


	
	//-------------------------------------------------------------------------
	//Override
	
	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", NickName=" + NickName + ", PV=" + PV + ", Attack=" + Attack + ", Defence="
				+ Defence + ", Speed=" + Speed + ", TypePoke=" + TypePoke + ", Capacity=" + Capacity + "]";
	}
	
	
	
	
	
	
	
	
	
}
