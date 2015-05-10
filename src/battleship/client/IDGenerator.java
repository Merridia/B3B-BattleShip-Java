/**
  * @author Jennifer
 */

package battleship.client;

import java.util.UUID;
import java.util.ArrayList;

public class IDGenerator {
	
	public static ArrayList<String> UsedID;

	public static String generateUniqueId() {		
	        UUID idUserIn = UUID.randomUUID();
	        String idGenerate=""+idUserIn;        
	        int uId=idGenerate.hashCode();
	        String filterStr=""+uId;
	        idGenerate=filterStr.replaceAll("-", "");
	        
	        if (UsedID.contains(idGenerate) == false) {
		        
	        	UsedID.add(idGenerate);
		        return idGenerate;
	        }
	        else idGenerate = idGenerate + "RW";
	        
	        return idGenerate;
	    }
	
	public static void destroyeID(String user){
		
		if (UsedID.isEmpty()){
			System.err.println("No Client registred in this list");
		}
		else
		UsedID.remove(user);
	}
	
}
