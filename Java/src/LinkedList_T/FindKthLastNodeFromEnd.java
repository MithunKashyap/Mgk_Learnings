package LinkedList_T;

public class
FindKthLastNodeFromEnd {
    public static void main(String[] args) {
        Node node1 = Node.insertBegin(70,null);
        Node node2 = Node.insertBegin(60,node1);
        Node node3 = Node.insertBegin(50,node2);
        Node node4 = Node.insertBegin(40,node3);
        Node node5 = Node.insertBegin(30,node4);
        Node node6 = Node.insertBegin(20,node5);
        Node node7 = Node.insertBegin(10,node6);
        System.out.println("Print original list : ");
        Node.printList(node7);

        Node kthEle = Node.findKthLast(node7, 6);
        System.out.println();
        if(kthEle !=null)
        System.out.println(kthEle.data);
        else
            System.out.println("Not found");


    }
}


class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
     static Node findKthLast(Node head, int k){

        Node curr_ptr = head;

        for (int i = 0; i<k ; i++) {
            if(i > k-1)
                return null;

            if(curr_ptr != null)
                curr_ptr = curr_ptr.next;
            else
                return null;

        }


        while(curr_ptr != null){
            curr_ptr = curr_ptr.next;
            head = head.next;
        }

        return head;
    }

     static Node insertBegin(int data, Node newNode){
        Node new_node = new Node(data);
        new_node.next = newNode;
        return new_node;
    }

    static void printList(Node head){
        Node curr_pointer = head;
        while(curr_pointer !=null){
            System.out.print(curr_pointer.data);
            if(curr_pointer.next !=null)
                System.out.print("->");
            curr_pointer = curr_pointer.next;
        }
    }

}
