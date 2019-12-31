package Customers;

// Problem 1, Task B:
// Complete the code below.
// This functor must compare Customers by loyalty points

public class CompCustByPoints implements Comparator<Customer> {

	public int compare(Customer lhs, Customer rhs) {

          return lhs.loyaltyPoints - rhs.loyaltyPoints;

	}
}
