import java.util.Scanner;

public class SumOfConsecutiveOddNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int line = in.nextInt();
        for (int i = 0; i < line; i++) {
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            int max=Math.max(num1, num2);
            int min=Math.min(num1, num2);
            int sum=0;
            for (int k = min+1; k <max; k++) {
                if (k%2!=0) {
                    sum=sum+k;
                }
            }
            System.out.println(sum);

        }
    }
}
