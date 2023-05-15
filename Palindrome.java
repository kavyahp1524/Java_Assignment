package String_Handling_Programs;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[]args){
        Scanner pali = new Scanner(System.in);
        System.out.println("Enter String :\t");
        String p = pali.nextLine();
        String rev = "";
        for (int i=p.length()-1;i>=0;i--){
            rev = rev+p.charAt(i);
        }
        if (p.equals(rev)){
            System.out.println(rev + "\tis Palindrome");
        }else{
            System.out.println(rev + "\tis not a Palindrome");
        }
    }
}
