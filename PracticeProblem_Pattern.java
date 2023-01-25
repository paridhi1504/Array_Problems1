import java.util.Scanner;

public class PracticeProblem_Pattern {
    public static void main(String args[]){
       // System.out.println("Enter the number");
      //  Scanner s = new Scanner(System.in);
      //  int n = s.nextInt();
        int n =5;
        for (int i =1; i<=n; i++){
            for (int j =1; j<=n; j++) {
                if (i == j || i + j == (n - 1)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
