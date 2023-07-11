package search;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class TopView {

    public static void main(String[] args) {
        printTopView(new RootNodeGenerator().getBST());
    }

    public static void printTopView(Node root) {

        Map<Integer, Node> response = new HashMap<>();
        if (null == root) return;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node element = queue.poll();
            if (!response.containsKey(element.depth)) {
                response.put(element.depth, element);
            }
            if (element.left != null) {
                element.left.depth = element.depth - 1;
                queue.offer(element.left);
            }
            if (element.right != null) {
                element.right.depth = element.depth + 1;
                queue.offer(element.right);
            }
        }

        response.forEach( (k,v) -> System.out.print(v.value + " "));
    }
}
