package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class ArraytoBinaryTree {
    public static void main(String[] args) {
        Tree tree = new Tree();
        int arr[] = {1,2,3,4,5,6,7,8,9};
        tree.root = tree.insertLevelOrder(arr, 0);
        tree.traverseInOrder(tree.root);
        System.out.println();
        tree.traversePreOrder(tree.root);
        System.out.println();
        tree.traversePostOrder(tree.root);
        
        System.out.println();
        tree.traverseLevelOrder(tree.root);
    }
}

class Tree{

    class Node{
        int value;
        Node right;
        Node left;
        Node(int value){
            this.value = value;
            right = null;
            left = null;
        }
    }
    Node root;

    public Node insertLevelOrder(int[] arr, int i){
        Node root = null;
        if(i < arr.length){
            root = new Node(arr[i]);

            root.left = insertLevelOrder(arr, (2*i+1));
            root.right = insertLevelOrder(arr, (2*i+2));

        }

        return root;
    }

    public void traverseInOrder(Node node){
        if(node !=null){
            traverseInOrder(node.left);
            System.out.print(node.value+" ");
            traverseInOrder(node.right);
        }
    }

    public void traversePreOrder(Node node){
        if(node != null){
            System.out.print(node.value+" ");
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public void traversePostOrder(Node node){
        if(node != null){
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(node.value+" ");
        }
    }

    public void traverseLevelOrder(Node node){
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node tempNode = queue.poll();
            System.out.print(tempNode.value+" ");

            if(tempNode.left !=null){
                queue.add(tempNode.left);
            }
            
            if(tempNode.right !=null){
                queue.add(tempNode.right);
            }
        }    
    }
}