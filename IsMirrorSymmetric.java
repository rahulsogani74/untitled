package search;

/**
 * Check if tree is symmetric/Mirror
 */
public class IsMirrorSymmetric {

    public static void main(String[] args) {
        Node root1 = new RootNodeGenerator().getBST();
        Node root2 = new RootNodeGenerator().getAnotherBST();
        Node root3 = new RootNodeGenerator().getBST();
        Node root4 = new RootNodeGenerator().getMirrorTree();
        boolean symmetric = new IsMirrorSymmetric().isSymmetric(root1, root3);
        System.out.println(symmetric);

        boolean mirror = new IsMirrorSymmetric().isMirror(root1, root4);
        System.out.println(mirror);
    }

    public boolean isSymmetric(Node root1, Node root2) {
        //do the base condition check

        if((root1 != null && root2 == null) ||
                root1 == null && root2 != null) return false;

        if (root1 == null && root2 == null) return true;

        if (root1.value != root2.value) return false;

        return isSymmetric(root1.left,root2.left)
                && isSymmetric(root1.right, root2.right);

    }

    public boolean isMirror(Node root1, Node root2) {
        //do the base condition check
        if((root1 != null && root2 == null) ||
                root1 == null && root2 != null) return false;

        if (root1 == null && root2 == null) return true;

        if (root1.value != root2.value) return false;

        return isMirror(root1.left,root2.right)
                && isMirror(root1.right, root2.left);

    }
}
