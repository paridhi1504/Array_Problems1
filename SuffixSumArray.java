import java.util.Scanner;

public class SuffixSumArray {
    static int findArraySum(int [] arr){
        int totalSum =0;
        for (int i = 0; i<arr.length; i++){
            totalSum += arr[i];
        }
        return totalSum;
    }
    static  boolean Equalpartition(int arr[]){
        int totalSum  = findArraySum(arr);
        int prefSum = 0;
        for (int i = 0; i<arr.length; i++){
            prefSum += arr[i];
            int suffixSum = totalSum -prefSum;
            if (suffixSum == prefSum){
                return true;
            }
        }
        return  false;
    }
    public static void printarray(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i]+ " ");
        }
        System.out.println();
    }
    public static  void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the array element: ");
        for (int i = 0; i<n; i++){
            arr[i] = s.nextInt();
        }
       // printarray(arr);
        System.out.println("Equal partition possible " +Equalpartition(arr));

    }
}
