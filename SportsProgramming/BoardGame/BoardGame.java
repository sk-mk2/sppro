import java.util.*;

public class BoardGame{
    enum BoardStatus{
        NONE("_"),
        BLACK("B"),
        WHITE("W");
        private String label;
        BoardStatus(String label){
            this.label = label;
        }
        public String getlabel(){
            return this.label;
        }
    }
    static BoardStatus[][] Board = new BoardStatus[8][8];
    static BoardStatus myColer;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //置く枚数
        int N = sc.nextInt();
        //リバーシのログが記録されている変数
        String log[][] =new String[N][3];
        //process
        /*盤面を用意し、ログをもとに石を置いていき、石をひっくり返す、
          ゲームが終わったら、盤面を走査しそれぞれの石の数を記録*/
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                Board[i][j] = BoardStatus.NONE;
            }
        }
        //初期盤面
        Board[3][3] = BoardStatus.WHITE;
        Board[3][4] = BoardStatus.BLACK;
        Board[4][3] = BoardStatus.BLACK;
        Board[4][4] = BoardStatus.WHITE;
        boardPrint();
        for(int i = 0; i < N; i++){
            for(int j = 0; j < 3; j++){
                String s = sc.next();
                log[i][j] = s;
            }
            if(log[i][0].equals("B")){
                Board[Integer.parseInt(log[i][1])-1][Integer.parseInt(log[i][2])-1] = BoardStatus.BLACK;
                myColer = BoardStatus.BLACK;
            }
            if(log[i][0].equals("W")){
                Board[Integer.parseInt(log[i][1])-1][Integer.parseInt(log[i][2])-1] = BoardStatus.WHITE; 
                myColer = BoardStatus.WHITE;
            }
            reverse(Integer.parseInt(log[i][1])-1,Integer.parseInt(log[i][2])-1);
            boardPrint();
        }
        winnerPrint();
    }

    public static void boardPrint(){
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                System.out.print(Board[j][i].getlabel());
            }
            System.out.println();
        }
    }
    public static void winnerPrint(){
        int blackStone=0,whiteStone=0; 
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(Board[i][j] == BoardStatus.BLACK){
                    blackStone++;
                }
                if(Board[i][j] == BoardStatus.WHITE){
                    whiteStone++;
                }
            }
        }
        if(blackStone-whiteStone>0){ 
            System.out.println(String.format("%02d",blackStone) +"-"+ String.format("%02d",whiteStone) +" The black won!");        
        }else if(blackStone-whiteStone<0){
            System.out.println(String.format("%02d",blackStone) +"-"+ String.format("%02d",whiteStone) +" The white won!");
        }else{
            System.out.println(String.format("%02d",blackStone) +"-"+ String.format("%02d",whiteStone) +" Draw");
        }
    }
    //判定する座標を受け取る
    public static void reverse(int x, int y){
        //nは返す枚数
        int n = 0;
        for(int moveX = -1;moveX < 2;moveX++){
            for(int moveY = -1;moveY < 2;moveY++){
                int bx = x;
                int by = y;
                while(true){
                    x += moveX;
                    y += moveY;
                    if(x < 0 || x > 7 || y < 0 || y > 7){
                        n = 0;
                        break;
                    }
                    if(myColer == Board[x][y]){
                        for(int i = 0;i < n;i++){
                            x -= moveX;
                            y -= moveY;
                                Board[x][y] = myColer;
                        }
                        n = 0;
                        break;
                    }
                    n++;
                }
                x = bx;
                y = by;
                }
            }
        }
    }


