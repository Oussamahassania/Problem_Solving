import java.util.Scanner;

public class SearchInMatrix {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        int r = in.nextInt();
        int [][]matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        int counter=0;
        int number  = in.nextInt();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(number == matrix[i][j]){
                    counter++;
                }
            }
        }
        if(counter>0){
            System.out.println("Will not take the number");
        }else{
            System.out.println("Will take the number");
        }

    }
}
