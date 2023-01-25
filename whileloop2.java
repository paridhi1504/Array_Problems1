import java.util.Scanner;

public class whileloop2 {
    public static  void main(String args[]){
        System.out.println("Enetr the number");
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        int sum =0;
        int num = 1;
        while(num <= n){
            sum = sum+num;
            num++;

        }
        System.out.println("Sum of all natural number:" +sum);
    }
}
