package ro.ase.java.models;

import ro.ase.java.interfaces.UserServiceA;

public class Admin extends User implements UserServiceA {
	public String companyName;
	
	public Admin() {
		
	}
	
	public Admin(String username, String password, String companyName) {
		super(username, password);
		this.companyName = companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String getCompanyName() {
		return this.companyName;
	}

	@Override
	public void authenticate(String user, String password) {
		// TODO Auto-generated method stub
		if(user.equals("admin") && password.equals("@dmin")) {
			System.out.println("Welcome admin!");
		} else {
			System.out.println("Invalid credentials!");
		}
	}
}
