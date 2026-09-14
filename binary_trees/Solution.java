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

public class Solution {

    public int[] bubblesort(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n-1; i++){
            for (int j = 1; j< n -1 -i; j++){
                if (arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] =arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    public Node bst(Node root , int data){

        if (root == null){
            return new Node(data);
        }

        if (root.data < data){
            root.right = bst(root.right , data);
        }

        if (root.data > data){
            root.left = bst(root.left , data);
        }
        
        return root;
    }

    public static void main(String[] args){

        Solution sol = new Solution();

        int[] arr = {5,2,9,1,3,6};
        int[] sortedArr = sol.bubblesort(arr);
        
        System.out.println("Sorted Array: ");

        for (int num : sortedArr){
            System.out.print(num + " ");
        }

        Node root = null;

        for (int i : sortedArr){
            root = sol.bst(root ,i);
        }

   }

}