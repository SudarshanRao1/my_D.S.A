class Node{
    int data;
    Node prev;
    Node next;

    Node(int data){
        this.data = data;

        prev = null;
        next = null;
    }
}

class Doubly{
    Node head;

    void insertend(int data){
        
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
        newnode.prev = temp;

    }

    void insertbeg(int data){
        Node newnode = new Node(data);

        if (head != null){
            head.prev = newnode;
        }

        newnode.next = head;
        head = newnode;
    }

    void insertmid(int p , int data){
        Node newnode = new Node(data);
        
        if (p == 1){
          head = newnode; 
            return;
        }
        
        Node temp = head;

        int count = 0;
        while(count < p && temp != null){
            temp = temp.next;
        }    

        if(temp == null){
            System.out.println("Invalid postion");
        }

        newnode.next = temp.next;
        newnode.prev = temp;

        if(temp.next != null){
            temp.next.prev = newnode;
        }

        temp.next = newnode;

    }

    void deletebeg(){
        if(head == null) {

            System.out.println("List is Empty");

            return;
        }

        System.out.println(head.data + " deleted");
        
        head = head.next;

        if(head != null){
            head.prev = null;
        }
        
    }

}