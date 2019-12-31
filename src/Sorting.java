import Customers.*;
import weiss.util.*;

// Problem 1, Task B:
// Insertion sort method provided sorts an arraylist of comparable objects
// You must complete the  quicksort method to work with functors
// Your  version must therefore accept a functor as its second argument

public final class Sorting {
    

   
    public static <AnyType extends Comparable<? super AnyType>> void insertionSort(ArrayList<AnyType> a) {
        for (int p = 1; p < a.size(); p++) {
            AnyType tmp = a.get(p);
            int j;
            for (j = p; j > 0 && tmp.compareTo(a.get(j - 1)) < 0; j--) {
                a.set(j, a.get(j - 1));
            }
            a.set(j, tmp);
        }
    }

    public static <AnyType> void quicksort(ArrayList<AnyType> a, Comparator<? super AnyType> cmp) {
        quicksort(a, cmp, 0, a.size());
    }

    public static <AnyType> void quicksort(ArrayList<AnyType> a, Comparator<? super AnyType> cmp, int low, int high) {
        //Wtrite your code here
        if(low<high){
            //Pick a pivot and place it at position high
            int middle =(low+high)/2;
            swapReferences(a,middle,high);
            AnyType pivot = a.get(high);
            
            //Begin the partitioning
            int i,j;    // i is the left cursor and j is the right cursor
            for(i=low-1,j=high;;){
               while(cmp.compare(a.get(++i), pivot)<0);
               while(j > 0 && (cmp.compare(a.get(--j), pivot)>0));
               if(i>=j)
                   break;
               swapReferences(a,i,j);
         
            }
            //Restoing pivot
            swapReferences(a,i,high);
            
            quicksort(a,cmp,low,i-1);
            quicksort(a,cmp,i+1,high);
        }
        
    }

    private static <AnyType> void swapReferences (ArrayList<AnyType> list, int i, int j) {
        AnyType temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);
    }
}