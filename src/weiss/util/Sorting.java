package weiss.util;

// Insertion sort method
// The given version works with Comparable objects
// You must add an additional version of insertion sort to work with functors
// Your new version must therefore accept a functor as its second argument

public final class Sorting {
    

    public static <AnyType> void insertionSort(ArrayList<AnyType> a, Comparator<AnyType> cmp) {
        for (int p = 1; p < a.size(); p++) {
            AnyType tmp = a.get(p);
            int j;

            for (j = p; j > 0 && cmp.compare(tmp, a.get(j - 1)) < 0; j--) {
                a.set(j, a.get(j - 1));
            }
            a.set(j, tmp);
        }
    }

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
}