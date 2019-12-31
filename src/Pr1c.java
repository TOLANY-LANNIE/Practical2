import weiss.util.*;
import Customers.*;

// Problem 1, Task C:
// Change your solution to Tasks A&B as follows:
// Complete the code for an extra functor in folder/package "Customers"
	// functor CompCustByPointsName
// Use your new functor in the code below to sort the same list first by points, and then by name
// Also add the code below to create and use an iterator for printing the list

public class Pr1c {

	public static void main(String[] args) {

		// Add some customers to an arraylist
		ArrayList CustList = new ArrayList();
		CustList.add(new Customer("John",15,"Randburg",200));
		CustList.add(new Customer("Moya",25,"Randfontein",200));						CustList.add(new Customer("Sue",44,"Roodepoort",100));
		CustList.add(new Customer("Mpho",23,"Randburg",250));							CustList.add(new Customer("JJ",25,"Soweto",250));	
		CustList.add(new Customer("Ashley",28,"Sandton",250));

		// Sort the arraylist using a functor that first compares by points, then by name
                CompCustByPointsName cpn = new CompCustByPointsName();
                for (int p = 1; p < CustList.size(); p++) {
                    Customer tmp =(Customer)CustList.get(p);
                    int j;
                    for(j=p;j>0&&cpn.compare((Customer)CustList.get(j-1),tmp)>0;j--){
                        CustList.set(j, (Customer)CustList.get(j-1));
                        CustList.set(j-1, tmp);
                    }
                }


		System.out.println("\nCustomers sorted first by points, then by name:");
		// Print the sorted arraylist using an iterator
                Iterator<Customer>  itr = CustList.iterator(); 


		//Displaying the value after iterating through the list
                 while(itr.hasNext()){
                   System.out.println(itr.next()+"\n");
                 }



	}
}