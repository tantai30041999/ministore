package util;

import java.util.Random;

import dao.StoreDAO;
import dao.SupplierDAO;
import dao.UserDAO;

public class GenerateID {
	
    public static String generateIDBillDetail() {
    	String id = "";
    	
    	Random r = new Random();
    	for(int i = 0 ; i < 7 ;i++) {
    	    int number = r.nextInt(9);
    	    id+=number;
    		
    	}
    	return id;
    	
    }
    public static String generateIDSupplier() {
    	String idSupplier = "";
    	String idSupplierLast = SupplierDAO.getLastIdSupplier();
    	for(int i = idSupplierLast.length() -1 ; i >=0; i--) {
    		if(idSupplierLast.charAt(i) =='0') {
    			int number = Integer.parseInt(idSupplierLast.substring(i));
    		
    			idSupplier+= idSupplierLast.substring(0, i+1)+(++number);
    			break;
    		}
    		
    	}
    	return idSupplier;
    	
    }
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
    	System.out.println(generateIDBillDetail());
		
	}
}
