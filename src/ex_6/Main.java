package ex_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        int timeBefore,timeAfter;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10000; i++) {
            list.add((int) (Math.random() * 10000));
        }

        List<Integer> list2 = new ArrayList<>(10000);
        list2.addAll(list);

        List<Integer> list3 = new ArrayList<>(10000);
        list3.addAll(list);

        List<Integer> list4 = new ArrayList<>(10000);
        list4.addAll(list);

        List<Integer> list5 = new ArrayList<>(10000);
        list5.addAll(list);

        int[] sortArr = new int[10000];
        for (int i = 0; i < 10000; i++) {
            sortArr[i] = (int) (Math.random() * 10000);
        }

        timeBefore = (int) System.currentTimeMillis();
        BubbleSort.bubbleSort(list); // О(n2) ***2 - в степене***    ***Худшее время***
        timeAfter = (int) System.currentTimeMillis();
        System.out.println("Bubble Sort. Time: " + (timeAfter - timeBefore));

        timeBefore = (int) System.currentTimeMillis();
        InsertionSort.insertionSort(list2); // О(n2)  ***2 - в степене***    ***Худшее время***
        timeAfter = (int) System.currentTimeMillis();
        System.out.println("Insertion Sort. Time: " + (timeAfter - timeBefore));

        timeBefore = (int) System.currentTimeMillis();
        QuickSort.quickSort(list3,0, list3.size() -1); // O(n log n)   ***Худшее время***
        timeAfter = (int) System.currentTimeMillis();
        System.out.println("Quick Sort. Time: " + (timeAfter - timeBefore));

        timeBefore = (int) System.currentTimeMillis();
        SelectionSort.selectionSort(list4); // О(n2)   ***2 - в степене***   ***Худшее время***
        timeAfter = (int) System.currentTimeMillis();
        System.out.println("Selection Sort. Time: " + (timeAfter - timeBefore));

        timeBefore = (int) System.currentTimeMillis();
        ShellSort.shellSort(10000,list5);// O(log2n)  ***Худшее время***
        timeAfter = (int) System.currentTimeMillis();
        System.out.println("Shell Sort. Time: " + (timeAfter - timeBefore));

        timeBefore = (int) System.currentTimeMillis();
        MergeSort.mergeSort(sortArr); // O(n log n) ***Худшее время***
        timeAfter = (int) System.currentTimeMillis();
        System.out.println("Merge Sort. Time: " + (timeAfter - timeBefore));

    }

}
