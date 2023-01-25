public class PrefixSumArray {
    public static void printarray(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i]+ " ");
        }
        System.out.println();
    }
    public static int[] prefixSum(int arr[]){
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i =1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        return prefix;
    }
    // print prefix sum without any new array
    public static void PrefixSum(int arr[]){

        for (int i =1; i<arr.length; i++){
            arr[i] = arr[i-1] + arr[i];
            System.out.print(" " +arr[i]);
        }
        System.out.println();

    }

    public static void main(String args[]){
        int arr[] = {2,1,3,4,5};
     // int prefix[] =  prefixSum(arr);
      printarray(arr);
      arr[0] = 2;
        System.out.print(" " +arr[0]);
     // printarray(prefix);
     PrefixSum(arr);


    }

}
