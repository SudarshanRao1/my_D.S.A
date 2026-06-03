import java.util.Scanner;

class Node{
    
    String data;
    Node next;

    Node(String data){
        this.data = data;
        next = null;
    }

}

class InsertEnd{
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

    void inseartEnd(String data){
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

public class L6{
    public static void main(String[] args) {
        InsertEnd i = new InsertEnd();
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
        i.inseartEnd(name);
        System.out.println("the updated list: ");
        i.traverse();
    }
}
