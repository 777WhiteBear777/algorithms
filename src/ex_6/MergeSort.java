package ex_6;

import java.util.Arrays;

public class MergeSort {
    public static int[] mergeSort(int[] sortArr) {
        int[] array1 = Arrays.copyOf(sortArr, sortArr.length);
        int[] array2 = new int[sortArr.length];
        return mergeSortInner(array1, array2, 0, sortArr.length);
    }

    public static int[] mergeSortInner(int[] array1, int[] array2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return array1;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        int[] sorted1 = mergeSortInner(array1, array2, startIndex, middle);
        int[] sorted2 = mergeSortInner(array1, array2, middle, endIndex);
        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        int[] result = sorted1 == array1 ? array2 : array1;

        while (index1 < middle && index2 < endIndex) {
            result[destIndex++] = sorted1[index1] < sorted2[index2]
                    ? sorted1[index1++] : sorted2[index2++];
        }
        while (index1 < middle) {
            result[destIndex++] = sorted1[index1++];
        }
        while (index2 < endIndex) {
            result[destIndex++] = sorted2[index2++];
        }
        return result;
    }

}
