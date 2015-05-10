/**
  * @author Jennifer
 */
package battleship.gamepanel;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
//import java.util.ArrayList;

/**import from the project*/
import battleship.serveur.PlayersIn;
import battleship.client.Users;

/**LobbyPanel : Is the class whitch set the lobby panel view */
public class LobbyPanel extends JFrame {
	
	static final long serialVersionUID=0;
	/** Constructeur de la fenètre*/
	//Récupérer la liste des playersIn (serveur)
	public PlayersIn P_ingame;
	public Users player1 = new Users("Test1","Thread1");
	
	LobbyPanel(){	
		//TODO Modifier le titre de la fenètre
		setTitle("Waiting room : Find your opponent");
		//TODO Modifier la taille de ma fenètre
		setSize(400,400);
		//TODO Taille non modifiable par l'utilisateur
		setResizable(false);
		
		/**Création des objets de la fenètre*/
		
		//Définir le contenu de ma fenètre
		JFrame playerLobby = new JFrame("Lobby");
		JLabel welcom = new JLabel("Welcom " + player1.getUserName() + "Your game id is " + player1.getConnection() + ".");
		JButton joinPlayer = null, decoServer = null, createGame = null;
		JLabel l_jPla = new JLabel("Join this player");
		JLabel l_deco = new JLabel("Quit Server");
		JLabel l_pIn = new JLabel("Players connected");
		JList<PlayersIn> playersIn = new JList<PlayersIn>();
		new JLabel("Select your opponent:");
		JComboBox<Users> chooseOpponent = new JComboBox<Users>();
		new JLabel("Players in Game");
		//TODO Add the JList Contents 
		JList<PlayersIn> playersInGame = new JList<PlayersIn>();
		
		/** Contenus de la fenètre */
		//TODO Ajouter le contenus à la fenètre.
		playerLobby.add(welcom, BorderLayout.PAGE_START);
		playerLobby.add(playersIn,BorderLayout.EAST);
		playerLobby.add(playersInGame,BorderLayout.WEST);
		
		chooseOpponent.setMaximumRowCount(5);
		playerLobby.add(chooseOpponent,BorderLayout.BEFORE_LINE_BEGINS);
		
		playerLobby.add(l_jPla, BorderLayout.SOUTH);
		playerLobby.add(joinPlayer, BorderLayout.LINE_END);
		playerLobby.add(l_pIn, BorderLayout.SOUTH);
		playerLobby.add(createGame, BorderLayout.LINE_END);
		playerLobby.add(l_deco, BorderLayout.SOUTH);
		playerLobby.add(decoServer, BorderLayout.LINE_END);
		//Fermeture par défaut de la fenètre
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}
}
