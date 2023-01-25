import java.util.Scanner;

public class Practice_Problem7 {
    public static void ToCheckNumber(int n){
        if(n>0){
            System.out.println("Positive");
        }
        else {
            if (n<0){
                System.out.println("Negative");
            }
            else {
                System.out.println("Zero");
            }
        }
    }
    public static  void main(String args[]){
        System.out.println("Enter the number:");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ToCheckNumber(n);
    }
}
