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
	private String nickName;
	private int pV;
	private int attack;
	private int defence;
	private int speed;
	private int typePoke;
	private int capacity;

	
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
		this.nickName = nickName;
		this.pV = pV;
		this.attack = attack;
		this.defence = defence;
		this.speed = speed;
		this.typePoke = typePoke;
		this.capacity = capacity;
	}
	
	public Pokemon(int id,String nickName, int pV, int attack, int defence, int speed, int typePoke, int capacity) {
		super();
		this.id = id;
		this.nickName = nickName;
		this.pV = pV;
		this.attack = attack;
		this.defence = defence;
		this.speed = speed;
		this.typePoke = typePoke;
		this.capacity = capacity;
	}
	
	public String findType(int typePoke) {
		String typName="";
		if(typePoke==1) {
			typName="Fire";
		}
		if(typePoke==2) {
			typName="Water";
		}
		if(typePoke==3) {
			typName="Plant";
		}
		return typName;
	}

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

	@Override
	public String toString() {
		return "Pokemon [id=" + id + ", nickName=" + nickName + ", pV=" + pV + ", attack=" + attack + ", defence="
				+ defence + ", speed=" + speed + ", typePoke=" + typePoke + ", capacity=" + capacity + "]";
	}

	
	//-------------------------------------------------------------------------
	//Accesseurs
	

	
	
	
	
	
	
	
	
	
}
