package LinkedList_T;


// Given a Linked List, delete a node with given value
// I/P : 1->2->3->4->5->6->7
// O/P : 1->2->3->5->6->7


// If Head is given then we can traverse but if only target Node then its tricky
public class DeleteANode {
    public static void main(String[] args) {

    }
    class Node{
        int data;
        PrintEvenNodes.Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static void deleteNode(Node head, int target){

    }


    // in case if we have only Node target
    static void deleteNode(Node target){
        target.data = target.next.data;
        target.next = target.next.next;
    }
}
