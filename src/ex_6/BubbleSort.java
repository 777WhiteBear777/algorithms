package ex_6;

import java.util.List;

public  class BubbleSort {

    int swap;

    public void bubbleSort(List<Integer> sort) {
        for (int i = 0; i < sort.size() - 1; i++) {
            for (int j = 0; j  < sort.size() - i - 1; j++) {
                if (sort.get(j + 1) < sort.get(j)) {
                    swap = sort.get(j);
                    sort.set(j, sort.get(j + 1));
                    sort.set(j + 1, swap);
                }
            }
        }

    }

}
