package linkedlist;

public class DetectLoop {

    public static void main(String[] args) {
        DetectLoop detectLoop = new DetectLoop();
        boolean b = detectLoop.detectLoop(new NodeDataProvider().getLoopData());
        System.out.println(b);
    }

    public boolean detectLoop(Node head) {
        Node slowPtr = head;
        Node fastPtr = head;

        while(null != fastPtr && null != fastPtr.next) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if (slowPtr == fastPtr) return true;
        }
        return false;
    }
}
