package search;

public class RootNodeGenerator {

    public Node getBST() {
        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
        Node left = new Node(2,new Node(1, null, null),
                new Node(3, null, null) );
        Node right = new Node(5,null,null);
        Node root = new Node(4,left,right);
        return root;
    }

    public Node getBST1() {
        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
        Node left = new Node(2,new Node(1, null, null),
                new Node(3, null, null) );
        Node right = new Node(5,new Node(6, null,null),null);
        Node root = new Node(4,left,right);
        return root;
    }

    public Node getAnotherBST() {
        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
        Node left = new Node(2,new Node(1, null, null),
                new Node(3, null, null) );
        Node right = new Node(7,null,null);
        Node root = new Node(4,left,right);
        return root;
    }

    public Node getMirrorTree() {
        DepthFirstSearch depthFirstSearch = new DepthFirstSearch();
        Node right = new Node(2,
                new Node(3, null, null),
                new Node(1, null, null));
        Node left = new Node(5,null,null);
        Node root = new Node(4,left,right);
        return root;
    }

}
