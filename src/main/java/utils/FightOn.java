/**
 * 
 */
package utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import beans.Pokemon;

/**
 * @author tblossier2021
 * POKEMON_Game_Java
 * 5 nov. 2021
 */
public class FightOn {
	private Pokemon userPoke;
	private static Pokemon iAPoke;
	private String winner;
	private String result;
	static Random ran = new Random();
	/**
	 * @param userPoke
	 * @param iAPoke
	 * @param winner
	 * @param result
	 */
	public FightOn(String winner, String result) {
		this.winner = winner;
		this.result = result;
	}
	
	public static String goFight(Pokemon userPoke, Pokemon iAPoke, String userAction) {
		return ("Le pokemon du dresseur " + userPoke.getNickName() + userAction + " et le pokemon de l'ordinateur " + iAPoke.getNickName() + getIaAcion());
	}
	public static String iAaction(int actionTypeNumber) {
		if (actionTypeNumber <10) {
			return "attaque";
		} else if (actionTypeNumber>10 && actionTypeNumber<20) {
			return "sa capacité " +iAPoke.getCapacity();
		} else {
			return "de passer son tour";
		}
	}
	
	public static String getIaAcion() {
		int actionTypeNumber = ran.nextInt(29)+1;
		int succesRate = ran.nextInt(99)+1;
		int critiqRate = ran.nextInt(99)+1;
		
		return ("IA a décidé " + iAaction(actionTypeNumber));
	}

	/**
	 * @return the userPoke
	 */
	public Pokemon getUserPoke() {
		return userPoke;
	}

	/**
	 * @param userPoke the userPoke to set
	 */
	public void setUserPoke(Pokemon userPoke) {
		this.userPoke = userPoke;
	}

	/**
	 * @return the iAPoke
	 */
	public Pokemon getiAPoke() {
		return iAPoke;
	}

	/**
	 * @param iAPoke the iAPoke to set
	 */
	public void setiAPoke(Pokemon iAPoke) {
		this.iAPoke = iAPoke;
	}

	/**
	 * @return the winner
	 */
	public String getWinner() {
		return winner;
	}

	/**
	 * @param winner the winner to set
	 */
	public void setWinner(String winner) {
		this.winner = winner;
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

	@Override
	public String toString() {
		return "FightOn [userPoke=" + userPoke + ", iAPoke=" + iAPoke + ", winner=" + winner + ", result=" + result
				+ "]";
	};
	


}
