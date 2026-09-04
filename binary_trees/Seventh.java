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

public class Seventh {
    static void insertmaxheap(int[] heap , int size , int value){
        int i = size;
        heap[i] = value;

        while (i>0){
            int parent = (i - 1)/2;

            if (heap[parent] >= heap[i]){
                break;
            }

            int temp = heap[parent];
            heap[parent] = heap[i];
            heap[i] = temp;

            i = parent;
        }
    }


}