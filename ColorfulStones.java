import java.util.Scanner;

public class ColorfulStones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char []s = in.next().toCharArray();
        char []t = in.next().toCharArray();
        int count =0;
        for (int i = 0; i <t.length; i++) {
            if (s[count] == t[i]) {
                count++;
                if (count>=s.length) {
                    break;
                }
            }

        }
        System.out.println(count+1);

}//      r g b
 //      r r r

    //count=2
}
