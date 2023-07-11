package array;

public class RightRotation {

    public static void main(String[] args) {
        Integer [] arr = {2,3,4,5,7};
        //{5, 7, 2, 3, 4}
        int k = 6;
        //Integer[] integers = new RightRotation().rotateArray(arr, k);
        for (int i = 0 ; i < k ; i++) {
            new RightRotation().rotateByOne(arr);
        }
        for (Integer in : arr) {
            System.out.print( in + " ");
        }
    }

    public Integer[] rotateArray(Integer [] arr, int rotateBy) {
        int length = arr.length;
        Integer [] response = new Integer[length];
        int j = 0;
        for (int i = 0; i<= arr.length -1 ; i++) {
            if (i < length -  rotateBy) {
                response[rotateBy + i] = arr[i];
            } else {
                response[j] = arr[i];
                j++;
            }
        }
        return response;
    }

    public void rotateByOne(Integer [] arr) {
        int length = arr.length;
        int temp = arr[length -1];

        for (int i = length - 2; i >= 0 ; i--) {
            arr[i + 1] =  arr[i];
        }

        arr[0] = temp;
    }

    public void swap(Integer[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
