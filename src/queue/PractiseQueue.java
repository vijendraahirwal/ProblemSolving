package queue;

class PractiseQueue{

    public static void main(String[] args) {
        int size = 10;
        Queue queue = new Queue(size);

        for(int i = 1; i<=15; i ++){
            //System.out.println(queue.peek());
            queue.enqueue(i);
            
            //System.out.println("After enqueue");
            //System.out.println(queue.peek());
            
        }
        System.out.println("$$$$ After Dequeue");
        for(int i = 1; i<=15; i++){
            System.out.println(queue.dequeue());
        }
    }



}

class Queue{
    int size;
    int[] array;
    int front = -1;
    int rear = -1;
    Queue(int size){
        array = new int[size];
    }

    void enqueue(int item){
        if(rear == array.length-1){
            System.out.println("Queue is Full");
        }
        else{
            rear++;
            array[rear] = item;
        }
    }
    int dequeue(){
        int item = -1;
        if(front == rear){
            System.out.println("Queue is Empty");
        }
        else{
            front++;
            item = array[front]; 
        }
        return item;
    }

    int peek(){
        int item = -1;
        if(front == rear){
            System.out.println("Queue is Empty");
        }
        else{
            item = array[++front]; 
            front--;
        }

        return item;
    }
}