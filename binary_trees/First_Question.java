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

public class First_Question{
    
    static int height(Node root){

        if (root == null){
            return -1;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return 1 + Math.max(leftHeight , rightHeight);
    }

    public static void main(String[] args) {
        // Node root = new Node(10);
        Node root = new Node(12);
        root.left = new Node(13);
        root.right = new Node(14);
        root.left.right = new Node(10);
        root.left.left = new Node(16);
        root.right.left = new Node(15);
        root.right.right = new Node(11);

        System.out.println("the height of the tree is: " + height(root));
    }
}
