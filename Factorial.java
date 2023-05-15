package Numbers;

import java.util.Scanner;

public class Factorial {
    public static void main(String[]args){
        Scanner F = new Scanner(System.in);
        System.out.println("Enter F:\t");
        int num = F.nextInt();
        int f=1;
        for(int i=1;i<=num;i++){
            f=f*i;
        }
        System.out.println("Factorial of\t"+num+"\tis:\t"+f);
    }
}
