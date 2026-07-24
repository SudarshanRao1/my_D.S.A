class Node{

    int data;

    Node left,right;

    Node(int item){
        data = item;
        left = right = null;
    }
    
}

class Binarytree{
    Node root;

    public int findingHeight(Node node){
        if(node == null){
            return 0;
        }
        else{
            int leftHeight = findingHeight(node.left);
            int rightHeight = findingHeight(node.right);

            if(leftHeight > rightHeight){
                return leftHeight + 1;
            }
            else{
                return rightHeight + 1;
            }
        }
    }
}

public class Question_1{
    public static void main(String[] args) {
        Binarytree tree = new Binarytree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Height of the binary tree is: " + tree.findingHeight(tree.root));
    }
}
