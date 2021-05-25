package bean;

import java.sql.Date;
import java.util.ArrayList;

public class Owner extends User {
	private ArrayList<Inventory> listInventory;
	public Owner(String email, String password, String name, Date birthDay, int level, String phoneNumber, String image,
			boolean active, String idStore, String idSalary) {
		super(email, password, name, birthDay, level, phoneNumber, image, active, idStore, idSalary);
		this.listInventory = listInventory;
	}
	public Owner() {
		
	}


	
	public ArrayList<Inventory> getListInventory() {
		return listInventory;
	}

	public void setListInventory(ArrayList<Inventory> listInventory) {
		this.listInventory = listInventory;
	}

}
