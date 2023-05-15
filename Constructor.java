package Oops;
class Cone{
    Cone(){
        System.out.println("Constructor");
    }
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
}
public class Constructor {
    public static void main(String[]args){
        Cone obj = new Cone();
        System.out.println("\nAddition:");
        System.out.println(obj.add(24,15));
        System.out.println("Subtraction:");
        System.out.println(obj.sub(24,15));
    }
}
