public class Traverse_SinglyLinkedList {

    /**
     * Traverse the List and Print the elements of a Singly linked List
     *
     * @param head
     */
    private void printList(Node head){
        Node curr_pointer = head;
        while(curr_pointer !=null){
            System.out.print(curr_pointer.data);
            if(curr_pointer.next !=null)
                System.out.print("->");
            curr_pointer = curr_pointer.next;
        }
    }

    /**
     * Traverse the List and Print the elements of a Singly linked List RECURSIVELY
     *
     * @param head
     */
    private static void printList_recursively(Node head){
        Node curr_pointer = head;
        if(curr_pointer == null)
            return;
        System.out.print(curr_pointer.data +"-");
        printList_recursively(curr_pointer.next);

    }
}
