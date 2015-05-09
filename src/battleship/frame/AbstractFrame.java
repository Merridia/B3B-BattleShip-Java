package battleship.frame;

import javax.swing.JFrame;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

import battleship.controller.Controller;

public abstract class AbstractFrame 
{
	private JFrame mainFrame;
	
	private Controller controller;
	
	public AbstractFrame (Controller controllerMain)
	{
		controller = controllerMain;
		mainFrame = new JFrame();
		defaultFrameBehaviour();
	}
	
	// Getters & Setters
	public JFrame getMainFrame() {
		return mainFrame;
	}

	public void setMainFrame(JFrame mainFrame) {
		this.mainFrame = mainFrame;
	}

	public Controller getController() {
		return controller;
	}

	public void setController(Controller controller) {
		this.controller = controller;
	}


	//Fermeture de la fen�tre
	public void closeView ()
	{
		mainFrame.dispose();
	}
	
	// Comportement par d�faut de la fen�tre
	private void defaultFrameBehaviour ()
	{
		mainFrame.setTitle(getTitle());
		mainFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	}
	
	public void display()
	{
		mainFrame.setVisible(true);
	}
	
	public void hide()
	{
		mainFrame.setVisible(false);
	}
	
	// M�thode abstraite devant �tre red�fini par les frames h�riti�res
	public abstract String getTitle();
}
