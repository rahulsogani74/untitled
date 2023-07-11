package search;

import java.util.HashMap;
import java.util.Map;

/**
 * Awesome question ****
 */
public class PreOrderInOrderToBst {

    private Integer idx = 0;

    public static void main(String[] args) {
        Integer [] inorder = {1,2,3,4,5};
        Integer [] preorder = {4,2,1,3,5};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0 ; i < inorder.length ; i++) {
            map.put(inorder[i] , i);
        }
        Node node = new PreOrderInOrderToBst().construct(preorder, 0, 4, map);
        new DepthFirstSearch().inOrder(node);
    }


    public Node construct(Integer[] pre, int low, int high,Map map) {
        if (low > high ) return null;
        Node root = new Node(pre[idx],null,null);
        Integer indexOfElement = (Integer) map.get(pre[idx]);
        idx++;

        if (low == high) return root;
        root.left = construct(pre, low, indexOfElement -1, map);
        root.right = construct(pre, indexOfElement +1, high, map);

        return root;

    }

}
