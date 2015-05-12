/**
  * @author Romain & Jennifer
 */
package battleship.frame;

import javax.swing.JFrame;

//import battleship.gamepanel.*;

public class ConnectMenuFrame extends JFrame
{
	static final long serialVersionUID=0;
	
	private ConnectPanel panelConnect;
	
	public ConnectMenuFrame ()
	{
		System.out.println("Je vais créer le connect panel");
		panelConnect = new ConnectPanel();
		System.out.println("connectpanel créé");
		setTitle("Batlleship Connection");
		setSize(400, 400);
		System.out.println("Je vais ajouter "+panelConnect);
		add(panelConnect);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println("panelConnect ajouté");
		setVisible(true);
	}
}
