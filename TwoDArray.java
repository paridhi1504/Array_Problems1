import java.util.Scanner;

public class TwoDArray {
    public static void printArray(int [][] arr){
        for (int i=0; i<arr.length; i++){

            for (int j =0; j< arr[i].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
        System.out.println("Enter the row:");
        int r = s.nextInt();
        System.out.println("Enter the column:");
        int c = s.nextInt();
        int a[][] = new int[r][c];
        System.out.println("Enter the elements:" +r*c);
         for (int i = 0; i<r; i++){
             for (int j = 0; j<c; j++){
                 a[i][j] = s.nextInt();
             }
         }
       //  int a1[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
         printArray(a);


    }
}
