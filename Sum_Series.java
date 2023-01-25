import java.util.Scanner;

public class Sum_Series {
    public static void main(String args[]){
        int ans =0;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i =1; i<=n; i++) {
            if (i % 2 == 0) {
                ans = ans - 1;
            } else {
                ans = ans + 1;
            }
        }
            System.out.println(ans);

    }
}
