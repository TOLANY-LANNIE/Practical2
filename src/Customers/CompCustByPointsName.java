package Customers;

// Problem 1, Task C:
// Complete the code below.
// This functor must first compare Customers by their loyalty points.
// However, there might then be multiple customers with the same number of loyalty points,
// so these must then be sorted alphabetically by their names

public class CompCustByPointsName implements Comparator<Customer> {

	public int compare(Customer lhs, Customer rhs) {
          if(lhs.loyaltyPoints ==rhs.loyaltyPoints){
             return lhs.name.compareTo(rhs.name);
          }
          return lhs.loyaltyPoints - rhs.loyaltyPoints;
	}
}
