import java.util.Scanner;

class Node{
    
    String data;
    Node next;

    Node(String data){
        this.data = data;
        next = null;
    }

}

class Searching{
    
    Node head;
    void inseart(String data){
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

    void search(String name){
        Node temp = head;
        if (head == null){
            System.out.println("empty");
            return;
        }

        while(temp != null){
            if(name.equals(temp.data)){
                System.out.println(temp.data+" is a member of our group");
                return;
            }

            else{
                System.out.println(name+" is not a member of our group");
                return;
            }
        }

    }

}

public class L2{
    public static void main(String[] args) {
        Searching s = new Searching();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter the size: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++){

           System.out.println("enter names: ");
           String names = sc.nextLine();
           s.inseart(names);
        
        }

        System.out.println("enter a name: ");
        String name = sc.nextLine();
        s.search(name);
    }
}
