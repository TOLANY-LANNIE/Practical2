import weiss.util.*;
import Customers.*;

// Problem 1, Task B:
// Change your solution to Task A as follows:
// To class Sorting add an extra version of insertion sort that uses functors
// Complete the code for the following 2 functors in folder/package "Customers"
	// functor CompCustByPoints
	// functor CompCustByName
// Complete the code below to use functors for sorting either by points, or by name
// Complete the code below to create and use an iterator for printing the list

public class Pr1b {

	public static void main(String[] args) {

		// Add some customers to an arraylist
		ArrayList CustList = new ArrayList();
		CustList.add(new Customer("John",15,"Randburg",200));
		CustList.add(new Customer("Moya",25,"Randfontein",200));								CustList.add(new Customer("Sue",44,"Roodepoort",100));
		CustList.add(new Customer("Mpho",23,"Randburg",250));									CustList.add(new Customer("JJ",25,"Soweto",250));	
		CustList.add(new Customer("Ashley",28,"Sandton",250));


		// Do insertion sort on the arraylist using functor "CompCustByPoints"
                CompCustByPoints cp = new CompCustByPoints();
                for (int p = 1; p < CustList.size(); p++) {
                    Customer tmp =(Customer)CustList.get(p);
                    int j;
                    for(j=p;j>0&&cp.compare((Customer)CustList.get(j-1),tmp)>0;j--){
                        CustList.set(j, (Customer)CustList.get(j-1));
                        CustList.set(j-1, tmp);
                    }
 
                }
                
		System.out.println("\nCustomers sorted with functor - loyalty points:");
		// Print the sorted arraylist using an iterator
                Iterator<Customer>  itr = CustList.iterator(); 


		//Displaying the value after iterating through the list
                 while(itr.hasNext()){
                   System.out.println(itr.next()+"\n");
                 }


		// Do insertion sort on the arraylist using functor "CompCustByName"
		
               CompCustByName cn = new CompCustByName();
                for (int p = 1; p < CustList.size(); p++) {
                    Customer tmp =(Customer)CustList.get(p);
                    int j;
                    for(j=p;j>0&&cn.compare((Customer)CustList.get(j-1),tmp)>0;j--){
                        CustList.set(j, (Customer)CustList.get(j-1));
                        CustList.set(j-1, tmp);
                    }
 
                }  

		System.out.println("\nCustomers sorted with functor - by their names:");	
		// Print the sorted arraylist using an iterator
                   Iterator<Customer>  itr1 = CustList.iterator(); 


		//Displaying the value after iterating through the list
                 while(itr1.hasNext()){
                   System.out.println(itr1.next()+"\n");
                 }
                   

		
	}
}