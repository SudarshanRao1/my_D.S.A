import java.util.Scanner;

class Node{
    
    String data;
    Node next;

    Node(String data){
        this.data = data;
        next = null;
    }

}

class InsertMid{

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

    void insertMid(int position , String data){
       
        Node newnode = new Node(data);
        if (head == null){
            head = newnode;
            return;
        }

        if (position == 1){
            newnode.next = head;
            head = newnode;
            return;
        }
        Node temp = head;
        for(int i = 0 ; i < position && temp != null ; i++){
            temp = temp.next;
        }

        if(temp != null){
            newnode.next = temp.next;
            temp.next = newnode;
        }        
    }

    void traverse(){
        Node temp = head;
        if(head == null){
            System.out.println("empty list");
        }
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

    }

}

public class L5{
    public static void main(String[] args) {
        InsertMid i = new InsertMid();
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();

        for(int j = 0; j < n ; j++){
           System.out.println("enter names: ");
           String names = sc.nextLine();
           i.insert(names);
        }

        System.out.println("enter  the positation: ");
        int positation = sc.nextInt();
        sc.nextLine();
        System.out.println("Student to inseart: ");
        String name = sc.nextLine();
        i.insertMid(positation,name);
        System.out.println("the updated list: ");
        i.traverse();
    }
}
