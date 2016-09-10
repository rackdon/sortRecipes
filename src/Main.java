import sortAlgorithms.MergesortImpl;
import sortAlgorithms.QuicksortImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;

/**
 * Created by Rackdon on 27/8/16.
 */
public class Main {
    public static void main(String[] args) {
        MergesortImpl mergesort = new MergesortImpl();
        QuicksortImpl quicksort = new QuicksortImpl();
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(65, 72, 23, 36, 99, 20, 11, 44));
        System.out.println("Initial Array");
        System.out.println(Arrays.toString(array.toArray()));
        System.out.println("Final Array");
        System.out.println(Arrays.toString(mergesort.sort(array, Optional.empty(), Optional.empty()).toArray()));
//        System.out.println(Arrays.toString(quicksort.sort(array, Optional.of(0), Optional.of(array.size() - 1)).toArray()));
    }
}
