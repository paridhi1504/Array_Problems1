import java.util.Scanner;

public class Reversed {
    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int rev_num= 0;

        while (n>0){
            rev_num = rev_num*10+n%10;
            n = n/10;

        }
        System.out.println("reversed num is : " +rev_num);
    }
}
