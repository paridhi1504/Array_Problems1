import java.util.Scanner;

public class Practice_Armstrong {
    public static void main(String args[]) {
        System.out.println("Enter the number");
        Scanner s = new Scanner(System.in);

        int sum = 0;
        while (s.hasNextInt()) {
            int n = s.nextInt();
            if (n >= 0) {
                sum = sum + n;

            } else {
                sum -= 1;
                break;
            }
        }
        System.out.print(sum);
    }
}
