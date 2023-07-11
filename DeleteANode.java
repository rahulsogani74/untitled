package linkedlist;

public class DeleteANode {

    /**
     * 3-> 5-> 7 -> 10 -> 12 -> 14
     * 3 -> 10 -> 7 -> 5 -> 12 -> 14
     * @param args
     */
    public static void main(String[] args) {
        Node head = new NodeDataProvider().getData();
        DeleteANode aNode = new DeleteANode();
        //Node deleteNode = aNode.deleteMiddleElement(head);
        //System.out.println(deleteNode.data);
        //Node deleteNode = aNode.deleteElement(head,2,4);
        //System.out.println(deleteNode.data);

        Node reverseElement = aNode.reverse(head,2,3);
        System.out.println(reverseElement.data);
    }

    private Node reverse(Node head, int limit) {
        Node curr = head;
        Node prev = null;
        Node next = null;

        while (null != curr && limit > 0) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = curr.next;
            limit--;
        }

        return prev;
    }

    private Node reverse(Node head, int to, int from) {
        int idx = 1;
        Node previousNodes = null;
        Node curr1 = head;
        while (null != curr1 && idx < to) {
            previousNodes = curr1;
            curr1 = curr1.next;
            idx++;
        }

        Node prev = null;
        Node next = null;
        Node curr = curr1;
        while (null != curr && from > 0) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            from--;
            idx++;
        }
        previousNodes.next = prev;

        Node forwardNodes = previousNodes;

        while(forwardNodes.next != null) {
            forwardNodes = forwardNodes.next;
        }
        previousNodes.next = next;
        return previousNodes;
    }

    public Node deleteMiddleElement(Node head) {
        Node curr = head;
        Node fastPointer = head;
        Node prev = null;

        while (null != curr) {
            if(fastPointer == null || fastPointer.next == null) {
                prev.next = curr.next;
                return head;
            }

            fastPointer = fastPointer.next.next;

            prev = curr;
            curr = curr.next;
        }

        return head;
    }

    /**
     * 3-> 5-> 7 -> 10 -> 12 -> 14
     * 3 -> 12 -> 14
     * @param head
     * @param to 2
     * @param from 4
     * @return
     */
    public Node deleteElement(Node head, int to, int from) {
        Node curr = head;
        Node prev = null;
        int idx = 1;

        while (null != curr) {
            if (idx < to) {
                prev = curr;
            }

            if (idx > from) {
                prev.next = curr;
                return head;
            }
            curr = curr.next;
            idx++;
        }

        return head;
    }
}

