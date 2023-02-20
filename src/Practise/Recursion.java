package Practise;

//import java.util.ArrayList;

public class Recursion {
    
    public static void main(String[] args) {
        int n = 4;
        long[] arr = new long[]{1, 2, 9,15};
        shuffleArray(arr,n);
    }
    
    
    static void shuffleArray(long arr[], int n)
    {
        // Your code goes here
        int size = arr.length;
        
        if(n ==(size/2)){
            return; 
        }
        else{
            System.out.print(arr[size-n]+" ");
            System.out.print((arr[(size-n)+size/2])+" ");
        }
        shuffleArray(arr,n-1);
        
    }
}
