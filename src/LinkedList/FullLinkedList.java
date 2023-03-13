package LinkedList;

public class FullLinkedList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addToStart(4);
        list.addAfter(5,4);
        list.addBefore(3,4);
        list.addToEnd(7);
        list.showListContents();
        System.out.println(list.contains(4));
        list.replace(4, 10);
        list.showListContents();
        list.reverse();
        list.showListContents();
    }
   
    
    
}

class LinkedList{

    private class Node{
        private int value;
        private Node next;

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }

    private Node head;

    public LinkedList(){
        head = null;
    }

    public void addToStart(int value){
        head = new Node(value,head);
    }

    public void addToEnd(int value){
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

    public boolean addAfter(int value, int position){
        if(head == null){
            System.out.println("List is Empty");
            return false;
        }

        Node temp = head;
        while( temp !=null && temp.value != position){
            temp = temp.next;
        }
        if(temp == null){
            System.out.println("Cannot Find Value");
            return false;
        }
        temp.next = new Node(value, temp.next);
        return true;
    }

    public boolean addBefore(int value, int position){
        if(head == null){
            System.out.println("List is Empty");
            return false;
        }

        if(head.value == position){
            head = new Node(value, head);
            return true;
        }

        Node temp = head;
        while(temp.next != null && temp.next.value != position){
            temp = temp.next;
        }
        if( temp.next == null){
            System.out.println("Cannot Find Value");
            return false;
        }
        temp.next = new Node(value,temp.next);
        return true;
    }

    public Node find(int value){
        if(head == null){
            return null;
        }
        Node temp = head;
        while(temp.next !=null){
            if( temp.value == value){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public boolean contains(int value){
        if(find(value) !=null){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean replace(int value1, int value2){
        Node temp = find(value1);
        if(temp !=null){
            temp.value = value2;
            return true;
        }
        else{
            System.out.println("Cannot Find value");
            return false;
        }
    }
    public void showListContents(){
        if(head == null){
            System.out.println("list is Empty");
            return;
        }
        Node temp = head;
        System.out.println("Here are the contents:");
        while(temp !=null){
            System.out.print(temp.value +" ---> ");
            temp = temp.next;
        }
        System.out.println("X");
    }

    public void reverse(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }

        Node current = head;
        Node prev = null;
        Node next = null;
        while(current !=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }

}

