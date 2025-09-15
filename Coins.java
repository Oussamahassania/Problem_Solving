import java.util.*;

public class Coins {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = 0, b = 0, c = 0;

        for (int i = 0; i < 3; i++) {
            String s = in.nextLine();
            char left = s.charAt(0);
            char sign = s.charAt(1);
            char right = s.charAt(2);

            if (sign == '>') {
                // left أثقل من right
                if (left == 'A') a++;
                if (left == 'B') b++;
                if (left == 'C') c++;
            } else {
                // left أخف من right => right أثقل
                if (right == 'A') a++;
                if (right == 'B') b++;
                if (right == 'C') c++;
            }
        }

        // نبني ArrayList مع العملة وقيمتها
        List<Coin> coins = new ArrayList<>();
        coins.add(new Coin('A', a));
        coins.add(new Coin('B', b));
        coins.add(new Coin('C', c));

        // الترتيب حسب القيمة
        coins.sort(Comparator.comparingInt(cn -> cn.value));

        // إذا الترتيب غير واضح (قيم متساوية) => Impossible
        if (coins.get(0).value == coins.get(1).value ||
                coins.get(1).value == coins.get(2).value) {
            System.out.println("Impossible");
        } else {
            for (Coin cn : coins) {
                System.out.print(cn.name);
            }
        }
    }

    static class Coin {
        char name;
        int value;
        Coin(char n, int v) {
            name = n;
            value = v;
        }
    }
}
