package ex_6;

import java.util.List;

public class InsertionSort {

    public static List<Integer> insertionSort(List<Integer> sort) {

        int swap;

        for (int i = 1; i < sort.size(); i++) {
            swap = sort.get(i);
            int j = i;
            while (j > 0 && sort.get(j - 1) > swap) {
                sort.set(j, sort.get(j - 1));
                j--;
            }

            sort.set(j, swap);
        }
        return sort;

    }

}
