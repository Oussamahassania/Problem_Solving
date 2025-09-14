import java.util.*;

public class Horseshoe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 4; i++) {
            set.add(in.nextInt());
        }

        int result = 4 - set.size();
        System.out.println(result);
    }
}
