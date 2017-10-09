import java.util.*;

public class DiceGame {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Dice dice = new Dice(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt());
        int N = sc.nextInt();
        int map[] = new int[N];
        for(int i = 0; i < N; i++) {
            map[i] = sc.nextInt();
        }
        int pos = 0;
        int rotateCount = 0;
        while(pos != N-1){
            rotateCount += dice.go(map[++pos]);
        }
        System.out.println(rotateCount);
    }
}
class Dice {
    int T;
    int B;
    int U;
    int D;
    int L;
    int R;
    Dice(int T,int B,int U,int D,int L,int R) {
        this.T = T;
        this.B = B;
        this.U = U;
        this.D = D;
        this.L = L;
        this.R = R;
    }

    int go(int nextNum) {
        int count = 0;
        int tmp = 0;  
        if(nextNum == T) {
            count = 0;
        }else if(nextNum == U) {
            count = 1;
            tmp = U;
            U = T;
            T = tmp;
            tmp = D;
            D = B;
            B = tmp;
        }else if(nextNum == D) {
            count = 1;
            tmp = D;
            D = T;
            T = tmp;
            tmp = U;
            U = B;
            B = tmp;
        }else if(nextNum == R) {
            count = 1;
            tmp = R;
            R = T;
            T = tmp;
            tmp = L;
            L = B;
            B = tmp;
        }else if(nextNum == L) {
            count = 1;
            tmp = L;
            L = T;
            T = tmp;
            tmp = R;
            R = B;
            B = tmp;
        }else{
            count = 2;
            tmp = B;
            B = T;
            T = tmp;
        }
        return count;
    }

}
