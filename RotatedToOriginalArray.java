package array;

import java.util.Arrays;
import java.util.List;

public class RotatedToOriginalArray {

    public static void main(String[] args) {
        int arr[] = {1, 2 ,3, 4, 5,6};
        System.out.println("rotate by 1");
        rotateByOne(arr);
        Arrays.stream(arr).forEachOrdered(System.out::print);
        System.out.println();
        System.out.println("rotate by 1 more");
        rotateByOne(arr);
        Arrays.stream(arr).forEachOrdered(System.out::print);
        System.out.println();
        System.out.println("rotate by 1 more");
        rotateByOne(arr);
        Arrays.stream(arr).forEachOrdered(System.out::print);
        System.out.println();

        System.out.println("rotate by 1 more");
        rotateByOne(arr);
        Arrays.stream(arr).forEachOrdered(System.out::print);
        System.out.println();

        System.out.println("rotate by 1 more");
        rotateByOne(arr);
        Arrays.stream(arr).forEachOrdered(System.out::print);
        System.out.println();

        System.out.println("get # of rotation");
        int rotation = numOfRotation(arr);
        System.out.println(rotation);

        for (int i =0 ; i < rotation ; i++) {
            fixRotation(arr,rotation);
        }
        Arrays.stream(arr).forEachOrdered(System.out::print);

    }

    private static int numOfRotation(int[] arr) {
        return getFirstMin(arr, 0, arr.length -1) ;
    }

    private static int getFirstMin(int[] arr, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;

            if (low == high) return arr[low];

            if (high > mid && arr[mid + 1] < arr[mid]) return mid + 1;

            if (low < mid && arr[mid] < arr[mid -1]) return mid;

            if (arr[mid] <= arr[high]) {
                return getFirstMin(arr, low, mid - 1);
            }
            return getFirstMin(arr, mid + 1, high);
        }
        return 0;
    }

    private static int getSearchMin(int[] arr, int low, int high, int key) {

        if (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key ) return mid;

            if (arr[mid] > key) {
                return getSearchMin(arr,low, mid -1, key);
            }
            return getSearchMin(arr, mid +1, high, key);
        }
        return -1;
    }

    private static void fixRotation(int[] arr, int rotation) {
        int len = arr.length - 1;
        int first = arr[0];
        for (int i = 1 ; i <= len ; i++) {
            arr[i - 1] = arr[i];
        }
        arr[len] = first;
    }

    private static void rotateByOne( int[] arr) {
        int len = arr.length - 1;
        int last = arr[len];

        for (int i = len - 1 ; i >= 0 ; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = last;
    }
}
