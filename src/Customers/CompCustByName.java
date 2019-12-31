package Customers;

// Problem 1, Task B:
// Complete the code below.
// This functor must compare Customers alphabetically by their names

public class CompCustByName implements Comparator<Customer> {

	public int compare(Customer lhs, Customer rhs) {

               return lhs.name.compareTo(rhs.name);
	}

}
