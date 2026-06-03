class Q{
    char[] arr;
    int front;
    int rear;
    int size;

    public Q(int n) {
        this.n = n;
        arr = new char[n];
        front = -1;
        rear = -1;
    }

    void insertchar(char ch){
        if (rear == n-1){
            System.out.println("overflow");
            return;
        }

        if (front == -1){
            front = 0;
        }

        rear++;
        arr[rear] = ch;
    }
    
}