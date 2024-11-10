package DoublyLinkedList;

import Node.DoublyNode;

import java.util.LinkedList;

public class Insertion {

    public static void main(String[] args) {
//        LinkedList<Integer> ls = new LinkedList<>();
//        ls.add(0,0);
//        ls.add(1,1);
//        System.out.println(ls.toString());

        //CREATION OF LINKED LIST
        DoublyNode node1 = new DoublyNode(1);
        DoublyNode node2 = new DoublyNode(2);
        DoublyNode node3 = new DoublyNode(3);
        DoublyNode node4 = new DoublyNode(4);
        DoublyNode node5 = new DoublyNode(5);

        node1.next = node2;
        node2.prev = node1;
        node2.next = node3;
        node3.prev = node2;
        node3.next = node4;
        node4.prev = node3;
        node4.next = node5;
        node5.prev = node4;

        DoublyNode temp = node1;

        while(temp!= null){
            System.out.print(temp.val + "->");
            temp = temp.next;
        }




    }
}
