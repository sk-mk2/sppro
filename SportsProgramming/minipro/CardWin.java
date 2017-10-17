import java.util.*;

public class CardWin{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        //敵の点数
        int enemyPoint = sc.nextInt();
        //自分のカードの点数を格納したList
        List<Integer> myPoint = new ArrayList<>();
        for(;sc.hasNext();){
            myPoint.add(sc.nextInt());
        }
        //自分のカードを使うか使わないかを管理する配列
        int cardFlg[] =new int[myPoint.size()];
        Arrays.fill(cardFlg, 0);
/*例えば、相手のカードの合計が10点で、手元のカードが3点, 6点, 7点, 9点の4枚だった場合、
(3, 9), (6, 7), (6, 9), (7, 9), (3, 6, 7), (3, 6, 9), (3, 7, 9), (6, 7, 9), (3, 6, 7, 9)の9通りがあります。

次のように標準入力から一行目に相手の合計点、二行目以降に手元のカードの点数が与えられた場合、
カードの出し方が何通りあるかを標準出力に出力するプログラムを作成してください。
なお、相手の合計点の最大は20000、手元のカードの点数の最大は500、枚数の最大は200とします。
*/
    }
    
}

