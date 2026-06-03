import java.util.Scanner;

class Node{
    
    String data;
    Node next;

    Node(String data){
        this.data = data;
        next = null;
    }

}

class DeleteMid{
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

    void deleteNode(int positation , String data){
        Node newnode = new Node(data);

        if(head == null){
            head = newnode;
            return;
        }

        if (positation == 1){
            head = head.next;
            return;
        }
        
        Node temp = head;
        for (int i = 1 ; i < positation -1 && temp != null ; i++){
            temp = temp.next.next;
        }

        temp.next = temp.next.next;
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

public class L7{
    public static void main(String[] args) {
        DeleteMid i = new DeleteMid();
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
        //System.out.println("Student to inseart: ");
        //String name = sc.nextLine();
        System.out.println("first: ");
        String b = sc.nextLine();
        i.deleteNode(positation,b);
        System.out.println("the updated list: ");
        i.traverse();
        System.out.println("another: ");
        System.out.println("enter  the positation: ");
        int pos = sc.nextInt();
        sc.nextLine();
        String a = sc.nextLine();
        i.deleteNode(pos, a);
        System.out.println("the updated list: ");
        i.traverse();
    }
}
