package Collections;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
    public static void countDuplicateCharacters(String inputString) {
        HashMap<Character, Integer> count = new HashMap<>();
        char[] strArray = inputString.toCharArray();
        for (char c : strArray) {
            if (count.containsKey(c)) {
                count.put(c, count.get(c) + 1);
            } else {
                count.put(c, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : count.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
    public static void main(String args[]) {

        String str = "Kavya shree";
        countDuplicateCharacters(str);
    }
}
