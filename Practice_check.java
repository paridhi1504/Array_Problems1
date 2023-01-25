import java.util.Scanner;

public class Practice_check {
    public static void main(String args[]){
        System.out.println("Enter the number");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n>0){
            System.out.println("positive");
        }
        else{
            if (n<0){
                System.out.println("Neagtive");
            }
            else{
                System.out.println("Zero");
            }
        }
    }
}
