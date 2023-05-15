package Oops;
class A{
    public void methodA(){
        System.out.println("Child Class one");
    }
}
class B extends A{
    public void methodB(){
        System.out.println("Child class two");
    }
}
public class Inheritance {
    public static void main(String[]args){
        System.out.println("Super Class");
        B obj = new B();
        obj.methodA();
        obj.methodB();
    }

}
