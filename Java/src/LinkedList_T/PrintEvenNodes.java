package LinkedList_T;
/**
 * Given a start of Linked List, we need to print all even numbered nodes.
 * Starting node is 1
 *
 */

public class PrintEvenNodes {
    public static void main(String[] args) {

    }

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static void printEvenNode(Node head){
        int count = 1 ;
        Node temp = head;

        while(temp != null){
            temp = temp.next;
            count++;

            if(count % 2 == 0){
                System.out.println(temp.data);
            }
        }
    }
}
