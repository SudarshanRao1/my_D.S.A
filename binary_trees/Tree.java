// this code doesn't give any output it is just to know the syntax.

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Tree{
    // int Treebuildprintln(int data){
    //     Node root;
    //     System.out.println("the tree is "+root);
    //     return root;
    // }
    public static void main(String[] args) {
        Node root = new Node(12);
        root.left = new Node(13);
        root.right = new Node(14);
        root.left.right = new Node(10);
        root.left.left = new Node(16);
        root.right.left = new Node(15);
        root.right.right = new Node(11);

        // System.out.println("the values are" + root);
    }
}
