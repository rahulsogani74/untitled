package search;

public class Node {

    public int value;
    public Node left;
    public Node right;
    public int depth;

    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
        this.depth = 0;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
