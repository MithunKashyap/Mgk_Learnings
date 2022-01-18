public class SinglyLinkedList_InsertBeginning {
    /**
     * Takes Current Head and new Data as Param. Constructs a new node using data and points new node's next to head and returns the data
     * @param head
     * @param data
     * @return
     */
    private static Node insertBegin(Node head, int data){
        Node new_node = new Node(data);
        new_node.next = head;
        return new_node;

    }
}
