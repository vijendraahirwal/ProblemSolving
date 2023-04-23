package BinaryTree;

public class FullBinaryTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(25);
        tree.insert(5);
        
        tree.insert(10);
        
        tree.insert(15);
        
        tree.insert(50);
        
        tree.insert(34);
        
        tree.insert(25);
        
        System.out.println();
        System.out.println("Traversing tree in order");
        tree.traverseInOrder(tree.root);
        
        System.out.println();
        System.out.println("Traversing tree pre Order");
        tree.traversePreOrder(tree.root);
        
        System.out.println();
        System.out.println("Traversing tree post Order");
        tree.traversePostOrder(tree.root);
    }
    
    
    
}

class BinaryTree{

    class Node{
        int value;
        Node leftNode;
        Node rightNode;

        Node(int value){
            this.value = value;
            leftNode = null;
            rightNode = null;
        }
    }

    Node root;
    Node temp = null;
    public void insert(int value){
        if(temp == null){
            temp = root;
        }

        if(this.root == null){
            root = new Node(value);
            return;
        }
        else{
            if(value < temp.value){
                if(temp.leftNode == null){
                    System.out.println(" Inserted " + value + " to left of " + temp.value);
                    temp.leftNode = new Node(value);
                    temp = null;
                }
                else{
                    temp = temp.leftNode;
                    insert(value);
                }
            }
            else{
                if(temp.rightNode == null){
                    System.out.println(" Inserted " + value + " to right of " + temp.value);
                    temp.rightNode = new Node(value);
                    temp = null;
                }
                else{
                    temp = temp.rightNode;
                    insert(value);
                }
            }
        }
    }
    public void traverseInOrder(Node node) {
        if (node != null) {
            
            //System.out.println(" /" );
            traverseInOrder(node.leftNode);
            System.out.print(node.value+ " ");
            
            //System.out.println("\\");
            traverseInOrder(node.rightNode);
            
        }
     }

    public void traversePreOrder(Node node) {
        if (node != null) {
            
            //System.out.println(" /" );
            System.out.print(node.value+ " ");
            traversePreOrder(node.leftNode);
            //System.out.println("\\");
            traversePreOrder(node.rightNode);
            
        }
    }

    public void traversePostOrder(Node node) {
        if (node != null) {
            
            //System.out.println(" /" );
            
            traversePostOrder(node.leftNode);
            //System.out.println("\\");
            traversePostOrder(node.rightNode);
            System.out.print(node.value+ " ");
        }
    }
}
