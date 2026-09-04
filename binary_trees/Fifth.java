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

public class Fifth {
    static int findmin(Node root){
        while (root.left != null){
            root = root.left;
        }

        return root.data;
    }
    
    static int findmax(Node root){
        while (root.right != null){
            root = root.right;
        }

        return root.data;
    }

    static Node insert(Node root , int value){
        if (root == null){
            return new Node(value);
        }

        if (value < root.data){
            root.left = insert(root.left , value);
        }

        if (value > root.data){
            root.right = insert(root.right , value);
        }

        return root;
    }

    static Node delete(Node root , int value){
        if (root == null){
            return null;
        }

        if (value < root.data){
            root.left = delete(root.left , value);
        }

        else if (value > root.data){
            root.right = delete(root.right , value);
        }

        else {
            if (root.left == null){
                return root.right;
            }

            if (root.right == null){
                return root.left;
            }

            int predecessor = findmin(root.right);
            root.data = predecessor;
            root.right = delete(root.right , predecessor);
        }

        return root;

    }

    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String args[]){
        int[] arr = {10,20,3,45,8,2,6,58};

        Node root = null;

        for (int x : arr){
            root = insert(root , x);
        }

        System.out.println("before deletion");
        inorder(root);

        root = delete(root , 20);

        System.out.println("\n after deletion");
        inorder(root);

    }

}
