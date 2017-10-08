import java.util.*;

public class Backup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int p = sc.nextInt();
        if(x%y==0)x--;
        int answer=(x/y+1)*p;
        System.out.println(answer);
    }
}
