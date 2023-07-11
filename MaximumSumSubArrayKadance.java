package array;

public class MaximumSumSubArrayKadance {

    public static void main(String[] args) {
        int [] arr = {0,-1,2,1,-1,3,-3};
        int maximumSumSubArray = new MaximumSumSubArrayKadance().getMaximumSumSubArray(arr);
        System.out.println(maximumSumSubArray);

    }

    public int getMaximumSumSubArray(int [] arr) {
        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;

        for (int i =0 ;i < arr.length ; i++) {
            curSum = curSum + arr[i];
            if (curSum < 0) {
                curSum = 0;
            }

            if (maxSum < curSum) {
                maxSum = curSum;
            }
        }

        return maxSum;
    }
}
