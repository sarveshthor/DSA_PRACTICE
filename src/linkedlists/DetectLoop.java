package linkedlists;



public class DetectLoop {

    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = head.next; // Creates a loop

        System.out.println(detectLoop(head)); // Output: true

        Node noLoopHead = new Node(1);
        noLoopHead.next = new Node(2);
        noLoopHead.next.next = new Node(3);

        System.out.println(detectLoop(noLoopHead)); // Output false
    }

    public static boolean detectLoop(Node head){
        if(head == null || head.next == null) return false;

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast) return true;
        }
        return false;
    }
}
