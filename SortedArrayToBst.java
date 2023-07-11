package search;

public class SortedArrayToBst {

    public static void main(String[] args) {
        Integer [] array = {1,2,3,4,5};
        Node root = new SortedArrayToBst().arrayToBst(array, 0, 4);
        new DepthFirstSearch().inOrder(root);
    }

    public Node arrayToBst(Integer[] arr, int low, int high) {

        if (high < low) return null;

        int mid = low + (high -low) / 2;
        Node root = new Node(arr[mid], null, null);
        root.left = arrayToBst(arr, low, mid -1);
        root.right = arrayToBst(arr, mid +1 , high);
        return root;
    }
}
