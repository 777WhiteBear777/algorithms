package ex_6;

import java.util.List;

public class QuickSort {

    public static List<Integer>  quickSort(List<Integer> sort, int low, int high) {

        int swap;

        if (low >= high) return null;

        int number = sort.get(low + (high - low) / 2);
        int i = low;
        int j = high;

        while (i <= j) {
            while (sort.get(i) < number) {
                i++;
            }
            while (sort.get(j) > number) {
                j--;
            }

            if (i <= j) {
                swap = sort.get(i);
                sort.set(i, sort.get(j));
                sort.set(j, swap);
                i++;
                j--;
            }
        }
        if (low < j) quickSort(sort, low, j);
        if (high > i) quickSort(sort, i, high);

        return sort;
    }


}
