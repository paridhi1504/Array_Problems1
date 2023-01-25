public class Reverse_Array {
  public static int[] Reversearray(int arr[]) {
      int j = 0;
      int ans[] = new int[arr.length];
      for (int i = arr.length - 1; i >= 0; i--) {
          ans[j++] = arr[i];

      }
      return ans;
  }
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

  public static void main(String[] args){
      int arr[] = {1,2,3,4,5};
     // int ans[] = Reversearray(arr);
      int ans[] = Reversearray(arr);
      printarray(ans);
  }
}
