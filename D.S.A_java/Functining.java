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

public class Functining {
    static int height(Node root){
        if (root == null){
            return -1;
        }

        int leftheight = height(root.left);
        int rightheight = height(root.right);

        return Math.max(leftheight , rightheight) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(54);
        root.left = new Node(20);
        root.right = new Node(11);
        root.left.right = new Node(6);
        
        System.out.println(height(root));

    }
}