package Customers;

// Customer class used in multiple problems. Do not edit this class.
// Customers are comparable. The compareTo method uses age to compare customers.


public final class Customer implements Comparable<Customer> {

	String name;
	int age;
	String city;
	int loyaltyPoints;

	public Customer(String n, int a, String c, int lP) {
		name=n; age=a; city=c; loyaltyPoints=lP;
	}

	public String toString() {
		return "Customer " + name + " from " + city + " is " + age + " years old, and has loyaltypoints of " + loyaltyPoints;
	}

	public int compareTo(Customer rhs) {
		return this.age - rhs.age;
	}
}
