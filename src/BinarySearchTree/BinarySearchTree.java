package BinarySearchTree;

public class BinarySearchTree {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        Node root = new Node(25);
        System.out.println("Binary Tree Example");
        System.out.println("Building tree with root value " + root.value);
        //tree.insert(root, 25);
        tree.insert(root, 15);
        tree.insert(root, 4);
        tree.insert(root, 12);
        
        tree.insert(root, 10);
        
        tree.insert(root, 22);
        
        tree.insert(root, 18);
        
        tree.insert(root, 24);
        System.out.println();
        System.out.println("Traversing tree in order");
        tree.traverseInOrder(root);
        
        System.out.println();
        System.out.println("Traversing tree pre Order");
        tree.traversePreOrder(root);
        
        System.out.println();
        System.out.println("Traversing tree post Order");
        tree.traversePostOrder(root);
    }

    static class Node{
        int value;
        Node right;
        Node left;
        Node( int value){
            this.value = value;
            right = left = null;
        }
    }
    Node root = null;


    public void insert(Node node, int value) {
        if (value < node.value) { 
            if (node.left != null) { 
                insert(node.left, value); 
            } 
            else { 
                System.out.println(" Inserted " + value + " to left of " + node.value); 
                node.left = new Node(value); 
            } 
        } 
        else if (value > node.value) {
            if (node.right != null) {
                insert(node.right, value);
            } 
            else {
                System.out.println("  Inserted " + value + " to right of "+ node.value);
                node.right = new Node(value);
          }
        }
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            
            //System.out.println(" /" );
            traverseInOrder(node.left);
            System.out.print(node.value+ " ");
            
            //System.out.println("\\");
            traverseInOrder(node.right);
            
        }
     }

    public void traversePreOrder(Node node) {
        if (node != null) {
            
            //System.out.println(" /" );
            System.out.print(node.value+ " ");
            traversePreOrder(node.left);
            //System.out.println("\\");
            traversePreOrder(node.right);
            
        }
    }

    public void traversePostOrder(Node node) {
        if (node != null) {
            
            //System.out.println(" /" );
            
            traversePostOrder(node.left);
            //System.out.println("\\");
            traversePostOrder(node.right);
            System.out.print(node.value+ " ");
        }
    }
    
    
}
