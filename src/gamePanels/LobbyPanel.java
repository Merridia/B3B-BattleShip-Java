package gamePanels;

import javax.swing.JFrame;

public class LobbyPanel extends JFrame {
	
	static final long serialVersionUID=0;
	
	//TODO Constructeur de la fen�tre
	public LobbyPanel(){
		//TODO Modifier le titre de la fen�tre
		setTitle("Wainting room : Find your opponent");
		//TODO Modifier la taille de ma fen�tre
		setSize(400,400);
		//TODO Taille non modifiable par l'utilisateur
		setResizable(false);
		//TODO Rajouter le contenu de ma fen�tre
		
		//TODO Fermeture par d�faut de la fen�tre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	

	
	
	

}
