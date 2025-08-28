import java.util.LinkedList;
import java.util.Scanner;

public class SearchOnKLast {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int size=sc.nextInt();
        System.out.println("Enter numbers");
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }
        System.out.println("enter number K");
        int k = sc.nextInt();
        System.out.println(list.get(list.size()-k));
// 1 2 3 4 5 6 7 8 k=2
    }
}
