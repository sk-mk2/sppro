import java.util.*;

public class Drill {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();//足し算の問題の総数
        int N = sc.nextInt();//引き算の問題の総数
        //0<=answer<=99
        int countP = 0;
	int countM = 0;
        for(int i = 0; i < 100; i++) {
            for(int j =0; j < 100; j++) {
                //適している
                if(i+j < 100 && i+j >= 0 && countP < M) {
                    System.out.println(i + " + " + j + " =");
                    countP++;
                }
		if(i-j < 100 && i-j >= 0 && countM < N) {
                    System.out.println(i + " - " + j + " =");
                    countM++;
                }
            }
        }
    }
}
