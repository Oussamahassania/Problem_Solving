import java.util.Scanner;

public class SomeSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 20 2 5
        System.out.println("Enter number:");
         int number= scanner.nextInt();
        System.out.println("enter the first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("enter the second number:");
        int secondNumber = scanner.nextInt();

        int sum=0;
       for (int i=1; i<=number; i++) {
           int temp=i;
           int sumOfDigits=0;
           while (temp>0){
               int digit = temp%10;
               sumOfDigits+=digit;
               temp = temp/10;
           }
           if (sumOfDigits>=firstNumber && sumOfDigits<=secondNumber){
               sum+=i;
           }
       }
        System.out.println(sum);
       //20
        //1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20

    }
}
