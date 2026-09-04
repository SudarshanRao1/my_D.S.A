class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Second_Question {
    static int findDepth(Node root, int target, int depth) {

        if (root == null)
            return -1;

        if (root.data == target)
            return depth;

        int leftResult = findDepth(root.left, target, depth + 1);

        if (leftResult != -1)
            return leftResult;

        return findDepth(root.right, target, depth + 1);
    }

    public static void main(String args[]) {
        Node root = new Node(12);
        root.left = new Node(13);
        root.right = new Node(14);
        root.left.right = new Node(10);
        root.left.left = new Node(16);
        root.right.left = new Node(15);
        root.right.right = new Node(11);

        int results = findDepth(root, 12, 0);
        System.out.println(results);

    }
}