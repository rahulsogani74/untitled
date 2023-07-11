package search;

public class MaximumDepth {

    public static void main(String[] args) {
        Node bst = new RootNodeGenerator().getBST();
        int maxDepth = new MaximumDepth().getMaxDepth(bst);
        System.out.println(maxDepth);
    }

    public int getMaxDepth(Node root) {
        if (root == null) {
            return 0;
        }
        int l = getMaxDepth(root.left);
        int r = getMaxDepth(root.right);
        return Math.max(l,r) + 1;
    }
}
