import java.util.Scanner;

public class GoodNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x =in.nextInt();
        int count = 0;
        for (int i = 0;i < n; i++) {
            String num = in.next();
            boolean isGood = true;
            for (int j = 0;j <= x; j++) {
                if(!num.contains(String.valueOf(j))){
                    isGood = false;
                    break;
                }
            }
            if (isGood) {
                count++;
            }
        }
        System.out.println(count);
    }
}
