package LINE;

import java.util.HashMap;
import java.util.Map;

public class App2 {
    private static Map morseMap;
    public static void main(String[] args) {
        inputCheck(args);
        mapInitialize();
        String input = args[0];
        String output = "";
        for(int i = 0;i<input.length();i++){
            output += morseMap.get(String.valueOf(input.charAt(i)));
        }
        System.out.println(input);

        System.out.println(output);
    }
    private static void inputCheck(String[] input) {
        if(input.length != 1)
            java.lang.System.exit(1);
        if(input[0].matches("^[^\\x2e|\\x2d]+$"))
            java.lang.System.exit(1);
    }
    private static void mapInitialize(){
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
