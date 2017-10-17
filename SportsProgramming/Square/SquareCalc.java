import java.util.*;

public class SquareCalc{

    private static int field[][] = new int[1000][1000];
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int N = sc.nextInt();
        int ans = 0;
        for(int i = 0; i < 1000; i++)
            for(int j = 0; j < 1000; j++)
                field[i][j] = 0;    
        // 1 <= N <=10
        // 0 <= x, y, a < 100000
        

        for(;sc.hasNext();){
            point(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }
                
        for(int i = 0; i < 1000; i++)
            for(int j = 0; j < 1000; j++)
                if(field[i][j] == 1) ans++;
        System.out.println(ans);
    }

    public static void point(String operator, int x, int y, int length) {
        for(int i = 0; i < 1000; i++){
            for(int j = 0; j < 1000; j++){
                if(i >= x && j >= y && i < x + length && j < y + length) {
                    if(operator.equals("+")){
                        field[i][j] = 1;
                    }
                    if(operator.equals("-"))
                        field[i][j] = 0;
                }
            }
        }
        
    }
}



