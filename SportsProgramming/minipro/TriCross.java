import java.util.*;

public class TriCross{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        String[] str = sc.next().split(",");
        Integer[] p1 = {Integer.parseInt(str[0]),Integer.parseInt(str[1])};
        str = sc.next().split(",");
        Integer[] p2 = {Integer.parseInt(str[0]),Integer.parseInt(str[1])};
        str = sc.next().split(",");
        Integer[] p3 = {Integer.parseInt(str[0]),Integer.parseInt(str[1])};
        str = sc.next().split(",");
        Integer[] p4 = {Integer.parseInt(str[0]),Integer.parseInt(str[1])};
        str = sc.next().split(",");
        Integer[] p5 = {Integer.parseInt(str[0]),Integer.parseInt(str[1])};
        str = sc.next().split(",");
        Integer[] p6 = {Integer.parseInt(str[0]),Integer.parseInt(str[1])};
            
         
        Triangle tri1 = new Triangle(p1[0],p1[1],p2[0],p2[1],p3[0],p3[1]);
        Triangle tri2 = new Triangle(p4[0],p4[1],p5[0],p5[1],p6[0],p6[1]);
        if(!tri1.judgeInOut(tri2)) {
            if(!tri2.judgeInOut(tri1)) {
                System.out.println("outside");
            }
        }

    
    }
}
class Triangle{
    Point2D p1,p2,p3;
    Point2D vec1,vec2,vec3;
    Triangle(int x1,int y1,int x2,int y2,int x3,int y3) {
        p1 = new Point2D(x1, y1); 
        p2 = new Point2D(x2, y2); 
        p3 = new Point2D(x3, y3); 
        vec1 = new Point2D(x2-x1,y2-y1);
        vec2 = new Point2D(x3-x2,y3-y2);
        vec3 = new Point2D(x1-x3,y1-y3);
    }
    boolean isInclude(Point2D p) {
        Point2D vp1 = new Point2D(p.x-p1.x,p.y-p1.y);
        Point2D vp2 = new Point2D(p.x-p2.x,p.y-p2.y);
        Point2D vp3 = new Point2D(p.x-p3.x,p.y-p3.y);
        if(vec1.cross(vp1) < 0 && vec2.cross(vp2) < 0 && vec3.cross(vp3) < 0) {
            return true;
        }
        if(vec1.cross(vp1) > 0 && vec2.cross(vp2) > 0 && vec3.cross(vp3) > 0) {
            return true;
        }
        return false;
    }
    
    boolean judgeInOut(Triangle tri) {
        //引数の三角の点がすべてこの三角形の中にあればinside
        //中途半端にあればcross
        //全部外の場合、この三角が引数三角のinsideか
        //それぞれ離れていてoutside
        if(this.isInclude(tri.p1) && this.isInclude(tri.p2) && this.isInclude(tri.p3)) {
            System.out.println("inside");
            return true;
        }
        if(this.isInclude(tri.p1) || this.isInclude(tri.p2) || this.isInclude(tri.p3)) {
            System.out.println("cross");
            return true;
        }
        return false;
    }
}

class Point2D{
    int x;
    int y;
    Point2D(int x,int y){
        this.x = x;
        this.y = y;
    }
    void print() {
        System.out.print("(" + x + "," + y + ")");
    }

    int cross(Point2D p) {
        return x * p.y - y * p.x;
    }
}

