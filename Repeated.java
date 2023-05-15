package String_Handling_Programs;

import java.util.Scanner;

public class Repeated {
    public static void main(String[] args) {
        Scanner R = new Scanner(System.in);
        System.out.println("Enter a String:\t");
        String r = R.nextLine();
        int count = 0;
        char x =' ';
        for (int i = 0; i<r.length(); i++) {
                x=r.charAt(i);
            for (int j = i + 1; j<r.length(); j++) {
                if (x==r.charAt(j)) {
                    count++;
                    }
                }
            }
            if(count==1){
            System.out.println(x + "\tis First repeated character in a string");

        }

    }
}