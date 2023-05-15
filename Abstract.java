package Oops;

abstract class Demo{
    abstract void display();
}
class Details extends Demo {
    void display() {
        String name = "Kavyashree HP";
        int rollno = 28;
        System.out.println("Student name:\t"+name+"\nStudent rollno:\t"+rollno);
    }
}
public class Abstract {
    public static void main(String[]args){
        Demo s = new Details();
        s.display();
    }

}

