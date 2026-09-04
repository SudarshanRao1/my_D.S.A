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

public class Sixth{

    static int height(Node root){
        if (root == null){
            return -1;
        }

        return 1+Math.max(height(root.left) , height(root.right));        
    }

    static boolean isBalanced(Node root){
        if (root == null){
            return true;
        }

        int leftheight = height(root.left);
        int rightheight = height(root.right);

        if (Math.abs(leftheight - rightheight) > 1){
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
    }

    public static void main(String args[]){
        Node root = new Node(12);
        root.left = new Node(13);
        root.right = new Node(14);
        root.left.right = new Node(10);
        root.left.left = new Node(16);
        root.right.left = new Node(15);
        root.right.right = new Node(11);

        boolean result = isBalanced(root);
        System.out.println(result);
    }
}