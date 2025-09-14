import java.util.Scanner;

public class GeorgeAndAccommodation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int person = in.nextInt();
            int roomSize = in.nextInt();
            if (roomSize-person>=2){
                count++;
            }
        }
        System.out.println(count);
    }
}
