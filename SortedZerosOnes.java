public class SortedZerosOnes {
    public static void ReverseArraytem(int []arr, int i, int j){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void printarray(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i]+ " ");
        }
        System.out.println();
    }
    public static int[] sortSQuares(int arr[]){
        int n = arr.length;
        int left =0; int right = n-1;
        int ans[] = new int [n];
        int k = 0;

        while (left<=right ){
            if (Math.abs(arr[left]) > Math.abs(arr[right])){
                ans[k++] = arr[left] * arr[left];
                left++;


            }
            else{
                ans[k++] = arr[right]*arr[right];
                right--;
            }
        }
return  ans;
    }
    public static void SortArrayByParity(int []arr){
        int n = arr.length;
        int left = 0,  right = n-1;
        while (left<right){
            if (arr[left]%2 == 1 &&  arr[right]%2 == 0){
                ReverseArraytem(arr,left,right);
                left++;
                right--;
            }
            if (arr[left] %2 == 0){
                left++;
            }
            else{
                right--;
            }
        }
    }
    public static void sortzerosandones(int arr[]){
        int n = arr.length;
        int left =0;
        int right = n-1;
        while (left<right){
            if (arr[left] ==1 && arr[right] ==0){
                ReverseArraytem(arr,left,right);
                left++;
                right--;
            }
            if (arr[left] ==0){
                left++;
            }
            if (arr[right] == 1){
                right--;
            }
        }

    }
   public static void sortZerosOnes(int arr[]){
        int zeros = 0;
        // count number of zeros
       for(int i =0; i<arr.length; i++){
           if (arr[i] == 0){
               zeros++;
           }
       }
       // 0 to zeros -1: zeros to n-1:1
       for (int i =0; i< arr.length; i++){
           if (i<zeros){
               arr[i] = 0;
           }
           else{
               arr[i] = 1;
           }
       }
       }

   public static void main(String args[]){
      //  int arr[] = {1,0,0,1,0,1,1,0,0,0};
     //  int arr[] = {1, 2,3,4,5,6,7,8};
       int arr[] = {-10,-5,-4,1,2,9};
       System.out.println("Original Array:");
        printarray(arr);
        // sortZerosOnes(arr);
         //sortzerosandones(arr);
      // SortArrayByParity(arr);
      int ans[] =  sortSQuares(arr);
       System.out.println("Sorted array:");

       printarray(arr);
       printarray(ans);
   }
}
