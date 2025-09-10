import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int result = 0;
        int count = 0;


        for (int i = 0; i < a; i++) {
            int p = in.nextInt();
            int q = in.nextInt();
            int r = in.nextInt();
            result = p + q + r;
            if (result >= 2) {
                count++;
            }
        }


        System.out.println(count);

    }
}
