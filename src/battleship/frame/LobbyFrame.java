package battleship.frame;

import java.awt.Component;

import javax.swing.JFrame;

import battleship.gamepanel.*;

public class LobbyFrame extends JFrame
{
	static final long serialVersionUID=0;
	
	public LobbyFrame ()
	{	
	System.out.println("Je vais cr�er le connect panel");
	Component lobbyFrame = new LobbyPanel();
	
	System.out.println( lobbyFrame + "cr��");
	setTitle("Batlleship Lobby");
	setSize(600, 400);
	System.out.println("Je vais ajouter "+ lobbyFrame);
	add(lobbyFrame);

	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	System.out.println("panelConnect ajout�");
	setVisible(true);
	}
}
