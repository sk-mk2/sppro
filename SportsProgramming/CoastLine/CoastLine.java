import java.util.Scanner;

class CoastLine {
    static char[][] map;
    static int H=0;
    static int W=0;
    static int count=0;
    static Integer[] area =new Integer[100];
    static Integer[] line =new Integer[100];
    static int areaCount=0;
    static int lineCount=0;
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            area[i]=0;
            line[i]=0;
        }
        Scanner sc = new Scanner(System.in);
        H = sc.nextInt();
        W = sc.nextInt();
        String[] str = new String[H];
        for(int i = 0; i < H; i++) {
            str[i] = sc.next();
        }
        map = new char[H][W];
        for(int i = 0; i < H; i++) {
            for(int j = 0; j < W; j++) {
                map[i][j] = str[i].charAt(j);
            }
        }

       
      
        for(int i = 0; i < H; i++) {
            for(int j = 0; j < W; j++) {
                if(map[i][j] == '#') {
                    run(j,i);
                    areaCount++;
                    lineCount++;
                }
            }
        }
        for(int j = 0; j < 100;j++){
            int i = 0;
            int maxTmp = 0;
            while(i < 100) {
                if(area[maxTmp] < area[i]){
                    maxTmp=i;
                }
                if(area[maxTmp] == area[i]){
                    if(line[maxTmp] < line[i]){
                        maxTmp=i;
                    }
                }
                i++;
            }
            if(area[maxTmp]==0)break;
            System.out.println(area[maxTmp]+" "+line[maxTmp]);
            area[maxTmp]=0;
            line[maxTmp]=0;
        }
        
    }
    //4方向の値をみていく。
    public static void run(int x, int y) {

        if(x == -1 || x == W || y == -1 || y == H) return;
        if(map[y][x] != '#') return;
        map[y][x] = (char)('0'+lineCount);
        line[lineCount] += countLine(x,y);
        area[areaCount]++;
        run(x+1,y);
        run(x-1,y);
        run(x,y+1);
        run(x,y-1);
    }

    public static int countLine(int x,int y) {
       int ans = 0;
       int r=0;
       int l=0;
       int u=0;
       int d=0;
       if(x==0){
           ans++;
           l++;
       }
       if(x==W-1){
           ans++;
           r++;
       }
       if(y==0){
           ans++;
           u++;
       }
       if(y==H-1){
           ans++;
           d++;
       }
       if(l==0 && map[y][x-1]=='.'){
           ans++;
       }
       if(r==0 && map[y][x+1]=='.'){
           ans++;
       }
       if(u==0 && map[y-1][x]=='.'){
           ans++;
       }
       if(d==0 && map[y+1][x]=='.'){
           ans++;
       }
       return ans;
    }
}
