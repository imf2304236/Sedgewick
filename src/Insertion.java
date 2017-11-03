/**
 * Sedgewick
 * Created by IF on 03.11.17.
 */
public class Insertion {
    /**
     * Sort method
     * @param a Array of Comparables
     */
    public static void sort(Comparable[] a) {

    }

    /**
     * Less helper method
     * @param v Comparable object to be compared to
     * @param w Comparable object to be compared
     * @return Boolean true if v < w, false otherwise
     */
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /**
     * Exchange helper method
     * @param a Array of Comparables to which the objects to be exchanged belong
     * @param i Int array index of first object to be exchanged
     * @param j Int array index of second object to be exchanged
     */
    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    /**
     * Method which checks if an array is sorted
     * @param a Array of Comparables to be checked
     * @return Boolean true if the array is sorted, false otherwise
     */
    public static boolean isSorted(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
            if (less(a[i], a[i-1])) {
                return false;
            }
        }
        return true;
    }

    /**
     * Method which prints each member of the array on a single line
     * @param a Array of Comparables to be printed
     */
    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    /**
     * Main method to run tests
     * @param args Array of strings to define test behavior
     */
    public static void main(String[] args) {

    }
}
