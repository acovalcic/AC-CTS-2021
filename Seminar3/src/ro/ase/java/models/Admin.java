package ro.ase.java.models;

import ro.ase.java.interfaces.UserService;

public class Admin extends User implements UserService {
	
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
		if(user.equals("admin") && password.equals("@dmin")) {
			System.out.println("Welcome admin!");
		} else {
			System.out.println("Invalid credentials!");
		}
	}
}
