import java.util.Scanner;

public class NightAtTheMuseum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.next();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        int currentPos = 0;
        int totalMoves = 0;

        for (int i = 0; i < string.length(); i++) {
           int targetPos=alphabet.indexOf(string.charAt(i));
           int clockWise=Math.abs(targetPos-currentPos);
           int counterClockwise=26-clockWise;
           totalMoves+=Math.min(clockWise,counterClockwise);
           currentPos=targetPos;
        }

        System.out.println(totalMoves);
    }
}
