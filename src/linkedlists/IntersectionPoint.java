package linkedlists;


//Given two singly linked lists, return the point where two linked lists intersect.
//
//        Note: If the linked lists do not merge at any point, return -1.
public class IntersectionPoint {

    public static void main(String[] args) {
        Node head1 = new Node(4);
        Node head12 = new Node(6);
        Node head13 = new Node(8);
        Node head2 = new Node(5);
        Node node1 = new Node(9);
        Node node2 = new Node(7);
        head1.next = head12;
        head12.next = head13;
        head2.next = head13;
        head13.next = node1;
        node1.next = node2;

        System.out.println(intersection(head1, head2));
    }

    public static int intersection(Node head1, Node head2){
        int len1 = findLength(head1);
        int len2 = findLength(head2);

        int diff = Math.abs(len1 - len2);
        Node temp1 = head1;
        Node temp2 = head2;
        if(len1 >= len2){

            for(int i = 0 ; i<diff; i++){
                temp1 = temp1.next;
            }
        }
        else{
            for(int i = 0 ; i<diff; i++){
                temp2 = temp2.next;
            }
        }

        while(temp1 != null && temp2 != null){
            if(temp1 == temp2) return temp1.data;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return -1;
    }

    public static int findLength(Node head){
        int count = 0;

        Node temp = head;

        while(temp != null){
            count++;
            temp = temp.next;
        }

        return count;

    }
}
