package Oops;
class Override{
    void show(){
        System.out.println("Method");
    }
}
class Overriding extends  Override{
    void show(){
        System.out.println("\nMethod Overriding");
    }
}
public class OverloadingAndOverriding {
    static int add(int a, int b){
        return a+b;
    }
    static int add(int a,int b, int c){
        return a+b+c;
    }
    public static void main(String[]args){

        System.out.println("Method Overloading:-");
        System.out.println("Addition Of Two Numbers:");
        System.out.println(add(15,24));
        System.out.println("Addition Of Three Numbers:");
        System.out.println(add(20,21,28));

        Override obj = new Overriding();
        obj.show();
    }
}
