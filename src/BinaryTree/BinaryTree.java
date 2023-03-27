package BinaryTree;

/**public class BinaryTree {
    Node root;
    public static void main(String[] args) {
    BinaryTree tree = new BinaryTree();

    // create nodes of the tree
    tree.root = new Node(0);
    tree.root.left = new Node(1);
    tree.root.right = new Node(2);
    tree.root.left.left = new Node(3);
    
    tree.root.left.right = new Node(4);
    
    tree.root.right.left = new Node(5);
    
    tree.root.right.right = new Node(6);

    System.out.print("\nBinary Tree: ");
    tree.traverseTree(tree.root);
    }

    public void traverseTree(Node node){
        if( node != null){
            traverseTree(node.left);
            System.out.print(" " +node.value);
            traverseTree(node.right);
        }
    }

}
class Node{
    int value;
    Node left;
    Node right;
    public Node(int value){
        this.value = value;
        left = null;
        right = null;
    }
}*/

