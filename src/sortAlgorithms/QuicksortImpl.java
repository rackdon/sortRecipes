package sortAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

/**
 * Created by Rackdon on 27/8/16.
 */
public class QuicksortImpl implements Sort {

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> arr, Optional<Integer> left, Optional<Integer> right) {
        if (left.get() < right.get()) {
            int p = partition(arr, left.get(), right.get());
            sort(arr, left, Optional.of(p));
            sort(arr, Optional.of(p + 1), right);
        }
        return arr;
    }

    private int partition(ArrayList<Integer> arr, int left, int right) {
        int pivotPosition = getMedianOfThree(arr, left, right);
        int i = left;
        int j = right;
        while (i < j) {
            while (arr.get(i) < arr.get(pivotPosition)) {
                i++;
            }
            while (arr.get(j) > arr.get(pivotPosition)) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        return pivotPosition;
    }

    private int getMedianOfThree(ArrayList<Integer> arr, int left, int right) {
        int mid = (left + right) / 2;
        if (arr.get(right) < arr.get(left)) {
            swap(arr, left, right);
        }
        if (arr.get(mid) < arr.get(left)) {
            swap(arr, mid, left);
        }
        if (arr.get(right) < arr.get(mid)) {
            swap(arr, right, mid);
        }
        return mid;
    }

    private void swap(ArrayList<Integer> arr, int left, int right) {
        Collections.swap(arr, left, right);
    }
}
