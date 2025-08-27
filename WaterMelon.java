import java.util.Scanner;

public class WaterMelon {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of kg:");
        int kg = in.nextInt();
        if (kg%2==0 && kg!=2){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
