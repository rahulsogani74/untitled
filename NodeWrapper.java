package search;

public class NodeWrapper {
    private Node node;
    private int depth;

    public NodeWrapper(Node node, int depth) {
        this.node = node;
        this.depth = depth;
    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }
}
