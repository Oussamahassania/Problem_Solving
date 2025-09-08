import java.util.Scanner;

public class LeftHandersRightHandersAndAmbidextrous {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        int r = in.nextInt();
        int a = in.nextInt();

        int diff = Math.abs(l - r);
        int result;

        if (a >= diff) {
            int balanced = Math.max(l, r);
            int remaining = a - diff;
            result = 2 * (balanced + remaining / 2);
        } else {
            result = 2 * (Math.min(l, r) + a);
        }

        System.out.println(result);
    }
}
