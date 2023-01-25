public class Selection_Sort {
    public static void main(String[] args) {
        int a[] = {4,1,9,2,3,6};
        int temp;
        int min;
        for (int i = 0; i< a.length -1; i++){
            min = i;
            for (int j = i+1; j< a.length; j++){
                if (a[j] < a[min]){
                    min = j;
                }
            }
            if (min!= i){
                temp = a[min];
                a[min] = a[i];
                a[i] = temp;
            }
        }
        System.out.println("After sorting array elements are:");
        for (int k =0; k<a.length -1; k++){
            System.out.print(a[k]+ " ");
        }
    }
}
