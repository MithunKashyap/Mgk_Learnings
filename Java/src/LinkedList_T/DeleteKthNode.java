package LinkedList_T;


//
public class DeleteKthNode {
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
    static Node deleteKthNode(Node head, int k){
        Node temp = head;
        Node prev = null;
        int count = 0;
        
        while(temp != null){
            count++;
            temp = temp.next;
        }
        
        temp = head;
        int start = count-k+1;
        int size = 0;
        
        while (temp!=null && size<start){
            prev = temp;
            temp=temp.next;
            size++;
        }
        
        prev = prev.next.next;
        return head;
        
    }
}
