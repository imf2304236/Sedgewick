/**
 * Sedgewick
 * Created by IF on 03.11.17.
 */
public class Selection {
    /**
     * Sort method
     * @param a Array of Comparables
     */
    public static void sort(Comparable[] a) {

    }

    /**
     * Less helper function
     * @param v Comparable object to be compared to
     * @param w Comparable object to be compared
     * @return Boolean true if v < w, false otherwise
     */
    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    /**
     * Exchange helper function
     * @param a Array of Comparables to which the objects to be exchanged belong
     * @param i Int array index of first object to be exchanged
     * @param j Int array index of second object to be exchanged
     */
    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }


}
