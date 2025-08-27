import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Duplicated {
    public static void main(String[] args) {
        //O(n^2)
        /*
        Scanner in = new Scanner(System.in);
        LinkedList<Integer> linkedList=new LinkedList<>();
        for (int i=1; i<=10; i++) {
            linkedList.add(in.nextInt());
        }
        for (int i=0;i<linkedList.size();i++) {
            int temp=linkedList.get(i);
            for (int j=linkedList.size()-1;j>i;j--) {
                if ( linkedList.get(j).equals(temp)) {
                    linkedList.remove(j);
                }
            }
        }
        System.out.println(linkedList);

         */
        //O(n)
        Scanner in = new Scanner(System.in);
        LinkedList<Integer> linkedList=new LinkedList<>();
        for (int i=1; i<=10; i++) {
            linkedList.add(in.nextInt());
        }
        HashSet<Integer> hashSet=new HashSet<>();
        Iterator<Integer> iterator=linkedList.iterator();
        while (iterator.hasNext()) {
            int value = iterator.next();
            if (hashSet.contains(value)) {
                iterator.remove();
            }else {
                hashSet.add(value);
            }
        }
        System.out.print(linkedList);

//temp=1

// 1 2 1 2 3 4 4 5 66 66

    }
}
