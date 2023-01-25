import java.util.Scanner;
public class TwoDArray_Multiplication {
    public static void printMatrix(int [][] arr){
        for (int i=0; i<arr.length; i++){
            for (int j =0; j< arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void multiplication(int a[][], int r1, int c1, int b[][], int r2, int c2) {
        if (c1 != r2) {
            System.out.println("Wrong input- multiplication not possible:");
            return;
        }
        int[][] mul = new int[r1][c2];104

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    mul[i][j] += (a[i][k] * b[k][j]);
                }
            }
        }
        System.out.println("Multiplication of 2 matrices:");
        printMatrix(mul);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the row:");
        int r1 = s.nextInt();
        System.out.println("Enter the column:");
        int c1 = s.nextInt();
        int a[][] = new int[r1][c1];
        System.out.println("Enter the matrix:");
        for (int i = 0; i<r1; i++){
            for (int j = 0; j<c1; j++){
                a[i][j] = s.nextInt();
            }
        }
        System.out.println("Enter the row:");
        int r2 = s.nextInt();
        System.out.println("Enter the column:");
        int c2 = s.nextInt();
        int b[][] = new int[r2][c2];
        System.out.println("Enter the matrix:");
        for (int i = 0; i<r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = s.nextInt();
            }
        }
        System.out.println("Matrix 1:");
        printMatrix(a);
        System.out.println("Matrix 2:");
        printMatrix(b);

        System.out.println("multiplication of matrix is:");
      //  add(a,r1,c1,b,r2,c2);
         multiplication(a,c1,r1,b,c2,r2);
    }
}
