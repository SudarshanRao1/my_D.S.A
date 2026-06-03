import java.util.Scanner;

class Node {
    int data;
    Node prev;
    Node next;

    Node(int data){
        
        this.data = data;
        prev = null;
        next = null;

    }
}

class Double{

    Node head;

    void insert(int data){
        Node newnode = new Node(data);

        if(head == null){
            head = newnode;
            return;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newnode;
        newnode.prev = temp;

    }

    void Display(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }

    }

   void  insertatmid(int position , int data){
        Node newnode = new Node(data);

        if (position == 1){
            if(head != null){
                head.prev = newnode;
            }

            newnode.next = head;
            head = newnode;
            return;
        }
         
        Node temp = head;

        for (int i = 1 ; i < position -1 && temp != null ; i++){
            temp = temp.next;
        }

        if(temp == null){
            System.out.println("Invalid position");
            return;
        }

        newnode.next = temp.next;
        newnode.prev = temp;

        if(temp.next != null){
            temp.next.prev = newnode;
        }

        temp.next = newnode;

    }

}

public class LL1{
    public static void main(String[] args) {
        Double d = new Double();

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0 ; i < n ; i++){
            System.out.print("enter element: ");
            int value = Integer.parseInt(sc.nextLine());
            d.insert(value);
        }
        d.Display();

        System.out.println("enter the position: ");

        int position = Integer.parseInt(sc.nextLine());
        System.out.print("enter the value: ");
        int value = Integer.parseInt(sc.nextLine());
        d.insertatmid(position , value);

        d.Display();

    }
}
