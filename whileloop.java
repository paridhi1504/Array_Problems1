import java.util.Scanner;

public class whileloop {
    public static void main(String args[]){
        int num = 1;
        Scanner a = new Scanner(System.in);
        int n = a.nextInt();
        while (num<=n){
            System.out.println(num);
            num = num +1;
        }
    }
}
