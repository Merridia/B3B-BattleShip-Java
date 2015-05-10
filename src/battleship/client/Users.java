/**
  * @author Jennifer
 */

package battleship.client;

/** Class User : Assign the User to his connection */
public class Users
{
	/** Membres */
	//Declaration of the id generator we use.
	public IDGenerator generateID = new IDGenerator();
	
	//Client's real Data
	private String userName;
	private String userUniqueId;
	private String userThread;
	
	/** Constructeur */
	public Users(String u_userName, String u_userThread) {
		userName = u_userName;
		userUniqueId = IDGenerator.generateUniqueId();
		userThread = u_userThread;
	}
	/** Methodes */
	//TODO : Disconnect the players = Destroy his ID and all his Data
	
	/** Getter & Setter */
	public String getUserName() {
		return userName;
	}
	public void setUserName(String u_userName) {
		userName = u_userName;
	}
	public String getUserUniqueId() {
		return userUniqueId;
	}
	public void setUserUniqueId(String u_userUniqueId) {
		userUniqueId = u_userUniqueId;
	}
	public String getConnection() {
		return userThread;
	}
	public void setConnection(String u_userThread) {
		userThread = u_userThread;
	}
}