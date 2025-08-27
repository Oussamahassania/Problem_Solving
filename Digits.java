import java.util.Scanner;
import java.util.Stack;

public class Digits {
    public static void main(String[] args) {
        // 12345
        //5 4 3 2 1
        Scanner in = new Scanner(System.in);
        // solution 1
      char[] ch = new char[0];
        System.out.println("Enter the n of numbers:");
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the number of digits:");
            String digit = in.next();
            for (int j = 1; j <= digit.length(); j++) {
                ch = digit.toCharArray();
                System.out.print(ch[ch.length-j]+ " ");

            }
        }


// solution 2
        /*
        System.out.println("Enter the number:");
        int number = in.nextInt();
        for (int i=0;i<number;i++){
            int value=in.nextInt();
            if (value == 0){
                System.out.println(0);
                continue;
            }
            while(value!=0){
                int myNum=value%10;
                System.out.print(myNum +" ");
                value/=10;
            }
            System.out.println();
        }

         */
    }


}
