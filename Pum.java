import java.util.Scanner;

public class Pum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
      int num = in.nextInt();
       for(int i=1;i<=num*4;i++){
           if (i%4==0){
               System.out.println("PUM");
           }else{
               System.out.print(i+" ");
           }

       }

    }
}


// 3
// 123pum
//567 pum
//91011pum