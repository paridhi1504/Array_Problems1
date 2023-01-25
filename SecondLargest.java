public class SecondLargest {
    public static int max(int a[]){
        int max = Integer.MIN_VALUE;
        for(int i=0; i < a.length; i++){
            if(a[i] >max){
                max = a[i];
            }

        }
        return  max;
    }
    static int secondMax(int a[]){
        int mx = max(a);
        for (int i = 0; i<a.length; i++){
            if(a[i] == mx){
                a[i] = Integer.MIN_VALUE;
            }
        }
        int  secondMax = max(a);
        return secondMax;
    }
    public static void main(String args[]){
        //int a[] = {5,4,1,6,2};
        int a[] ={5,2,5,5,3};

        System.out.println("Maximum element is:" +max(a));
        System.out.println("Maximum second element is:" +secondMax(a));
    }
}
