package Algorithms.Searching;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchAlgo {

    // array must be pre sorted - x is target value
    public static int binarySearchAlgo(List<Integer> arr, int x) {
        int index = - 1; // returns -1 if it cannot be found

        int low = 0;
        int high = arr.size()-1;

        while (low <= high) {

            int middle = low + (high - low) / 2;

            if (arr.get(middle) == x) return middle;

            if (arr.get(middle) < x) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        List<Integer> testList = new ArrayList<>();
        testList.add(4);
        testList.add(9);
        testList.add(1);
        testList.add(15);
        testList.add(3);

        Collections.sort(testList);
        System.out.println(testList);

        int index = binarySearchAlgo(testList, 9);
        System.out.println(index);
    }
}