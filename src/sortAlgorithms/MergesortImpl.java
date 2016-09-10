package sortAlgorithms;


import java.util.ArrayList;

/**
 * Created by Rackdon on 30/8/16.
 */
public class MergesortImpl implements Sort {

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> arr) {
        if (arr.size() == 1) {
            return arr;
        } else {
            int mid = arr.size() / 2;
            ArrayList<Integer> arrLeft = sort(new ArrayList<>(arr.subList(0, mid)));
            ArrayList<Integer> arrRight = sort(new ArrayList<>(arr.subList(mid, arr.size())));
            return topDownMerge(arrLeft, arrRight);
        }
    }

    @Override
    public int[] sort(int[] arr) {
        return bottomUpMergeSort(arr, new int[arr.length], arr.length);
    }

    private ArrayList<Integer> topDownMerge(ArrayList<Integer> left, ArrayList<Integer> right) {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> leftList = left;
        ArrayList<Integer> rightList = right;

        while (!leftList.isEmpty() && !rightList.isEmpty()) {
            if (leftList.get(0) <= rightList.get(0)) {
                result.add(leftList.get(0));
                leftList.remove(0);
            } else {
                result.add(rightList.get(0));
                rightList.remove(0);
            }

        }
        while(!leftList.isEmpty()) {
            result.add(leftList.get(0));
            leftList.remove(0);
        }
        while(!rightList.isEmpty()) {
            result.add(rightList.get(0));
            rightList.remove(0);
        }
        return result;
    }

    private int[] bottomUpMergeSort(int[] source, int[] workArr, int n) {
        for (int width = 1; width < n; width = 2 * width) {
            for (int i = 0; i < n; i = i + 2 * width) {
                bottomUpMerge(source, i, Math.min(i+width, n), Math.min(i+2*width, n), workArr);
            }
            copyArr(workArr, source, n);
        }
        return source;
    }

    private void bottomUpMerge(int[] source, int left, int right, int end, int[] workArr) {
        int i = left;
        int j = right;

        for (int k = left; k < end; k++) {
            if (i < right && (j >= end || source[i] <= source[j])) {
                workArr[k] = source[i];
                i = i + 1;
            } else {
                workArr[k] = source[j];
                j = j + 1;
            }
        }
    }

    private void copyArr(int[] workArr, int[] source, int n) {
        for(int i = 0; i < n; i++) {
            source[i] = workArr[i];
        }
    }
}
