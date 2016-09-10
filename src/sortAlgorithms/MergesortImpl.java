package sortAlgorithms;


import java.util.ArrayList;
import java.util.Optional;

/**
 * Created by Rackdon on 30/8/16.
 */
public class MergesortImpl implements Sort {

    @Override
    public ArrayList<Integer> sort(ArrayList<Integer> arr, Optional<Integer> left, Optional<Integer> right) {
        if (arr.size() == 1) {
            return arr;
        } else {
            int mid = arr.size() / 2;
            ArrayList<Integer> arrLeft = sort(new ArrayList<>(arr.subList(0, mid)), Optional.empty(), Optional.empty());
            ArrayList<Integer> arrRight = sort(new ArrayList<>(arr.subList(mid, arr.size())), Optional.empty(), Optional.empty());
            return merge(arrLeft, arrRight);
        }
    }

    public ArrayList<Integer> merge(ArrayList<Integer> left, ArrayList<Integer> right) {
        ArrayList<Integer> result = new ArrayList();
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
}
