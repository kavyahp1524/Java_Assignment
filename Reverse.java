package String_Handling_Programs;

import java.util.Scanner;

public class Reverse {
    public static void main(String[]args){
        Scanner R =new Scanner(System.in);
        System.out.println("Enter String :\t");
        String r = R.nextLine();
        String rev = "";
        for (int i=r.length()-1; i>=0;i--){
            rev = rev + r.charAt(i);
        }
        System.out.println(rev.toUpperCase());
    }
}
