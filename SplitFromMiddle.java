package linkedlist;

public class SplitFromMiddle {

    public static void main(String[] args) {
        Node head = new NodeDataProvider().getData();
        //split(head);
        Node node = deleteMiddleElement(head);
        System.out.println("hey there ");
    }

    public static Node[] split(Node head) {
        Node [] ans = new Node[2];
        Node front = null;
        Node back = null;
        ans[0] = front;
        ans[1] = back;
        Node slow = head;
        Node fast = head.next;

        while (null != fast) {
            fast = fast.next;
            if (null != fast) {
                slow = slow.next;
                fast = fast.next;
            }
        }

        front = head;
        back = slow.next;
        slow.next = null;

        return ans;
    }

    public static Node deleteMiddleElement(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (null != fast) {
            fast = fast.next;
            if (null != fast) {
                slow = slow.next;
                fast = fast.next;
            }
        }
        slow.next = slow.next.next;
        return head;
    }
}

