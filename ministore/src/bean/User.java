package bean;

import java.sql.Date;

public abstract class User {
	protected String email;
	protected String password;
	protected String name;
	protected Date birthDay;
	protected int level;
	protected String phoneNumber;
	protected String image;
	protected boolean active;
	protected String idStore;
	protected String idSalary;





	public User(String email, String password, String name, Date birthDay, int level, String phoneNumber, String image,
			boolean active, String idStore, String idSalary) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.birthDay = birthDay;
		this.level = level;
		this.phoneNumber = phoneNumber;
		this.image = image;
		this.active = active;
		this.idStore = idStore;
		this.idSalary = idSalary;
	}


	public String getIdStore() {
		return idStore;
	}


	public void setIdStore(String idStore) {
		this.idStore = idStore;
	}


	public String getIdSalary() {
		return idSalary;
	}


	public void setIdSalary(String idSalary) {
		this.idSalary = idSalary;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	

}
