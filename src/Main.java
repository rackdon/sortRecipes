import sortAlgorithms.QuicksortImpl;

import java.util.Arrays;
import java.util.Optional;

/**
 * Created by Rackdon on 27/8/16.
 */
public class Main {
    public static void main(String[] args) {
        QuicksortImpl quicksort = new QuicksortImpl();
        int[] array = {65, 72, 23, 36, 99, 20, 11, 44};
        System.out.println("Initial Array");
        System.out.println(Arrays.toString(array));
        System.out.println("Final Array");
        System.out.println(Arrays.toString(quicksort.sort(array, Optional.of(0), Optional.of(array.length - 1))));
    }
}
