package Customers;
/*
 * Comparator.java
 */

public interface Comparator<AnyType> {
    /**
     * Return the result of comparing lhs and rhs.
     * @param lhs first object.
     * @param rhs second object.
     * @return < 0 if lhs is less than rhs,
     *           0 if lhs is equal to rhs,
     *         > 0 if lhs is greater than rhs.
     */
    int compare( AnyType lhs, AnyType rhs );
}
