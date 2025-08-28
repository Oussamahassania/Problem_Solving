import java.util.LinkedList;
import java.util.Scanner;

public class DeleteMiddleNode {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        LinkedList<String> list = new LinkedList<String>();
        for (int r=0;r<size;r++){
            list.add(sc.next());
        }
    }//
}
