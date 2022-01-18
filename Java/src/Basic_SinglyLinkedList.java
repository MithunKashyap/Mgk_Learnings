class Node {
     int data;
     Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Basic_SinglyLinkedList {
    public static void main(String args[]) {
        Node n1 = new Node(75); // Head
        Node n2 = new Node(130);
        Node n3 = new Node(266);
        Node n4 = new Node(402);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

//        Node n1 = new Node(10);
//        n1.next = new Node(20);
//        n1.next.next = new Node(30);
//        n1.next.next.next = new Node(40);

        n1 = insertBegin(n1, 10);
        n1 = insertBegin(n1, 20);
        n1 = insertEnd(n1, 888);
        n1 = insertEnd(n1, 999);

        printList(n1);
        System.out.println();
        printList_recursively(n1);

        System.out.println();
        n1 = deleteFirst(n1);
        printList(n1);


        System.out.println();
        n1 = deleteLast(n1);
        printList(n1);
    }


    /**
     * Traverse the List and Print the elements of a Singly linked List
     * @param head
     */
    private static void printList(Node head){
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

    /**
     * Returns head.next if head is not null
     * @param head
     * @return
     */
    private static Node deleteFirst(Node head){
        if(head==null)
            return null;
        return head.next;
    }

    /**
     * Traverse till
     * @param head
     * @return
     */
    private static Node deleteLast(Node head){
        if(head==null || head.next==null)
            return null;

        Node curr_pointer = head;
        while(curr_pointer.next.next !=null){
            curr_pointer = curr_pointer.next;
        }
        curr_pointer.next = null;
        return head;
    }


    private static Node insertAtPos(Node head, int data, int pos){
        if(pos == 1)
            return new Node(data).next = head;

        Node curr_pointer = new Node(data);
        return null;

    }
}