import java.util.Scanner;

public class Pattren_1 {
    public static void main(String args[]){
        System.out.println("Enter the rows and column");
        Scanner s = new Scanner(System.in);
        int r = s.nextInt();
        int c = s.nextInt();
        // outer loop
        for (int i =1; i<=r; i++){
            // inner loop
            for (int j =1; j<=c; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
