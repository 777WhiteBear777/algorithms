package ex_6;

import java.util.List;

public class SelectionSort {

    public void selectionSort(List<Integer> sort) {


        for (int i = 0; i < sort.size(); i++) {

            int pos = i;
            int minNumber = sort.get(i);

            for (int j = i + 1; j < sort.size(); j++) {
                if (sort.get(j) < minNumber) {
                    pos = j;
                    minNumber = sort.get(j);
                }
            }
            sort.set(pos, sort.get(i));
            sort.set(i, minNumber);
        }

    }

}
