package gamePanels;

import javax.swing.JFrame;

public class LobbyPanel extends JFrame {
	
	static final long serialVersionUID=0;
	
	//TODO Constructeur de la fenètre
	public LobbyPanel(){
		//TODO Modifier le titre de la fenètre
		setTitle("Wainting room : Find your opponent");
		//TODO Modifier la taille de ma fenètre
		setSize(400,400);
		//TODO Taille non modifiable par l'utilisateur
		setResizable(false);
		//TODO Rajouter le contenu de ma fenètre
		
		//TODO Fermeture par défaut de la fenètre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	

	
	
	

}
