package array;

public class RotatedSortedArraySearchAnElement {

    public static void main(String[] args) {
        //int [] arr = {1, 2, 3, 4, 5, 6, 7, 8 ,9, 10, 11, 12};
        int [] arr = {12, 11, 1, 2, 3, 4, 5, 6 ,7, 8, 9, 10};
        int searchElement = 5;
        //int searchElements = searchElement(arr, 0, 11, searchElement);
        //int pivotElement = getPivotElement(arr, 0, 11);

        //if (arr[pivotElement] == searchElement) {
         //   System.out.println(pivotElement);
        //}

        //if (arr[arr.length - 1] > searchElement)
         //   System.out.println(searchElement(arr, pivotElement, arr.length -1,searchElement ));
        //else
        //    System.out.println(searchElement(arr, 0, pivotElement -1,searchElement ));

       // int searchElements = searchElement(arr, 0, 11, searchElement);
        //System.out.print(searchElements);
        //System.out.print(pivotElement);
        int element = getSearchElement(arr, 0, 11, searchElement);
        System.out.println(element);
    }

    private static int searchElement(int[] arr, int low,
                                   int high, int searchElement) {
        if (low > high) return -1;

        int mid = (low + high) / 2;
        //mid is same as search element
        if (arr[mid] == searchElement) return mid;
        //base cases
        if (high > mid && arr[mid + 1] == searchElement) return mid + 1;
        if (mid > low && arr[mid - 1] == searchElement) return mid - 1;

       if (arr[mid] < searchElement) {
           return searchElement(arr,mid +1, high, searchElement);
       }
        return searchElement(arr,low, mid -1, searchElement);
    }

    private static int getPivotElement(int[] arr, int low,
                                     int high) {
        if ( low < high) {
            int mid = (low + high) / 2;
            if (arr[mid] <  arr[mid -1]) return mid;

            if (arr[mid] < arr[low]) {
               return getPivotElement(arr, low, mid -1);
            }
            return getPivotElement(arr, mid + 1, high);
        }
        return -1;
    }

    private static int getSearchElement(int[] arr, int low,
                                       int high, int key) {
        if ( low > high)
            return -1;

        int mid = (low + high) / 2;
        if (arr[mid] == key) return  mid;
        //if (mid > low && arr[mid - 1] == key) return  mid -1;
        //if (mid < high && arr[mid + 1] == key) return  mid +1;
        //sorted
        if (arr[low] <= arr[mid]) {
            if (arr[low] <= key && key <= arr[mid ]) {
                return getSearchElement(arr, low, mid -1, key);
            }
            return getSearchElement(arr, mid + 1 , high, key);
        } else {
            if (arr[mid] <= key && key <= arr[high]) {
                return getSearchElement(arr, mid +1, high, key);
            }
            return getSearchElement(arr, low , mid -1, key);
        }
    }
}
