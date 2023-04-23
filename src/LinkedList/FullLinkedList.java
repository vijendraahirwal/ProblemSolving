package LinkedList;

public class FullLinkedList {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();


        Car car1 = new Car(1,"Hello");
        list.addToStart(car1);
        list.showListContent(); 
        /**list.addToStart(4);
        list.addAfter(5,4);
        list.addBefore(3,4);
        list.addToEnd(7);
        list.showListContents();
        System.out.println(list.contains(4));
        list.replace(4, 10);
        list.showListContents();
        list.reverse();
        list.showListContents();
        
        removeFromStart(list);
        list.showListContents();
        
        removeAfter(list, 10);
        System.out.println(removeBefore(list, 9));
        list.showListContents();
        System.out.println(removeAfter(list, 6));
        list.showListContents();
        **/
        
        
    }
    
    static void removeFromStart(LinkedList list){
        if(list.head == null){
            System.out.println("List is Empty");
            return;
        }
        list.head = list.head.next;
    }
    
    static boolean removeBefore(LinkedList list, int value){
        boolean flag = false;
        if(list.head == null || list.head.value == value){
            System.out.println("Inside if");
            return flag;
        }
        
        LinkedList.Node curr = list.head;
        
        LinkedList.Node prev = list.head;
        if(curr.next !=null && curr.next.value == value){
            list.head = curr.next;
            return flag;
        }

        while(curr.next !=null && curr.next.value != value ){
            prev = curr;
            curr = curr.next;
            System.out.println("Curr"+curr.value);
            
            System.out.println("Prev"+prev.value);
        }
        
        System.out.println("Curr"+curr.value);
        System.out.println("Prev"+prev.value);
        if(curr.value != value && curr.next == null){
            return flag;
        }
        prev.next = curr.next;

        return flag;
    }
    
    
    static boolean removeAfter(LinkedList list, int value){
        if(list.head == null){
          return false;  
        }
        LinkedList.Node curr= list.head;
        
        while(curr !=null && curr.value !=value){
            curr = curr.next;
        }
        if(curr!=null && curr.value !=value){
            curr.next = curr.next.next;
            return true;
        }
        
        return false;
    }
}

class Car{
    int value;
    String name;
    Car(int value,String name){
        this.value = value;
        this.name = name;
    }
}

class LinkedList{

    class Node{
        public Car car;
        public int value;
        public Node next;

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

        public Node(Car car, Node next){
            this.car = car;
            this.next = next;
        }
    }

    Node head;

    public LinkedList(){
        head = null;
    }

    public void addToStart(int value){
        head = new Node(value,head);
    }

    public void addToStart(Car car){
        head = new Node(car,head);
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

    public void showListContent(){
        if(head == null){
            System.out.println("list is Empty");
            return;
        }
        Node temp = head;
        System.out.println("Here are the contents:");
        while(temp !=null){
            System.out.print(temp.car.name +" ---> ");
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

