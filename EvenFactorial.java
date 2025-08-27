import java.util.Scanner;

public class EvenFactorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = in.nextInt();
        if (number>1){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
