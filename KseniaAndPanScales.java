import java.util.Scanner;

public class KseniaAndPanScales {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String value = in.next();
        String pointerLeft="";
        String pointerRight="";
        boolean flag = true;
        for (int i = 0; i < s.length(); i++) {
            if (flag){
                if (s.toCharArray()[i]=='|'){
                    flag=false;
                    continue;
                }
                pointerLeft+=s.toCharArray()[i];
            }else{
                pointerRight+=s.toCharArray()[i];
            }

        }
        if (((pointerRight.length()+pointerLeft.length()+value.length())%2==0)
            && !(pointerLeft.length()>(pointerRight.length()+value.length()))
             && !(pointerRight.length()>(value.length()+pointerLeft.length()))){
            for (int i = 0; i < value.length(); i++) {
                if (pointerLeft.length()>pointerRight.length()){
                    pointerRight+=value.toCharArray()[i];
                }else{
                    pointerLeft+=value.toCharArray()[i];
                }
            }
            System.out.println(pointerLeft+"|"+pointerRight);
        }else{
            System.out.println("Impossible");
        }

    }
}//3
