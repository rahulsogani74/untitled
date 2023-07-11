import java.util.Arrays;
import java.util.List;

public class MiddleElementInArray {

    public static void main(String ...args) {
        List<Integer> list = Arrays.asList(2, 3, 4, 1, 2);
        Integer[] array = {4,5,6,7,0,1,2};
        int minimumElement = findMin(array, 0, array.length);

        Integer arr1[] = {5, 6, 1, 2, 3, 4};
        int n1 = arr1.length;
        System.out.println("The minimum element is "+ findMin(arr1, 0, n1-1));

        Integer arr2[] = {1, 2, 3, 4};
        int n2 = arr2.length;
        System.out.println("The minimum element is "+ findMin(arr2, 0, n2-1));

        Integer arr3[] = {1};
        int n3 = arr3.length;
        System.out.println("The minimum element is "+ findMin(arr3, 0, n3-1));

        Integer arr4[] = {1, 2};
        int n4 = arr4.length;
        System.out.println("The minimum element is "+ findMin(arr4, 0, n4-1));

        Integer arr5[] = {2, 1};
        int n5 = arr5.length;
        System.out.println("The minimum element is "+ findMin(arr5, 0, n5-1));

        Integer arr6[] = {5, 6, 7, 1, 2, 3, 4};
        int n6 = arr6.length;
        System.out.println("The minimum element is "+ findMin(arr6, 0, n6-1));

        Integer arr7[] = {1, 2, 3, 4, 5, 6, 7};
        int n7 = arr7.length;
        System.out.println("The minimum element is "+ findMin(arr7, 0, n7-1));

        Integer arr8[] = {2, 3, 4, 5, 6, 7, 8, 1};
        int n8 = arr8.length;
        System.out.println("The minimum element is "+ findMin(arr8, 0, n8-1));

        Integer arr9[] = {3, 4, 5, 1, 2};
        int n9 = arr9.length;
        System.out.println("The minimum element is "+ findMin(arr9, 0, n9-1));
        System.out.println(minimumElement);
    }

    public static int findMin(Integer[] list, int low, int high) {
        if (high < low) return list[0];

        if (high == low) {
            return list[low];
        }

        int mid = (low + high) / 2;

        if (list[mid] < list[mid +1] && list[mid] <list[mid -1]) {
            return list[mid];
        }

        if (list[mid] >  list[mid +1]) {
            return findMin(list, mid+1, high);
        }

        if (list[mid] > list[mid -1]) {
            return findMin(list, low, mid-1);
        }

        return 0;
    }
}
