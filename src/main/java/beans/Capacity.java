/**
 * 
 */
package beans;

/**
 * @author mcharpentier2021
 *4 nov. 2021
beans
POKEMON_Game_Java
14:58:02
 */
public class Capacity {
	//-------------------------------------------------------------------------
	//Variables
	private int id;
	private String capName;
	private int typePoke;
	private int capHeal;
	private int capAttack;


	
	
	//-------------------------------------------------------------------------
	//Méthodes
	
	
	//-------------------------------------------------------------------------
	//Constructeurs
	

	/**
	 * 
	 */
	public Capacity() {
		super();
	}
	
	/**
	 * @param capName
	 * @param typePoke
	 * @param capHeal
	 * @param capAttack
	 */
	public Capacity(String capName, int typePoke, int capHeal, int capAttack) {
		super();
		this.capName = capName;
		this.typePoke = typePoke;
		this.capHeal = capHeal;
		this.capAttack = capAttack;
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
	 * @return the capName
	 */
	public String getCapName() {
		return capName;
	}

	/**
	 * @param capName the capName to set
	 */
	public void setCapName(String capName) {
		this.capName = capName;
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
	 * @return the capHeal
	 */
	public int getCapHeal() {
		return capHeal;
	}

	/**
	 * @param capHeal the capHeal to set
	 */
	public void setCapHeal(int capHeal) {
		this.capHeal = capHeal;
	}

	/**
	 * @return the capAttack
	 */
	public int getCapAttack() {
		return capAttack;
	}

	/**
	 * @param capAttack the capAttack to set
	 */
	public void setCapAttack(int capAttack) {
		this.capAttack = capAttack;
	}



	
	
	//-------------------------------------------------------------------------
	//Override
	
	
	@Override
	public String toString() {
		return "Capacity [id=" + id + ", capName=" + capName + ", typePoke=" + typePoke + ", capHeal=" + capHeal
				+ ", capAttack=" + capAttack + "]";
	}
	
	
	
	
	
	
	
	
	
}
