package BinaryTree;

public class BinaryTreeArray {
    public static void main(String[] args) {
        
        Array obj = new Array(20);
 
        // Setting root node
        obj.root("A");
        obj.set_Left("B", 0);
        obj.set_Right("C", 0);
        obj.set_Left("D", 1);
        obj.set_Right("E", 1);
        obj.set_Right("F", 2);
        obj.set_Right("Z",3);
        obj.print_Tree();

    }

    
}

class Array{
    static int root;
    static String[] str;
    Array(int size){
        str = new String[size];
        root = 0;
    }
    public void root(String key){
        str[0] = key;
    }

    public void set_Left(String key, int root){
        int place = (root*2) +1;
        if(str[root] == null){
            System.out.println("No Parent Found");
        }
        else{
            str[place] = key;
        }
    }

    
    public void set_Right(String key, int root){
        int place = (root*2) +2;
        if(str[root] == null){
            System.out.println("No Parent Found");
        }
        else{
            str[place] = key;
        }
    }

    public void print_Tree(){
        for( int i=0; i<str.length; i++){
            if(str[i] !=null){
                System.out.print(str[i]);
            }
            else{
                System.out.print("-");
            }
        }
    }
}