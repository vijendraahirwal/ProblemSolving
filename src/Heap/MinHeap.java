package Heap;

public class MinHeap {
    public static void main(String[] args) {
        System.out.println("The Min Heap is ");
 
        // Creating object of class in main() method
        Heap minHeap = new Heap(15);
 
        // Inserting element to minHeap
        // using insert() method
 
        // Custom input entries
        minHeap.insert(1);
        minHeap.insert(3);
        minHeap.insert(2);
        minHeap.insert(4);
        minHeap.insert(6);
        minHeap.insert(5);
        minHeap.insert(8);
        minHeap.insert(7);
        minHeap.insert(9);
 
        // Print all elements of the heap
        minHeap.print();
 
        // Removing minimum value from above heap
        // and printing it
        System.out.println("The Min val is "
                           + minHeap.remove());
                           
        System.out.println("The Min val is "
        + minHeap.remove());
                           
        System.out.println("The Min val is "
        + minHeap.remove());
        minHeap.print();
        System.out.println("The Min val is "
        + minHeap.remove());
        minHeap.print();
    }
}

class Heap{
    private int[]Heap;
    private int size;
    private int maxsize;

    private static final int  FRONT = 1;
    public Heap(int maxsize){
        this.maxsize = maxsize;
        this.size = 0;
        Heap = new int[this.maxsize+1];
        Heap[0] = Integer.MIN_VALUE;
    }

    private int parent(int pos){
        return pos/2;
    }

    private int leftChild(int pos){
        return pos*2;
    }

    private int rightChild(int pos){
        return (pos*2)+1;
    }

    private boolean isLeaf(int pos){
        if(pos > (size/2)){
            return true;
        }
        return false;
    }

    private void swap(int fpos, int spos){
        int temp;
        temp = Heap[fpos];
        Heap[fpos] = Heap[spos];
        Heap[spos] = temp;
    }

    private void minHeapify(int pos){
        if(!isLeaf(pos)){
            int swapPos = pos;
            if(rightChild(pos) <= size){
                if(Heap[leftChild(pos)] < Heap[rightChild(pos)]){
                    swapPos = leftChild(pos);
                }
                else{
                    swapPos = rightChild(pos);
                }
            }
            else{
                swapPos = leftChild(pos);
            }

            if( Heap[pos] > Heap[leftChild(pos)] || Heap[pos]> Heap[rightChild(pos)] ){
                swap(pos,swapPos);
                minHeapify(swapPos);
            }
        }
    }

    public void insert(int element){

        if(size >= maxsize){
            return;
        }

        Heap[++size] = element;
        int current = size;

        while(Heap[current] < Heap[parent(current)]){
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public void print(){
        for( int i = 1; i<=size/2; i++){
            System.out.print(
                " PARENT : " + Heap[i]
                + " LEFT CHILD : " + Heap[2 * i]
                + " RIGHT CHILD :" + Heap[2 * i + 1]);
            System.out.println();
        }
       
    }

    public int remove(){
        int popped = Heap[FRONT];
        Heap[FRONT] = Heap[size--];
        minHeapify(FRONT);

        return popped;
    }

}
