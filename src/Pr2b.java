import weiss.util.*;
import Customers.*;

// Problem 2, Task B:
// Override another method, the set method, from LinkedList in your new class SortedList
	// The set method changes the value of an existing item
	// But because the list must remain sorted, it must now change so that:
	// The old item is removed, and the new item is added in its correct sorted position
// Also add the code below to print the list using an iterator

public class Pr2b {

	public static void main(String[] args) {
		// Add some customers to a linked list
		LinkedList CustList = new SortedList();
		CustList.add(new Customer("John",15,"Randburg",200));
		CustList.add(new Customer("Moya",25,"Randfontein",200));								CustList.add(new Customer("Sue",44,"Roodepoort",100));
		CustList.add(new Customer("Mpho",23,"Randburg",250));
		CustList.add(new Customer("JJ",25,"Soweto",250));	
		CustList.add(new Customer("Ashley",28,"Sandton",250));

		System.out.println("\nOriginal customer list (sorted by age):");
		// Print the original sorted list using an iterator
                // Print the linked list using an iterator
                for (int p = 1; p < CustList.size(); p++) {
                    Customer tmp = (Customer)CustList.get(p);
                    int j;

                   for (j = p; j > 0 && tmp.compareTo((Customer)CustList.get(j - 1)) < 0; j--) {
                       CustList.set(j, CustList.get(j - 1));
                     }
                     CustList.set(j, tmp);
                 }
                Iterator<Customer>  itr1 = CustList.iterator(); 


		//Displaying the value after iterating through the list
                 while(itr1.hasNext()){
                   System.out.println(itr1.next()+"\n");
                 }
		


		// Replace the element at position 1 with a new value
		Customer newVal = new Customer("Homer",55,"Johannesburg",150);
		Customer oldVal = (Customer) CustList.set(1, newVal);
		System.out.println("\nReplaced: " + oldVal.toString());


		System.out.println("\nUpdated customer list (still sorted by age):");
		// Print the updated sorted list using an iterator
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