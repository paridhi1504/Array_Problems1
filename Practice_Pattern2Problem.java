public class Practice_Pattern2Problem {
    public static void main(String args[]){
        int n =5;
        int a=65;
        int num=0;

        for (int i=1; i<=n;i++){
            for (int j=n; j>i; j--){
                System.out.print(" ");
            }
            for (int k =1; k<= i*2-1;k++){
                System.out.print((char)(a+num++));
            }
            num=0;
            System.out.println();
        }
        for (int i=1; i<=n-1; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for (int k=(n-1)*2-1; k>0; k--){
                System.out.print((char)(a+num++));
            }
            num=0;
            System.out.println();
        }

    }
}
