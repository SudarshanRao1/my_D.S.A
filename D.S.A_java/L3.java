import java.util.Scanner;

class Node{
    
    String data;
    Node next;

    Node(String data){
        this.data = data;
        next = null;
    }

}

class Full{
    Node head;
    void insert(String data){
        Node newnode = new Node(data);

        if (head == null){
            head = newnode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        
        temp.next = newnode;
    }

    void isFull(){
        Node temp = head;
        
        int count = 0;
        while (temp != null){
            temp = temp.next;
            count++;
        }

        if(count >= 5){
            System.out.println("The project group is full. No more students can be added.");
            return;
        }
        else{
            System.out.println("some pleace is left");
        }
    }
}

public class L3{
    public static void main(String[] args) {
        Full f = new Full();
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++){

           System.out.println("enter names: ");
           String names = sc.nextLine();
           f.insert(names);

        }

        f.isFull();
    }
}
