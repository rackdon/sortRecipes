package sortAlgorithms;

import java.util.ArrayList;
import java.util.Optional;


/**
 * Created by Rackdon on 27/8/16.
 */
public interface Sort {

    ArrayList<Integer> sort(ArrayList<Integer> arr, Optional<Integer> left, Optional<Integer> right);
}
