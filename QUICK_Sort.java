public class QUICK_Sort {
    public static int partition(int a[], int l, int h) {
        int pivot = a[l];
        int i = l;
        int j = h;
        while (i < j) {
            while (a[i] <= pivot)
                i++;
            while (a[j] > pivot)
                j--;
            if (i < j) {
                int temp =a[i];
               a[i]  = a[j];
                a[j] = temp;
            }
        }
        int temp_1 = a[j];
        a[j] = a[l];
        a[l] = temp_1;
        return  j;
    }
    public static void Quick( int a[], int l, int h) {
        if (l < h) {
            int pivot =  partition( a,l, h);
            Quick( a,l, pivot-1);
            Quick(a,pivot + 1, h);
        }
    }

    public static void main(String[] args) {
        int a[] = {4,6,2,5,7,9,1,3};
        int l =0;
        int h = a.length-1;
               Quick(a,l,h);
        System.out.println("After sorting elements:");
        for (int k =0; k<a.length;k++){
            System.out.print(a[k]+ " ");
        }
    }
}
