package Algorithms.Sorting;

import java.util.ArrayList;
import java.util.List;

public class BubbleSortAlgo {

    public static void bubbleSortAlgo (List<Integer> arr) {
        int x = arr.size();
        for (int i = 0; i < x - 1; i++) {
            for (int j = 0; j < x - i - 1; j++) {
                if (arr.get(j) > arr.get(j+1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j+1));
                    arr.set(j+1, temp);
                }
            }
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

        bubbleSortAlgo(testList);

        System.out.println(testList);
    }

}
