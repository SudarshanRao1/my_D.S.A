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

public class Fourth {
    static Node bst(Node root , int value){
        if (root == null){
            return new Node(value);
        }

        if (value < root.data){
            root.left = bst(root.left , value);
        }

        if (value > root.data){
            root.right = bst(root.right , value);
        }

        return root;
    }

    static void printing(Node root){
        
        if (root == null){
            return;
        }

        printing(root.left);
        System.out.println(root.data);
        printing(root.right);
    }

    public static void main(String args[]){
        int[] arr = {10,35,23,4,6,7,87,12,8};

        Node root = null;

        for(int x : arr){
            root = bst(root , x);
        }
        
        printing(root);
        System.out.println();

    }
}