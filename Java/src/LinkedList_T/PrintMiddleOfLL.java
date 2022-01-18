package LinkedList_T;

public class PrintMiddleOfLL {
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

    static void middleEle(Node head){
        Node s_ptr = head;
        Node f_ptr = head;
        while(f_ptr != null && f_ptr.next != null){
            s_ptr = s_ptr.next;
            f_ptr = f_ptr.next.next;
        }
        System.out.println(s_ptr.data+" is the middle of LL");
    }
}
