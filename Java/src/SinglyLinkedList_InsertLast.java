// allocate memory to last_node or new node
// find the curr_last_node by traversing till current.next != null
// Assign new_last_node to  curr_last_node.next
// return head
public class SinglyLinkedList_InsertLast {

    /**
     * Traverses till last node and inserts the node at the end of the linked list
     * @param head
     * @param data
     * @return
     */
    private static Node insertEnd(Node head, int data){
        Node last_node = new Node(data);
        if(head==null)
            return last_node;// this itself is head(corner case)

        Node curr_pointer = head;
        while(curr_pointer.next != null){ // traverse till curr_pointer.next not equal to null
            curr_pointer = curr_pointer.next;
        }

        curr_pointer.next = last_node;// append node to end
        return head;
    }

}
