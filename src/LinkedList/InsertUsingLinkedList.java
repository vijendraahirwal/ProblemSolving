package LinkedList;

class InsertUsingLinkedList{
    public static void main(String[] args) {
        LinkedList lst1 = new LinkedList();
        lst1.addAtEnd(18);
        lst1.addAtEnd(19);
        lst1.addAtEnd(20);
        lst1.addAtEnd(21);
        lst1.addAtEnd(22);
        lst1.addAtEnd(23);
        lst1.showListContents();
    }
}

class LinkedList{
   
    private class Node{
        private int v;
        private Node next;

        public Node(){
            v=0;
            next = null;
        }

        public Node(int i, Node next){
            this.v = i;
            this.next = next;
        }

    }

    private Node head;

    public LinkedList(){
        head = null;
    }

    public void addToStart(int i){
        head = new Node(i, head);
    }

    public void addAtEnd(int i){
        if(head == null){
            head = new Node(i, head);
            return;
        }

        Node t = head;
        while(t.next !=null){
            t=t.next;
        }
        t.next = new Node(i, null);

    }

    public void showListContents(){
        Node temp = head;
        if(temp == null){
            System.out.println("\nThere is nothing to display; list is empty.");
        }
        else{
            System.out.println("\nHere are the contents of the list");
        
        while(temp != null){
            System.out.println(temp.v + " --->");
            temp = temp.next;
        }
        System.out.println("X");
    }
    }


}

