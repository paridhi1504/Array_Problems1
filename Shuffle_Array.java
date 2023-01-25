import java.util.Scanner;

public class Shuffle_Array {
    public static void shuffleArray(int nums[]){
        int n = 2*nums.length;
        int ans[] = new int[n];
        for(int i = 0; i<n; i++){
            if (i%2 == 0){
                ans[i] = nums[i/2];
            }
            else{
                ans[i] = nums[n + i/2];
            }
        }
        printarray(ans);
    }
    public static void printarray(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        Scanner a = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = a.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the array: ");
        for (int i = 0; i<size; i++){
            arr[i] = a.nextInt();
        }
        shuffleArray(arr);

    }
}
