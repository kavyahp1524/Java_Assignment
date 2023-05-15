package Collections;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfOccurrences {
    static  void characterCount(String inputString){
        HashMap<Character,Integer> count = new HashMap<>();
        char[] strArray = inputString.toCharArray();
        for (char c: strArray){
            if (count.containsKey(c)){
                count.put(c,count.get(c)+1);
            }else {
                count.put(c,1);
            }
            }
        for (Map.Entry entry : count.entrySet()){
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }
    }
    public static void main(String[]args){
        String str = "Kavya";
        characterCount(str);
    }
}
