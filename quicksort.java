package com.company;
import java.util.*;
import java.util.Scanner;
class Quicksort {
  static int partition(int array[], int low, int high) {
    int pivot = array[high];
    int i = (low - 1);
    for (int j = low; j < high; j++) {
      if (array[j] <= pivot) {
        i++;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }
    int temp = array[i + 1];
    array[i + 1] = array[high];
    array[high] = temp;
    return (i + 1);
  }
  static void quickSort(int array[], int low, int high) {
    if (low < high) {
      int pi = partition(array, low, high);
      quickSort(array, low, pi - 1);
      quickSort(array, pi + 1, high);
    }
  }
}
class Main {
  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i;
        int[] a =new int[n];
        for(i=0;i<n;i++)
            a[i] = in.nextInt();
        Quicksort.quickSort(a, 0, n- 1);
        System.out.println(Arrays.toString(a));
  }
}
