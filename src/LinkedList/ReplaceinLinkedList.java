package LinkedList;

public class ReplaceinLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addAtEnd(1);
        list.showListContents();
        list.addAtEnd(2);
        list.showListContents();
        list.addAtEnd(3);
        list.showListContents();
        list.addAtEnd(4);
        list.showListContents();
        list.addAtEnd(5);
        list.showListContents();
        list.addAtEnd(6);
        list.showListContents();
        list.addAfter(7, 6);
        list.showListContents();
        list.addAfter(10, 4);
        list.showListContents();
        list.addAfter(15, 0);
        list.showListContents();
        list.addBefore(15, 2);
        list.showListContents();
        list.addBefore(15, 0);
        list.showListContents();
        
    }
}

class LinkedList{
    private class Node{
        private int value;
        private Node next;

        public Node(){
            value = 0;
            next = null;
        }

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

    public void addAtEnd(int value){
        if(head == null){
            head = new Node(value,head);
            return;
        }
        Node temp = head;
        while(temp.next !=null){
            temp = temp.next;
        }
        temp.next = new Node(value,null);
        temp = null;
    }

    public void addAfter(int value, int position){
       
        if(head == null){
            System.out.println("list is Empty Cannot add");
            return;
        }
        Node temp = head;
        while(temp !=null && temp.value != position){
            temp = temp.next;
        } 
        if(temp == null){
            System.out.println("Value not found in list cannot add");
            return;
        }
        temp.next = new Node(value, temp.next);
    }

    public boolean addBefore(int value, int position){
        if(head == null){
            System.out.println("list is Empty Cannot add");
            return false;
        }

        if(head.value == position){
            head = new Node(value,head);
            return true;
        }

        Node temp = head;
        while(temp.next !=null && temp.next.value != position){
            temp = temp.next;
        }
        if(temp.next == null){
            System.out.println("Value not found in list cannot add");
            return false;
        }
        temp.next = new Node(value,temp.next);
        return true;
    }

    public void showListContents(){
        Node temp = head;
        if(temp == null){
            System.out.println("Nothing to print");
        }
        else{
            while(temp !=null){
                System.out.print(temp.value + " --> ");
                temp = temp.next;
            }
            System.out.println("X");
        }
    }
}