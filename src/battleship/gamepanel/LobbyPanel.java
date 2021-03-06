/**
  * @author Jennifer
 */
package battleship.gamepanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.util.ArrayList;



/**import from the project*/
//import battleship.serveur.PlayersIn;
//import battleship.client.Users;

/**LobbyPanel : Is the class whitch set the lobby panel view */
public class LobbyPanel extends javax.swing.JPanel implements ActionListener {
	
	static final long serialVersionUID=0;
    // Variables declaration - do not modify                     
    private javax.swing.JToggleButton B_JoinPlayer;
    private javax.swing.JButton B_Quitt;
    private javax.swing.JButton B_createGame;
    @SuppressWarnings("rawtypes")
	private javax.swing.JComboBox CB_ChooseOpponent;
    private javax.swing.JSeparator jSeparator1;
    //private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel l_Create;
    private javax.swing.JLabel l_choose;
    private javax.swing.JLabel l_message;
    private javax.swing.JLabel l_welcom;
    // End of variables declaration                   

	    /**
	     * Creates new form LobbyPanel
	     */
	    public LobbyPanel() {
	        initComponents();
	    }

	    /**
	     * This method is called from within the constructor to initialize the form.
	     * WARNING: Do NOT modify this code. The content of this method is always
	     * regenerated by the Form Editor.
	     */
	    @SuppressWarnings({ "unchecked", "rawtypes" })
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	    private void initComponents() {

	        //jSeparator2 = new javax.swing.JSeparator();
	        l_welcom = new javax.swing.JLabel();
	        l_message = new javax.swing.JLabel();
	        CB_ChooseOpponent = new javax.swing.JComboBox();
	        l_choose = new javax.swing.JLabel();
	        B_JoinPlayer = new javax.swing.JToggleButton();
	        B_createGame = new javax.swing.JButton();
	        l_Create = new javax.swing.JLabel();
	        jSeparator1 = new javax.swing.JSeparator();
	        jSeparator3 = new javax.swing.JSeparator();
	        B_Quitt = new javax.swing.JButton();

	        l_welcom.setText("Welcom USER");

	        l_message.setText("You can find your opponent or create a Playing Room. Have a good game");

	        CB_ChooseOpponent.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

	        l_choose.setText("Choose your opponent here");

	        B_JoinPlayer.setText("Join the game!");
	        B_JoinPlayer.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                B_JoinPlayerActionPerformed(evt);
	            }
	        });

	        B_createGame.setText("Create a game");
	        B_createGame.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                B_createGameActionPerformed(evt);
	            }
	        });

	        l_Create.setText("Or create a game here: ");

	        B_Quitt.setText("Exit the server");
	        B_Quitt.addActionListener(new java.awt.event.ActionListener() {
	            public void actionPerformed(java.awt.event.ActionEvent evt) {
	                B_QuittActionPerformed(evt);
	            }
	        });

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
	        this.setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addGroup(layout.createSequentialGroup()
	                        .addGap(21, 21, 21)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                            .addComponent(l_choose, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(B_JoinPlayer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(CB_ChooseOpponent, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addGroup(layout.createSequentialGroup()
	                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                                    .addGroup(layout.createSequentialGroup()
	                                        .addGap(10, 10, 10)
	                                        .addComponent(l_message))
	                                    .addComponent(l_welcom))
	                                .addGap(0, 12, Short.MAX_VALUE))))
	                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                        .addGap(0, 0, Short.MAX_VALUE)
	                        .addComponent(l_Create)
	                        .addGap(18, 18, 18)
	                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
	                            .addComponent(B_Quitt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(B_createGame, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))))
	                .addGap(10, 10, 10))
	            .addComponent(jSeparator1)
	            .addComponent(jSeparator3)
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addContainerGap()
	                .addComponent(l_welcom)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(l_message)
	                .addGap(18, 18, 18)
	                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(l_choose)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(CB_ChooseOpponent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addComponent(B_JoinPlayer)
	                .addGap(23, 23, 23)
	                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(l_Create)
	                    .addComponent(B_createGame))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(B_Quitt)
	                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        );
	    }// </editor-fold>                        

	    private void B_JoinPlayerActionPerformed(java.awt.event.ActionEvent evt) {                                             
	        // TODO add your handling code here:
	    }                                            

	    private void B_createGameActionPerformed(java.awt.event.ActionEvent evt) {                                             
	        // TODO add your handling code here:
	    }                                            

	    private void B_QuittActionPerformed(java.awt.event.ActionEvent evt) {                                        
	        // TODO add your handling code here:
	    }                                       
		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}