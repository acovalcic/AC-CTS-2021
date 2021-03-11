package ro.ase.java;
import ro.ase.java.models.Admin;
import ro.ase.java.models.Customer;

public class Application {
	
	public static void main(String[] args) {
		Customer c1 = new Customer("customer", "p@ssw0rd", "John Doe");
		Admin a1 = new Admin("admin", "@dmin", "Jane Dane");
		System.out.println(c1.getFullName() + " " + c1.getUsername() + " " + c1.getPassword());
		System.out.println(a1.getCompanyName() + " " + a1.getUsername() + " " + a1.getPassword());
		c1.authenticate("customer", "p@ssw0rd");
		a1.authenticate("admin", "@dmin");
		try {
			Customer c2 = c1.clone();
			c2.setPassword("test");
			System.out.println(c1.getPassword());
			System.out.println(c2.getPassword());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
