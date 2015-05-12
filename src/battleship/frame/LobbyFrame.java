package battleship.frame;

import java.awt.Component;

import javax.swing.JFrame;

import battleship.gamepanel.*;

public class LobbyFrame extends JFrame
{
	static final long serialVersionUID=0;
	
	public LobbyFrame ()
	{	
	System.out.println("Je vais créer le connect panel");
	Component lobbyFrame = new LobbyPanel();
	
	System.out.println( lobbyFrame + "créé");
	setTitle("Batlleship Lobby");
	setSize(600, 400);
	System.out.println("Je vais ajouter "+ lobbyFrame);
	add(lobbyFrame);

	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	System.out.println("panelConnect ajouté");
	setVisible(true);
	}
}
