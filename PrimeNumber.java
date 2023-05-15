package Numbers;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[]args){
        Scanner P =new Scanner(System.in);
        System.out.println("Enter P:\t");
        int p = P.nextInt();
        int count =0;
        for (int i=1;i<=p/2;i++){
            if (p%i==0){
                count++;
            }
        }
        if(count==1){
            System.out.println(p+"\tis prime number");
        }else {
            System.out.println(p+"\tis not prime number ");
        }
    }

}
