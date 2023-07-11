package array;

import java.util.Arrays;
import java.util.Collections;

public class SumFoundInSortedList {

    public static void main(String[] args) {
        int [] arr = { 4, 6, 8, 10, 12, 14, 16};
        Arrays.sort(arr);
        System.out.println(isSumFound(arr, 12));
    }

    private static boolean isSumFound(int [] arr, int key) {
        int i =0;
        int j= arr.length - 1;

        while (i < j) {
            int sum = arr[i] + arr[j];
            if (sum == key) return true;

            if (sum > key) {
                j--;
            } else {
                i++;
            }
        }
        return false;
    }
}
