package search;

import java.util.*;

public class BreadthFirstSearch {

    private List<Integer> output = new ArrayList();
    Queue<Node> queue = new LinkedList<>();
    Map map = new HashMap();

    public static void main(String[] args) {
        BreadthFirstSearch driver = new BreadthFirstSearch();
        driver.printLevelOrderTravarsal();
        driver.printLeftView();
        System.out.println();
        driver.printRightView();
        System.out.println();
        driver.printTopView();
        System.out.println();
        driver.printBottomView();
        driver.printTopView(new RootNodeGenerator().getBST());
    }

    public void printLevelOrderTravarsal() {
        Node root = new RootNodeGenerator().getBST();
        getBreadthFirstSerach(root);
        System.out.println(output);
    }

    public void cleanup() {
        output.clear();
        queue.clear();
        map.clear();
    }

    public void printLeftView() {
        cleanup();
        Node root = new RootNodeGenerator().getBST();
        getLeftView(root);
        System.out.println(output);
    }

    public void printRightView() {
        cleanup();
        Node root = new RootNodeGenerator().getBST();
        getRightView(root);
        map.forEach((k,v) -> System.out.print(v + " "));
    }

    public void printTopView() {
        cleanup();
        Node root = new RootNodeGenerator().getBST();
        getTopView(root);
        map.forEach((k,v) -> System.out.print(v + " "));
    }

    public void printBottomView() {
        cleanup();
        Node root = new RootNodeGenerator().getBST();
        getBottomView(root);
        map.forEach((k,v) -> System.out.print(v + " "));
    }

    /**
     * Do the left view
     * @param root
     */
    private void getLeftView(Node root) {
        if (root == null) {
            return;
        }
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node poll = queue.poll();
            if (!map.containsKey(poll.depth)) {
                map.put(poll.depth, poll.value);
                output.add(poll.value);
            }

            if(null != poll.left) {
                poll.left.depth = poll.depth + 1;
                queue.offer(poll.left);
            }

            if(null != poll.right) {
                poll.right.depth = poll.depth + 1;
                queue.offer(poll.right);
            }
        }

    }

    /**
     * Do the right view
     * @param root
     */
    private void getRightView(Node root) {
        if (root == null) {
            return;
        }
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node poll = queue.poll();
            map.put(poll.depth, poll.value);

            if(null != poll.left) {
                poll.left.depth = poll.depth + 1;
                queue.offer(poll.left);
            }

            if(null != poll.right) {
                poll.right.depth = poll.depth + 1;
                queue.offer(poll.right);
            }
        }

    }

    /**
     * Do the right view
     * @param root
     */
    private void getBottomView(Node root) {
        if (root == null) {
            return;
        }
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node poll = queue.poll();

            //map.computeIfAbsent(poll.depth, k -> poll.value);
            map.compute(poll.depth, (key,oldValue) -> poll.value);

            if(null != poll.left) {
                poll.left.depth = poll.depth - 1;
                queue.offer(poll.left);
            }

            if(null != poll.right) {
                poll.right.depth = poll.depth + 1;
                queue.offer(poll.right);
            }
        }

    }

    /**
     * Do the right view
     * @param root
     */
    private void getTopView(Node root) {
        if (root == null) {
            return;
        }
        queue.offer(root);

        while (!queue.isEmpty()) {
            Node poll = queue.poll();

            /*if (!map.containsKey(poll.depth)) {
                map.put(poll.depth, poll.value);
            }*/
            map.computeIfAbsent(poll.depth, k -> poll.value);

            if(null != poll.left) {
                poll.left.depth = poll.depth - 1;
                queue.offer(poll.left);
            }

            if(null != poll.right) {
                poll.right.depth = poll.depth + 1;
                queue.offer(poll.right);
            }
        }

    }

    public void getBreadthFirstSerach(Node root) {
        if(root == null) {
            return;
        }
        queue.offer(root);
        while (!queue.isEmpty()) {
            Node pop = queue.poll();
            output.add(pop.value);

            if (null != pop.left) {
                queue.offer(pop.left);
            }

            if (null != pop.right) {
                queue.offer(pop.right);
            }
        }
    }

    public void printTopView(Node root) {

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
                queue.offer(element);
            }
            if (element.right != null) {
                element.right.depth = element.depth + 1;
                queue.offer(element);
            }
        }

        response.forEach( (k,v) -> System.out.print(v.value + " "));
    }
}
