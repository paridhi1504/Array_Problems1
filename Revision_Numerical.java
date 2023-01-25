import java.util.Scanner;

public class Revision_Numerical {
    public static void main(String args[]) {
        System.out.println("Entre the number:");
      //  Scanner s = new Scanner(System.in);
       // int r = s.nextInt();
       // int c = s.nextInt();
      /*  for (int i=1; i<=r; i++){
            for (int j=i; j<=r; j++){
                System.out.print( j+ " ");
            }
            for (int k=1; k<=i-1; k++){
                System.out.print(k+ " ");
            }
            System.out.println();
        }
 */
       /* for (int i=1; i<=r; i++){
            for (int j = 1; j<=c; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        } */
        int r=9;
        for (int i=1; i<=r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int k=1; k<=r-1; k++){
            for (int l=1; l<=r-k; l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
