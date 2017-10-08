import java.util.*;

public class AncientFormula{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String E = sc.nextLine();

        int answer=0;
        for(int i=0;i<E.length();i++){
            if(E.charAt(i)=='<')answer+=10;
            if(E.charAt(i)=='/')answer++;
        }
        System.out.println(answer);
    }
}
