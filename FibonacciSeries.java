package Numbers;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[]args){
        Scanner F= new Scanner(System.in);
        System.out.println("Enter F:\t");
        int f= F.nextInt();
        int first=0, second=1;
        for (int i=1;i<=f;i++){
            System.out.println(first);
            int next = first + second;
            first=second;
            second=next;
        }
    }
}
