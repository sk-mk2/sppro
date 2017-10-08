import java.util.Scanner;
class Tbpgr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String command = sc.nextLine();
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        String str3 = sc.nextLine();
        int max =  str1.indexOf('=');
        if(max < str2.indexOf('=')) max = str2.indexOf('=');
        if(max < str3.indexOf('=')) max = str3.indexOf('=');
        if(command == l){
        }
        if(command == r){
        }
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);


    }
}
