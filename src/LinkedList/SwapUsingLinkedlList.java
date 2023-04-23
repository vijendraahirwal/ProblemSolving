package LinkedList;

public class SwapUsingLinkedlList {
    public static void main(String[] args) {
        LinkedListStripped list = new LinkedListStripped();
        
        list.showListContents();
        list.addAtEnd(1);
        list.addAtEnd(2);
        
        //list.showListContents();
        list.addAtEnd(3);
        list.addAtEnd(4);
        //swapAlternateElements(list);
        list.addAtEnd(5);
        list.addAtEnd(6);
        list.addAtEnd(7);
        list.addAtEnd(8);
        list.showListContents();
        swapAlternateElements(list);
        list.showListContents();
    }

    public static LinkedListStripped.Node swapAlternateElements(LinkedListStripped list){
        /**boolean flag = false;
        if(list.head == null){
            System.out.println("List Empty");
            return flag;
        }
        if(list.head.next == null){
            System.out.println("No Swapping");
            return flag;
        }
        LinkedListStripped.Node curr = list.head;
        LinkedListStripped.Node prev = curr;
        LinkedListStripped.Node next = curr;
        curr = curr.next;
        next = curr.next;
        list.head = curr;
        list.head.next = prev;
        prev.next = next;
        System.out.println("curr"+ curr.value);
        System.out.println("prev"+ prev.value);
        System.out.println("next"+ next.value);
        curr = prev.next;
        next = curr.next;
        prev = prev.next;
        System.out.println("curr"+ curr.value);
        System.out.println("prev"+ prev.value);
        System.out.println("next"+ next.value);
        
        curr = next;
        next = curr.next;*/
        LinkedListStripped.Node head = list.head;

        if (head == null || head.next == null) {
            return head;
        }
 
        // Initialize previous and current pointers
        LinkedListStripped.Node prev = head;
        LinkedListStripped.Node curr = head.next;
 
        head = curr; // Change head before proceeding
 
        // Traverse the list
        while (true) {
            LinkedListStripped.Node next = curr.next;
            curr.next = prev; // Change next of current as previous node
 
            // If next NULL or next is the last node
            if (next == null || next.next == null) {
                prev.next = next;
                break;
            }
 
            // Change next of previous to next next
            prev.next = next.next;
 
            // Update previous and curr
            prev = next;
            curr = prev.next;
        }
        return head;

    }
}

class LinkedListStripped{
    public class Node{
        public int value;
        public Node next;
        Node(int value,Node next){
            this.value=value;
            this.next = next;
        }
    }

    Node head=null;

    public void addAtStart(int data){
        head = new Node(data, head.next);
    }

    public void addAtEnd(int value){
        if(head == null){
            head = new Node(value,head);
            return;
        }
        Node temp = head;
        while( temp.next !=null){
            temp = temp.next;
        }
        temp.next = new Node(value,temp.next);
    }

    public void showListContents(){
        Node temp = head;
        while( temp !=null){
            System.out.print(temp.value+" -- >");
            temp = temp.next;

        }
        System.out.println("X");
    }

}