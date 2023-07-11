package linkedlist;

public class NodeDataProvider {
    // 3-> 5-> 7 -> 10 -> 12 -> 14
    public Node getData() {
        Node node = new Node(3, new Node(5, new Node(7 ,
                new Node(10, new Node(12, new Node(14 ,null))))));
        return node;
    }

    public Node getLoopData() {
       Node head1 = new Node(1,null);
       Node head2 = new Node(2,null);
       Node head3 = new Node(3,null);
       Node head4 = new Node(4,null);
       Node head5 = new Node(5,null);

       head1.next = head2;
       head2.next = head3;
       head3.next = head4;
       head4.next = head5;
       head5.next = head2;
       return head1;
    }
}
