public class Rotate_Array {
    static int[] rotate_Array(int arr[], int k){
        int ans[] = new int[arr.length];
        int j =0;
        int n = arr.length;
        k = k%n;
        for (int i = n-k; i<n; i++ ){
            ans[j] = arr[i];
            j++;
        }
        for (int i = 0; i<n-k; i++){
            ans[j] = arr[i];
            j++;
        }
        return ans;
    }
    public static void printarray(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int k = 20;
        printarray(arr);
        int ans[] = rotate_Array(arr, k);
        printarray(ans);

    }
}
