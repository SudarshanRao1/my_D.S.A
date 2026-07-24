class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Question_2{

    private static int findDepthUtil(Node root, int target, int currentDepth) {

        if (root == null) {
            return -1;
        }

        if (root.data == target) {
            return currentDepth;
        }

        int leftDepth = findDepthUtil(root.left, target, currentDepth + 1);
        if (leftDepth != -1) {
            return leftDepth;
        }

        return findDepthUtil(root.right, target, currentDepth + 1);
    }

    public static int getDepth(Node root, int target) {
        return findDepthUtil(root, target, 0);
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        int targetNode = 3;
        int depth = getDepth(root, targetNode);

        if (depth != -1) {
            System.out.println("The depth of node " + targetNode + " is: " + depth);
        } else {
            System.out.println("Node " + targetNode + " does not exist in the binary tree.");
        }
    }
}





