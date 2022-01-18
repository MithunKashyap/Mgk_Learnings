

//Time complexity is Theta(n)
public class SinglyLinkedList_DeleteLast {
    /**
     * Traverse till
     * @param head
     * @return
     */
    private static Node deleteLast(Node head){
        if(head==null || head.next==null) // 0 node and only 1 node corner case
            return null;

        Node curr_pointer = head;
        while(curr_pointer.next.next !=null){
            curr_pointer = curr_pointer.next;
        }
        curr_pointer.next = null;
        return head;
    }
}
