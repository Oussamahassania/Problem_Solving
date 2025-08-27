import java.util.Scanner;

public class Pum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        for (int i=1;i<=n*4;i++){
            if (i%4==0){
                System.out.println("PUM");
            }else{
                System.out.print(i+" ");
            }
        }
    }
}


// 3
//1 2 3   PUM
//5 6 7   PUM
//9 10 11 PUM