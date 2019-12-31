import weiss.util.*;

// Problem 2
// This class extends the LinkedList<AnyType> class
// AND also makes AnyType a Comparable type
// Items are added in their correct ascending sort order

// Task A:
// Override the inherited add method from LinkedList that is included below
// so that new items are added in descending sorted order (items are Comparable)

// Task B:
// Override the inherited set method to remove the item at position idx
// and add the new node in its correct sorted position instead


public class SortedList<AnyType extends Comparable<? super AnyType>> extends LinkedList<AnyType> {

	@Override
    public AnyType set( int idx, AnyType newVal )
    {
	// Delete the item at position idx,
	// then add the new item in its sorted position using your new add method 
	// This method returns the value that was removed
		if(idx < 0 || idx > size())
			throw new IndexOutOfBoundsException("Index greater that the size of list or less than minumum index ");
		AnyType oldValue = get(idx);
		remove(idx);
		add(idx, newVal);
		return oldValue;
    }

    /* Adds an item to this collection, at specified position.
     * Items at or after that position are slid one position higher.
     * @param x any object.
     * @param idx position to add at.
     * @throws IndexOutOfBoundsException if idx is not between 0 and size(), inclusive.
     */
	@Override
    public void add( int idx, AnyType x )
    {
		if(idx < 0 || idx > size())
			throw new IndexOutOfBoundsException("Index greater that the size of list or less than minumum index "); 		
	// Find the correct position to add the new item
	// NB. create and use an iterator to find the correct position
	// Then call the inherited add method to add the item at that position
		int pos = 0;
		while(pos < size() && get(pos).compareTo(x)  >  0)
			++pos;
		//by the end of the while loop we have the correct position in pos so we add there.
	// call the inherited method to add at the position found above
		super.add(pos, x );
    }
    
}