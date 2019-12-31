import weiss.util.*;
import Customers.*;

// Problem 1, Task A:
// Complete the code below to:
// Call the insertion sort method provided in class Sorting to sort the list
// Create and use an iterator for printing the list

public class Pr1a {

	public static void main(String[] args) {

		// Add some customers to an arraylist
		ArrayList CustList = new ArrayList();
		CustList.add(new Customer("John",15,"Randburg",200));
		CustList.add(new Customer("Moya",25,"Randfontein",200));						CustList.add(new Customer("Sue",44,"Roodepoort",100));
		CustList.add(new Customer("Mpho",23,"Randburg",250));							CustList.add(new Customer("JJ",25,"Soweto",250));	
		CustList.add(new Customer("Ashley",28,"Sandton",250));

		
		// Sort using the provided insertionSort method
                 Sorting.insertionSort(CustList);

	
		// Print the arraylist using an iterator
                 
                 //create an iterator for the list
                 //using iterator()method
                 Iterator<Customer>  itr = CustList.iterator(); 


		//Displaying the value after iterating through the list
                 while(itr.hasNext()){
                   System.out.println(itr.next()+"\n");
                 }
	}
    }