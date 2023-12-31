package Algorithms.Sorting;

import java.util.ArrayList;
import java.util.List;

public class InsertionSortAlgo {

    public static void insertionSortAlgo(List<Integer> arr) {
        int x = arr.size();
        for (int i = 0; i < x; i++) {
            int key = arr.get(i);
            int j = i - 1;

            while (j >= 0 && arr.get(j) > key) {
                arr.set(j+1, arr.get(j));
                j = j - 1;
            }

            arr.set(j+1, key);
        }
    }

    public static void main(String[] args) {
        List<Integer> testList = new ArrayList<>();
        testList.add(4);
        testList.add(9);
        testList.add(1);
        testList.add(15);
        testList.add(3);

        System.out.println(testList);

        insertionSortAlgo(testList);

        System.out.println(testList);
    }

}