package search;

public class SumOfLeftLeafNodes {

    Integer sum = 0;

    public static void main(String[] args) {
        Node root = new RootNodeGenerator().getBST1();
        SumOfLeftLeafNodes sumOfLeftLeafNodes = new SumOfLeftLeafNodes();
        sumOfLeftLeafNodes.sumOfLeaf(root, false);
        System.out.println(" sum : " + sumOfLeftLeafNodes.sum);

    }

    public void sumOfLeaf(Node root, boolean isLeft) {

        if (null == root) return;

        if (null == root.left && null == root.right && isLeft) {
            sum = sum + root.value;
        }

        if (null != root.left) {
            sumOfLeaf(root.left, false);
        }

        if (null != root.right) {
            sumOfLeaf(root.right, true);
        }
    }
}
