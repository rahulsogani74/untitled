package search;

public class DepthFirstSearch {
    Node previousNode = new Node(Integer.MIN_VALUE, null, null);

    public static void main(String ...args) {
        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
        Node left = new Node(2,new Node(1, null, null),
                new Node(3, null, null) );
        Node right = new Node(5,null,null);
        Node root = new Node(4,left,right);
        //In order traversal
        //depthFirstSearch.inOrder(root);


        Node leftForBst = new Node(3,new Node(1, null, null),
                new Node(6, null, null) );
        Node rightForBst = new Node(5,null,null);
        Node rootForBst = new Node(4,leftForBst,rightForBst);
        //ISBst
        boolean bst = depthFirstSearch.inBst(rootForBst);
        System.out.println("is bst " + bst);

        BinaryTree btree = new BinaryTree();
        boolean bst1 = btree.isBST1(rootForBst);
        System.out.println("is bst " + bst1);

        new DepthFirstSearch().preOrder(root);
    }

    public void inOrder(Node root) {
        //breaking condition
        if (root == null) return;

        //go to left
        if (null!= root.left)  inOrder(root.left);

        //print data
        System.out.println(" data " + root.value);

        //go to right direction
        if (null!= root.right)  inOrder(root.right);
    }

    public void preOrder(Node root) {

        if (root == null) return;
        System.out.println(root.value);

        preOrder(root.left);
        preOrder(root.right);
    }

    //using the
    public boolean inBst(Node root) {
        //breaking condition
        if (root == null) return true;

        //go to left
        if (!inBst(root.left)) return false;

        //go to the extreme left and then check and update
        if (root.value < previousNode.value) {
            return false;
        }

        previousNode = root;

        //go to right direction
        return inBst(root.right);
    }

    static class BinaryTree {
        // Root of the Binary Tree
        Node root;

        // To keep tract of previous node in Inorder Traversal
        Node prev;

        boolean isBST1(Node root) {
            this.root = root;
            prev = null;
            return isBST(root);
        }

        /* Returns true if given search tree is binary
           search tree (efficient version) */
        boolean isBST(Node node) {
            // traverse the tree in inorder fashion and
            // keep a track of previous node
            if (node == null) return true;

            if (!isBST(node.left)) return false;

            // allows only distinct values node
            if (prev != null && node.value <= prev.value) return false;

            prev = node;

            return isBST(node.right);
        }
    }
}
