import java.util.Scanner;

public class Revision_Pattern {
    public static void main(String args[]) {
        System.out.println("Enter the number:");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= x+1-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
