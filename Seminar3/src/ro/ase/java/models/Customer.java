package ro.ase.java.models;

import ro.ase.java.interfaces.UserServiceA;

public class Customer extends User implements UserServiceA, Cloneable {
	
	private String fullName;
	
	public Customer() {
		
	}
	
	public Customer(String username, String password, String fullName) {
		super(username, password);
		this.fullName = fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getFullName() {
		return this.fullName;
	}

	@Override
	public void authenticate(String user, String password) {
		// TODO Auto-generated method stub
		if(user.equals("customer") && password.equals("p@ssw0rd")) {
			System.out.println("Authenticated succesfully.");
		} else {
			System.out.println("Invalid credentials!");
		}
	}

	@Override
	public Customer clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Customer copy = null;
		copy = (Customer) super.clone();
		copy.setUsername(this.getUsername());
		copy.setPassword(this.getPassword());
		copy.setFullName(this.fullName);
		return copy;
	}
	
	
}
