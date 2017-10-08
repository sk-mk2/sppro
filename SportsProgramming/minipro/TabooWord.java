import java.util.*;

public class TabooWord{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String W = sc.next();
        String S = sc.next();
        if(S.lastIndexOf(W) != -1){
            System.out.println("NG");
        }else{
            System.out.println(S);
        }
    }
}
