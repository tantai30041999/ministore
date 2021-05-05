package util;

import dao.StoreDAO;
import dao.UserDAO;

public class GenerateID {
    public static String generateIDUser() {
    	String idUser = "";
    	String idUserLast = UserDAO.getUserIdLast();
    	for(int i = idUserLast.length() -1 ; i >=0; i--) {
    		if(idUserLast.charAt(i) =='0') {
    			int number = Integer.parseInt(idUserLast.substring(i));
    		
    			idUser+= idUserLast.substring(0, i+1)+(++number);
    			break;
    		}
    		
    	}
    	return idUser;
    	
    }
    public static String generateIDStore() {
    	String idStore = "";
    	String idStoreLast = StoreDAO.getStoreIdLast();
    	for(int i = idStoreLast.length() -1 ; i >=0; i--) {
    		if(idStoreLast.charAt(i) =='0') {
    			int number = Integer.parseInt(idStoreLast.substring(i));
    			idStore+= idStoreLast.substring(0, i+1)+(++number);
    			break;
    		}
    		
    	}
    	return idStore;
    }
    public static void main(String[] args) {
    	System.out.println(generateIDUser());
		
	}
}
