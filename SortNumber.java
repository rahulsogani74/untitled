package array;

public class SortNumber {

    public static void main(String[] args) {
        int [] arr = {0,1,2,2,1,0,0,2,0,1,1,0};
        new SortNumber().sortNumbersOneTwoZero(arr);
        for (Integer i : arr) {
            System.out.print( i + " ");
        }
    }
    private void swap(int [] arr, int i , int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private void sortNumbersOneTwoZero(int[] arr) {
        int start = 0, mid = 0;
        int end = arr.length - 1;
        int pivot = 1;

        while (mid <= end) {
            if (arr[mid] < pivot) {
                swap(arr, mid, start);
                start++;
                mid++;
            } else if (arr[mid] > pivot) {
                swap(arr, mid, end);
                end--;
            }else{
                mid++;
            }
        }
    }


}
