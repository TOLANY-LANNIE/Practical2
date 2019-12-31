import weiss.util.*;
import Customers.*;

// This class shows an example of using an ArrayList
// to create and print a list of Customer objects
// Use this as an example for Problem 1

public class Prob1Example {

	public static void main(String[] args) {

		// Add some customers to an arraylist
		ArrayList CustList = new ArrayList();
		CustList.add(new Customer("John",15,"Randburg",200));
		CustList.add(new Customer("Moya",25,"Randfontein",200));								CustList.add(new Customer("Sue",44,"Roodepoort",100));
		CustList.add(new Customer("Mpho",23,"Randburg",250));									CustList.add(new Customer("JJ",25,"Soweto",250));	
		CustList.add(new Customer("Ashley",28,"Sandton",250));
	
		// Print the arraylist 
		System.out.println("\nThe unsorted list of customers:");
		for(int pos=0; pos<CustList.size(); pos++) 
			System.out.println(CustList.get(pos).toString());
			
	}
}