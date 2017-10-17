import java.util.*;

public class Fib{
    public static void main(String args[]){
        int ans[] = {0,1,1,2,3,5,8,13,5,2,7,9,0,9,9,2,11,13,8,5,13,2,15,1};
        Scanner sc =new Scanner(System.in);
        int floor;
        for(;sc.hasNext();){
            System.out.println(ans[sc.nextInt() % 24]);
        } 
    }

}
