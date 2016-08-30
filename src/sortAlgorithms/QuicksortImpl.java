package sortAlgorithms;

import java.util.Optional;

/**
 * Created by Rackdon on 27/8/16.
 */
public class QuicksortImpl implements Sort {

    @Override
    public int[] sort(int[] arr, Optional<Integer> left, Optional<Integer> right) {
        if (left.get() < right.get()) {
            int p = partition(arr, left.get(), right.get());
            sort(arr, left, Optional.of(p));
            sort(arr, Optional.of(p + 1), right);
        }
        return arr;
    }

    private int partition(int[] arr, int left, int right) {
        int pivotPosition = getMedianOfThree(arr, left, right);
        int i = left;
        int j = right;
        while (i < j) {
            while (arr[i] < arr[pivotPosition]) {
                i++;
            }
            while (arr[j] > arr[pivotPosition]) {
                j--;
            }
            if (i < j) {
                swap(arr, i, j);
            }
        }
        return pivotPosition;
    }

    private int getMedianOfThree(int[] arr, int left, int right) {
        int mid = (left + right) / 2;
        if (arr[right] < arr[left]) {
            swap(arr, left, right);
        }
        if (arr[mid] < arr[left]) {
            swap(arr, mid, left);
        }
        if (arr[right] < arr[mid]) {
            swap(arr, right, mid);
        }
        return mid;
    }

    private void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
