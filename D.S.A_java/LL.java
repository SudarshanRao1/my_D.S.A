import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        next = null;
    }

}

class Singly{
    Node head;

     void insert(int data){
        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next!=null){
            temp = temp.next;
        }

        temp.next = newNode;

    }

    void Display(){

        if (head == null){
            System.out.println("LL is empty");
        }

        Node temp = head;

        while(temp != null){
            System.out.println("temp.data: "+temp.data);
            temp = temp.next;
        }

        System.out.println("null");

    }

    Node insertionatbegining(int data){

        Node newNode = new Node(data);

        if(head == null){
            return newNode;
        }

        Node temp = head;

        head = newNode;

        newNode.next = temp;
         
        return head;    

    }

    Node insertionatend(int data){
        Node newNode = new Node(data);

        if(head == null){
            return newNode;
        }

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;
       
        return head;

    }

    Node insertatmiddle(int position , int data){
        
        Node newNode  = new Node(data);

        if (position == 1){
            newNode.next = head;
            head = newNode;
            return head;
        }

        int count = 0;
        Node temp = head;
        while(count < position && temp != null){
            temp = temp.next;
            count++;
        }
       
       if(temp != null){
        
        newNode.next = temp.next;
        temp.next = newNode;

       }
     

        return head;
    }

    Node deletestart(int data){

        Node newNode = new Node(data);

        if (head == null){
            return head;
        }

        head = head.next;

        return head;
    }

    Node deleteend(int data){
        Node newNode = new Node(data);

        if (head == null){
            return head;
        }
         Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }

        temp.next = null;

        return head;
    }

    Node deletemid(int position , int data){
        Node newNode = new Node(data);

        if (head == null){
            return head;
        }

        int count = 1;
        Node temp = head;

        while(count < position && temp != null){
            temp = temp.next;
            count++;
        }

        temp.next = temp.next.next;

        return head;
    }

}



public class LL{
    public static void main(String[] args) {
        Singly l = new Singly();

        Scanner sc = new Scanner(System.in);

        System.out.print("how many you want? ");

        int n = Integer.parseInt(sc.nextLine());


        for (int i = 0 ; i < n ; i++){
            System.out.println("Enter the Element: ");

            int value = Integer.parseInt(sc.nextLine());
            l.insert(value);
        }

        l.Display();

        System.out.print("enter the position: ");
        int position = Integer.parseInt(sc.nextLine());        
        System.out.println("enter element ");
        l.insertatmiddle(position, sc.nextInt());
        l.Display();
        System.out.println("enter element ");
        l.insertionatbegining(sc.nextInt());
        l.Display();
        System.out.println("enter element ");
        l.insertionatend(sc.nextInt());
        l.Display();

        l.deleteend(0);
        l.Display();
        l.deletemid(position, 0);
        l.Display();
        l.deletestart(0);
        l.Display();

    }
}
