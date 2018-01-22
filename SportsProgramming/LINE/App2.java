/*処理ルール
  入力されたモールス符号列を復号し、その単語を文字列として標準出力に出力してください。
  使用されるモールス符号はA-Zのアルファベットのみ
  復号した単語は必ず一般的な英単語(基本形)となるので、それをヒントに復号時に枝刈りを行ってください。
  英単語はdictionary.txtに含まれるものになります。
  ただし、dictionary.txtにある単語をすべてモールス符号化して、入力と比較するような実装は評価しません。必ず入力を復元しながら枝刈りするようにしてください。
  仕様に反する入力を受け取った場合、終了コード1でプログラムを終了してください。
  */
/*
   出力ルール
   出力する単語はすべて小文字
   複数の候補が得られた場合には、そのうちひとつを出力してください。
*/
import java.util.HashMap;
import java.util.Map;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
public class App2 {

    private static Map morseMap;

    public static void main(String[] args) {
        inputCheck(args);
        morseMapInitialize();
        recursiveDecode(args[0],0);
    }

    private static void recursiveDecode(String input,int num){
        if(isWord(input)){
            System.out.println(input);
            java.lang.System.exit(0);
        }
        if(num == input.length())return;
        for(int i = num; i < input.length(); i++){
            recursiveDecode(input.substring(0,num)+morseMap.get(input.substring(num,i+1))+input.substring(i+1),num+1);
        }
    }

    private static boolean isWord(String input){
        try{
            File file = new File("dictionary.txt");
            BufferedReader br = new BufferedReader(new FileReader(file));
            String word = ""; 
            while((word = br.readLine()) != null){
                if(word.equals(input)){
                    return true;
                }
            }
            br.close();
        }catch(FileNotFoundException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
        return false;
    }

    private static void inputCheck(String[] input) {
        if(input.length != 1)
            java.lang.System.exit(1);
        if(input[0].matches("^[^\\.|\\-]+$"))
            java.lang.System.exit(1);
    }

    private static void morseMapInitialize(){
        morseMap = new HashMap<String,String>();
        morseMap.put(".-","a");
        morseMap.put("-...","b");
        morseMap.put("-.-.","c");
        morseMap.put("-..","d");
        morseMap.put(".","e");
        morseMap.put("..-.","f");
        morseMap.put("--.","g");
        morseMap.put("....","h");
        morseMap.put("..","i");
        morseMap.put(".---","j");
        morseMap.put("-.-","k");
        morseMap.put(".--..","l");
        morseMap.put("--","m");
        morseMap.put("-.","n");
        morseMap.put("---","o");
        morseMap.put(".--.","p");
        morseMap.put("--.-","q");
        morseMap.put(".-.","r");
        morseMap.put("...","s");
        morseMap.put("-","t");
        morseMap.put("..-","u");
        morseMap.put("...-","v");
        morseMap.put(".--","w");
        morseMap.put("-..-","x");
        morseMap.put("-.--","y");
        morseMap.put("--..","z");
    }
}
