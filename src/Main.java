import sortAlgorithms.MergesortImpl;
import sortAlgorithms.QuicksortImpl;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Rackdon on 27/8/16.
 */
public class Main {
    public static void main(String[] args) {
        MergesortImpl mergesort = new MergesortImpl();
        QuicksortImpl quicksort = new QuicksortImpl();
        int[] array = {65, 72, 23, 36, 99, 20, 11, 44};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(65, 72, 23, 36, 99, 20, 11, 44));
        System.out.println("Initial Array");
        System.out.println(Arrays.toString(arrayList.toArray()));
        System.out.println("Final Array");
//        System.out.println(Arrays.toString(mergesort.sort(arrayList).toArray()));
//        System.out.println(Arrays.toString(quicksort.sort(arrayList).toArray()));
//        System.out.println(Arrays.toString(quicksort.sort(array)));
//        System.out.println(Arrays.toString(mergesort.sort(array)));
    }
}
