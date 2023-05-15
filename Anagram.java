package String_Handling_Programs;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main (String[]args){
        Scanner A = new Scanner(System.in);
        System.out.println("Enter the String of A:\t");
        Scanner B = new Scanner(System.in);
        System.out.println("Enter the String of B:\t");
        String a1 = A.nextLine();
        String a2 = B.nextLine();

        if (a1.length() == a2.length())
        {
            char[] arr1 = a1.toCharArray();
            Arrays.sort(arr1);
            System.out.println(arr1);
            char[] arr2 =a2.toCharArray();
            Arrays.sort(arr2);
            System.out.println(arr2);

            if(Arrays.equals(arr1,arr2)==true) {
                System.out.println("Given String are anagrams");
            } else {
                System.out.println("Given String are not anagrams");
            }

        }
    }
}
