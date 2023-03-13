package Practise;

public class StackUsingArray {
    
    public static void main(String [] args){
        int size = 10;
        Stack stack = new Stack(size);
        //System.out.println("Hello");
        for(int i=1;i<=15;i++){
            System.out.println("Size " +stack.size());
            stack.push(i);
            
        }
        for(int i=1;i<=15;i++){
            System.out.println("Top " +stack.top());
            
            System.out.println("Size " +stack.size());
            System.out.println("Pop " +stack.pop());


        }
        
        
    }
    
}

class Stack{
    static int[] array;
    int top = -1;

    Stack(int size){
        array = new int[size];
        System.out.println("Stack Created " +array.length); 
    }

    void push(int element){
        if( top >= array.length-1){
            System.out.println("Stack Full");
        }
        else{
            top++;
            array[top] = element;
            //System.out.println(array[top]);
            //System.out.println(top);
        }
    }

    int pop(){
        int element = -1;
        if(top <= -1){
            System.out.println("Stack Empty");
        }
        else{
            element = array[top];
            top--;
            //System.out.println(element);
            
        }
        return element;
    }

    int top(){

        int element = -1;
        if(top <= -1){
            System.out.println("Stack Empty");
        }
        
        else if(top >= array.length){
            System.out.println("Stack Full");
        }
        
        else{
            element = array[top];
            //System.out.println(element);
        }
        return element;
    }

    int size(){
        int size;
        size = array.length - top-1;
        return size;

    }

}
