import java.util.Scanner;

public class SearchInMatrix {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int r=0;r<rows;r++){
            for (int c=0;c<cols;c++){
                matrix[r][c] = sc.nextInt();
            };
        }
        int number = sc.nextInt();
        int count=0;
        for (int r=0;r<rows;r++){
            for (int c=0;c<cols;c++){
           if (number == matrix[r][c]){
               count++;
           }
            };
        }
        if (count > 0){
            System.out.println("will not take number");
        }else{
            System.out.println(" will take number");
        }

    }
}
