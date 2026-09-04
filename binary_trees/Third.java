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

public class Third {
    static Node buildtree(int[] preorder , int[] inorder , int prestart , int instart , int inend){
        
        if (prestart >= preorder.length || instart > inend){
            return null;
        }

        int rootvalue = preorder[prestart];
        Node root = new Node(rootvalue);
        int rootindex = instart;

        while (inorder[rootindex] != rootvalue){
            rootindex++;
        }

        int leftsize = rootindex - instart;

        root.left = buildtree(inorder , preorder , prestart + 1 , instart , rootindex -1);
        root.right = buildtree(inorder , preorder , prestart + leftsize +1 , rootindex + 1 , inend);

        return root;
    }

    public static void main(String args[]){
        int[] preorder = {1,2,3};
        int[] inorder = {2,1,3};

        Node root = buildtree(preorder,inorder, 0 , 0 , inorder.length - 1);

        System.out.println(root.data);
    }
}