import java.util.*;
//https://paiza.jp/challenges/187/show
//??????

//不満度M以内に収めつつ、食事にかかる時間の最小値を出力
public class Cat{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//猫の数
        int M = sc.nextInt();//不満度の限界
        CatInfo cat[] = new CatInfo[N];
        for(int i = 0; i < N; i++) {
            cat[i] = new CatInfo(sc.nextInt(), sc.nextInt());
        }

        
}


    }
}

class CatInfo {
    int eatTime;
    int catLimit;
    CatInfo(int a,int b) {
        eatTime = a;
        catLimit = b;
    }
    void println() {
        System.out.println(this.eatTime+" "+this.catLimit);
    }

}

