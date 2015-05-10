/**
  * @author Jennifer
 */
package battleship.serveur;

import java.net.Socket;
import java.util.ArrayList;



/** import from the project */
import battleship.client.*;

/** List of players connect to the serveur (with soccet or not) */
public class PlayersIn{
	/** Membres */
	ArrayList<Users> UserIn = new ArrayList<Users>();
	
	/** Constructeur */
	public PlayersIn(Users thePlayer, Socket theThread) {
		thePlayer.setConnection(theThread.toString());
		UserIn.add(thePlayer);
	}
	/** Methodes */
	
	/** Getter & Setter */
	public ArrayList<Users> getUserIn() {
		return UserIn;
	}
	
	public void setUserIn(ArrayList<Users> userIn) {
		UserIn = userIn;
	}
}