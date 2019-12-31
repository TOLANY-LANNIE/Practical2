import weiss.util.*;
import Customers.*;

// This is quite similar to the given Customer ArrayList example in Problem 1
	// but now it uses a doubly-linked LinkedList (from package weiss.util)
	// with dummy header and tail nodes

// Problem 2, Task A:
// Complete the code for class SortedList, which extends the class LinkedList:
// In class SortedList override the indicated add method for the new sorted list
	// Each time an item is added, add it in the correct ascending sorted position
	// Customers are comparable, so sort using the compareTo method
// Add the code below to print the customer list using an iterator

public class Pr2a {

	public static void main(String[] args) {

		// Add some customers to a linked list
		LinkedList CustList = new SortedList();
		CustList.add(new Customer("John",15,"Randburg",200));
		CustList.add(new Customer("Moya",25,"Randfontein",200));								CustList.add(new Customer("Sue",44,"Roodepoort",100));
		CustList.add(new Customer("Mpho",23,"Randburg",250));
		CustList.add(new Customer("JJ",25,"Soweto",250));	
		CustList.add(new Customer("Ashley",28,"Sandton",250));

		System.out.println("Customers list (sorted by age):");
		// Print the linked list using an iterator
                for (int p = 1; p < CustList.size(); p++) {
                    Customer tmp = (Customer)CustList.get(p);
                    int j;

                   for (j = p; j > 0 && tmp.compareTo((Customer)CustList.get(j - 1)) < 0; j--) {
                       CustList.set(j, CustList.get(j - 1));
                     }
                     CustList.set(j, tmp);
                 }
                Iterator<Customer>  itr = CustList.iterator(); 


		//Displaying the value after iterating through the list
                 while(itr.hasNext()){
                   System.out.println(itr.next()+"\n");
                 }


	}
}