package search;

public class MaxPathSum {

    Integer maxSum = Integer.MIN_VALUE;
    public static void main(String[] args) {
        Node node = new RootNodeGenerator().getBST();
        MaxPathSum maxPathSum = new MaxPathSum();
        int sum = maxPathSum.maxPathSum(node);
        System.out.println( " max sum " + maxPathSum.maxSum);

    }

    public int maxPathSum(Node root) {
        if (null == root) return 0;

        int leftSum = maxPathSum(root.left);
        int rightSum = maxPathSum(root.right);
        int max_single = Math.max(root.value,
                (Math.max(leftSum, rightSum) + root.value));

        int max_top = Math.max(root.value + leftSum + rightSum, max_single);

        if (maxSum <= max_top) maxSum = max_single;

        return max_single;
    }


}
