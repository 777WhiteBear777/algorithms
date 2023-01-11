package ex_6;

import java.util.List;

public class ShellSort {

    public static List<Integer>  shellSort(int n, List<Integer> sort) {

        int i, j, step;
        int swap;

        for (step = n / 2; step > 0; step /= 2) {
            for (i = step; i < n; i++) {

                swap = sort.get(i);

                for (j = i; j >= step; j -= step){

                    if(swap <  sort.get(j-step)){
                        sort.set(j,sort.get(j-step));
                    }
                    else break;
                }

                sort.set(j,swap);

            }

        }

        return sort;

    }

}
