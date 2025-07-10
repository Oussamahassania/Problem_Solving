import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

import static javax.management.Query.value;

public class Digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number");
        int size=sc.nextInt();
        for (int i = 0; i < size; i++) {
            int value=sc.nextInt();
          while (value!=0){
              int mynum=value%10;
              System.out.print(mynum+" ");
              value=value/10;
          }
            System.out.println();

        }
    }
}

