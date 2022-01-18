
// Time complexity is O(1)
public class SinglyLinkedList_DeleteFirst {
    private Node deleteFirst(Node head){
        if(head==null)
            return null;

        return head.next;
    }
}
