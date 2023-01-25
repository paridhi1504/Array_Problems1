public class RunningSumArray {
    public static void printarray(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i]+ " ");
        }
        System.out.println();
    }
    public static int[] Runningsum(int nums[]){
        int runningsum[] = new int[nums.length];
        runningsum[0] = nums[0];
        for (int i = 1; i<nums.length; i++){
            runningsum[i] = nums[i] + runningsum[i-1];
        }
        return runningsum;
    }
    public static void main(String args[]){
        int arr[] = {1,2,3,4};

        printarray(arr);
         int ans[]=Runningsum(arr);
        printarray(ans);
    }
}
