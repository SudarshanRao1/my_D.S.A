import java.util.Scanner;

class Node{
    
    String data;
    Node next;

    Node(String data){
        this.data = data;
        next = null;
    }

}

class Insertstart{
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

    void insertStart(String data){
        Node newnode = new Node(data);
        
        if (head == null){
            head = newnode;
            return;
        }
         
        newnode.next = head;
        head = newnode;
        return;
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

public class L4{
    public static void main(String[] args) {
        Insertstart i = new Insertstart();
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();

        for(int j = 0; j < n ; j++){
           System.out.println("enter names: ");
           String names = sc.nextLine();
           i.insert(names);
        }
        System.out.println("Student to inseart: ");
        String name = sc.nextLine();
        i.insertStart(name);
        System.out.println("the updated list: ");
        i.traverse();
    }
}
