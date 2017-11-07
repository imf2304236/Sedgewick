/**
 * Sedgewick
 * Created by IF on 03.11.17.
 */
public class Main {
    public static void main(String[] args) {
        Comparable[] test = new Comparable[9];
        test[0] = "it";
        test[1] = "it";
        test[2] = "was";
        test[3] = "best";
        test[4] = "the";
        test[5] = "of";
        test[6] = "times";
        test[7] = "ever";
        test[8] = "seen";

        Comparable[] selectionTest = test;
        Comparable[] insertionTest = test;
        Comparable[] mergeTest = test;

        Selection.sort(selectionTest);
        Insertion.sort(selectionTest);
        Merge.sort(selectionTest);
    }
}
