package battleship.gamepanel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
//import java.util.ArrayList;
import javax.swing.JTextField;

import battleship.client.Users;
import battleship.frame.ConnectMenuFrame;
import battleship.serveur.PlayersIn;

public class ConnectPanel extends JPanel implements ActionListener{
	
	static final long serialVersionUID=0;
	/** Membres */
	//Récupérer la liste des playersIn (serveur)
	//public PlayersIn P_ingame;
	//public Users player1 = new Users("Test1","Thread1");
	private JButton joinServer = new JButton("Connetion");
	//Définir le contenu de ma fenètre
	//Fenêtre de connexion
	//private JFrame ConnectToServ = new JFrame("Connection to server");
	//Bouton connecter ou quitter
	private JLabel l_jjs = new JLabel("Join this player");
	private JLabel l_deco = new JLabel("Quit Server");
	private JButton decoServer = new JButton("Quitter");
	//Welcom 
	private JLabel welcom = new JLabel("You going to join à game .");
	//username
	private JLabel l_EnterName = new JLabel("Enter your name");
	private JTextField TF_username = new JTextField();
					
	/** Constructeur de la fenètre*/
	
	public ConnectPanel(ConnectMenuFrame ConnectToServ) {
		
		//TODO Modifier le titre de la fenètre
		setName("Connection : Enter your nickname");
		//TODO Modifier la taille de ma fenètre
		setSize(300,300);
		//TODO Taille non modifiable par l'utilisateur
		//setResizable(false);
		/**Création des objets de la fenètre*/
		joinServer.addActionListener(this);
		
		/** Contenus de la fenètre */
		//TODO Ajouter le contenus à la fenètre.
		ConnectToServ.add(welcom, BorderLayout.PAGE_START);
		//Saisi de l'id
		ConnectToServ.add(l_EnterName,BorderLayout.EAST);
		ConnectToServ.add(TF_username,BorderLayout.WEST);
		//Bouton join
		ConnectToServ.add(l_jjs, BorderLayout.SOUTH);
		ConnectToServ.add(joinServer, BorderLayout.LINE_END);
		//Bouton déco
		ConnectToServ.add(l_deco, BorderLayout.SOUTH);
		ConnectToServ.add(decoServer, BorderLayout.LINE_END);
		//Fermeture par défaut de la fenètre
	}
	
	public void actionPerformed(ActionEvent e) { 
		
		if(e.getSource() == joinServer) {
			//player1.setUserName(TF_username.getText());
		}

	}
}
