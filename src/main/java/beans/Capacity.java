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
	private String CapName;
	private int TypePoke;
	private int CapHeal;
	private int CapAttack;

	
	
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
		CapName = capName;
		TypePoke = typePoke;
		CapHeal = capHeal;
		CapAttack = capAttack;
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
		return CapName;
	}



	/**
	 * @param capName the capName to set
	 */
	public void setCapName(String capName) {
		CapName = capName;
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
	 * @return the capHeal
	 */
	public int getCapHeal() {
		return CapHeal;
	}



	/**
	 * @param capHeal the capHeal to set
	 */
	public void setCapHeal(int capHeal) {
		CapHeal = capHeal;
	}



	/**
	 * @return the capAttack
	 */
	public int getCapAttack() {
		return CapAttack;
	}



	/**
	 * @param capAttack the capAttack to set
	 */
	public void setCapAttack(int capAttack) {
		CapAttack = capAttack;
	}




	
	
	//-------------------------------------------------------------------------
	//Override
	
	@Override
	public String toString() {
		return "Capacity [id=" + id + ", CapName=" + CapName + ", TypePoke=" + TypePoke + ", CapHeal=" + CapHeal
				+ ", CapAttack=" + CapAttack + "]";
	}
	



	
	
	
	
	
	
	
	
	
	
	
	
	
}
