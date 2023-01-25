import java.util.Scanner;

public class Practice_Fibonaaci {
    public static void main (String args[]) {
        System.out.println("Enter the number");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a=1;
        int b=1;
        for (int i =1; i<=n;i++){
            System.out.print(a+" ");
            int sum= a+b;
            a=b;
            b=sum;
        }
    }
}
