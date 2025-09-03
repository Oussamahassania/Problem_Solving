import java.util.Scanner;

public class YaroslavAndPermutations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = in.nextInt();
        }
        int maxCount = 0;
        for (int j=0;j<size;j++) {
            int counter=0;
            for (int k=0;k<size;k++) {
                if (arr[j] == arr[k]) {
                    counter++;
                }
            }
            maxCount=Math.max(maxCount,counter);
        }
      if (maxCount>(size+1)/2){
          System.out.println("NO");
      }else{
          System.out.println("YES");
      }

    }
}
