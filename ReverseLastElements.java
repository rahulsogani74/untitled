package linkedlist;

public class ReverseLastElements {

    public static void main(String[] args) {
        Node data = new NodeDataProvider().getData();
        Node node = new ReverseLastElements().reverseSpecific(data, 3);
        System.out.println(node);
    }

    /**
     * pass on till the count
     * @param head
     * @return
     */
    public Node reverseSpecific(Node head, int count) {
        if (null == head) {
            return null;
        }
        Node curr = head;
        Node next = null;
        Node prev = null;
        int idx = 0;
        while (null != curr ) {
            next = curr.next;
            prev = curr;
            curr = next;
            if (count > idx) {
                idx++;
            } else {
                curr.next = prev;
            }
        }
        //if (null != next)
         //   head.next = reverseSpecific(next,count);

        return prev;
    }

    private Node getFewNodes(Node head, int k) {

        Node curr = head;
        Node temp = new Node(curr.data, null);

        while (null != curr.next && k > 0) {
            k--;
            temp.next = new Node(curr.data, null);
            curr = curr.next;
        }
        return temp;
    }

    private Node reverse(Node head) {
        Node curr = head;
        Node prev = null;
        Node next = null;

        while (null != curr) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    private Node skipNodes(Node head, int count) {
        Node curr = head;
        while(null != curr && count > 0 ) {
            curr = curr.next;
            count--;
        }
        return curr;
    }
}
