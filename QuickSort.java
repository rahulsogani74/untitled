package array;

public class QuickSort {

    public static void main(String[] args) {
        int [] arr = {10,80,30, 90, 40, 50, 70};
        new QuickSort().quickSort(arr, 0, arr.length - 1);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public void quickSort(int [] arr, int l, int r) {
        if (l < r) {
            int partition = partition(arr, l, r);
            quickSort(arr, l, partition - 1);
            quickSort(arr, partition + 1, r);
        }
    }

    private int partition(int[] arr, int l, int r) {
        int pivot = arr[r];
        int rightIdx = l - 1;
        for (int j = l ; j < r ; j++) {
            if (arr[j] < pivot) {
                rightIdx++;
                swap(arr, rightIdx, j);
            }
        }
        swap(arr, rightIdx + 1, r);
        return rightIdx + 1;
    }

    private void swap(int [] arr, int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
