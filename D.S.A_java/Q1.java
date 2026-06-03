import java.util.Scanner;

class Queuee{
    int[] arr;
    int front;
    int rear;
    int n;

    Queuee(int n){
        this.n = n;
        arr = new int[n];
        front = -1;
        rear = -1;
    }

    void enqueue(int data){
        if (rear == n-1){
            System.out.println("Queue overflow");
            return;
        }

        if (front == -1){
            front = 0;
        }

        rear++;
        arr[rear] = data;
    }

    void deqeue(){
        if(front == -1 || front > rear){
            System.out.println("Queue underflow");
            return;
        }
        System.out.println(arr[front]+" removed");
        front++;
    }

    void display(){
        if(front == -1 || front > rear){
            System.out.println("Queue empty");
            return;
    }

        for (int i = front; i<=rear ;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println();


    }
} 

public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Queuee q = new Queuee(5);
        q.enqueue(10);
        q.display();
        q.enqueue(20);
        q.display();
        q.enqueue(30);
        q.display();
        q.deqeue();
        q.display();
              
    
    }
}
