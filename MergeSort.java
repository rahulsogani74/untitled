package array;

public class MergeSort {

    public static void main(String[] args) {
        int [] arr = {10,80,30, 90, 40, 50, 70};
        new MergeSort().mergeSort(arr, 0, arr.length - 1);
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }
    public void mergeSort(int [] arr, int l, int r) {
        if ( l < r) {
            int mid = (l + r) / 2;

            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }

    }

    private void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int [] L = new int[n1];
        int [] R = new int[n2];

        for (int j = 0 ; j < n1 ; j++) {
            L[j] = arr[ l + j];
        }

        for (int j = 0 ; j < n2 ; j++) {
            R[j] = arr[mid + 1 + j];
        }

        //it has to be zero as it starts with zero
        int i = 0;
        int j = 0;

        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[i];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }

    }
}
