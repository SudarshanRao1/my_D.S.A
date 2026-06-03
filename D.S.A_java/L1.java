import java.util.Scanner;

class Node{
    
    String data;
    Node next;

    Node(String data){
        this.data = data;
        next = null;
    }

}

class L{
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

    void traverse(){

        int count = 0;

        if(head == null){
            System.out.println("list is empty!");
        }

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data +"->");
            temp = temp.next;
            count++;
            
        }

        System.out.println("Number of Students: " +count);

    }
}

public class L1{
    public static void main(String[] args) {
        L l = new L();
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the size: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++){

           System.out.println("enter names: ");
           String names = sc.nextLine();
           l.insert(names);
        
        }

        l.traverse();

    }

}
