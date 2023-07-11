package search;

public class LowestCommonAncestor {
    boolean n1Found = false;
    boolean n2Found = false;
    public static void main(String[] args) {

    }


    public Node getLCA(Node root, int n1, int n2) {
        if (root == null) return null;
        Node temp = null;
        if (root.value == n1) {
            n1Found = true;
            temp = root;
        }

        if (root.value == n2) {
            n2Found = true;
            temp = root;
        }

        Node lLca = getLCA(root.left,n1,n2);
        Node rLca = getLCA(root.right,n1,n2);

        if(null != temp) return temp;

        if (null != lLca && null != rLca) {
            return root;
        }

        return null != lLca ? lLca : rLca;
    }

}
