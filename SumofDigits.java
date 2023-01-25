import java.util.Scanner;

public class SumofDigits {
    public static void main(String args[]){
        System.out.println("Enter the digits");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sumofdigit = 0;
        int original_num =n;
        while (n>0){
            sumofdigit = sumofdigit+n%10;
            n = n/10;
            sumofdigit++;
        }
        System.out.println("Sum of digits   "+original_num+ "=" +sumofdigit);
    }
}


