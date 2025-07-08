import java.util.Scanner;

class WaterMelon{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("enter number of kg of the wtermelon");
    int w=sc.nextInt();
    if (w>2 && w%2==0  ) {
        System.out.println("YES");
    }else{
        System.out.println("NO");
    }

}
}
