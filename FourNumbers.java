import java.util.Scanner;

public class FourNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long sum=1;
        for (long i=0;i<4;i++){
            long n = in.nextInt();
            sum*=n;
        }
        System.out.println(sum);
    }
}
