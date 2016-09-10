package sortAlgorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

/**
 * Created by Rackdon on 27/8/16.
 */
public class QuicksortImpl implements Sort {

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> arr) {
        return quickSort(arr, 0, arr.size() - 1);
    }

    @Override
    public int[] sort(int[] arr) {
        return quickSort(arr, 0, arr.length - 1);
    }

    private ArrayList<Integer> quickSort(ArrayList<Integer> arr, int left, int right) {
        if (left < right) {
            int p = partition(arr, left, right);
            quickSort(arr, left, p);
            quickSort(arr, p + 1, right);
        }
        return arr;
    }

    private int[] quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int p = partition(arr, left, right);
            quickSort(arr, left, p);
            quickSort(arr, p + 1, right);
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

    private void swap(ArrayList<Integer> arr, int left, int right) {
        Collections.swap(arr, left, right);
    }

    private void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
