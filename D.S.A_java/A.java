import java.util.Scanner;

public class A{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter name: ");
        String name = sc.nextLine();
        
        System.out.println("enter seaction: ");
        char c = sc.next().charAt(0);

        System.out.println("enter the number of subjects: ");
        int n = sc.nextInt();
        
        int total = 0;
        double avg ;
       
        int[] a = new int[n];
      
        for (int i = 0 ; i < n ; i++){
            a[i] = sc.nextInt();
            total += a[i]; 
        }

        for (int i = 0 ; i < n ; i++){
            System.out.print(a[i] + " ");
        }

        avg = (double)total/n;

        System.out.println("the average:");
        System.out.print(avg);

    }
}
