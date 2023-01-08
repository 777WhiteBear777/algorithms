package ex_6;

import java.util.List;

public class InsertionSort {

    int swap;

    public void insertionSort(List<Integer> sort) {

        for (int i = 1; i < sort.size(); i++) {
            swap = sort.get(i);
            int j = i;
            while (j > 0 && sort.get(j - 1) > swap) {
                sort.set(j, sort.get(j - 1));
                j--;
            }

            sort.set(j, swap);
        }

    }

}
