package Oops;

interface Student{
    public void  data();
}
class kavya implements Student{
    public void data()
    {
        String name = "Kavyashree HP";
        int rollno = 28;
        System.out.println("Student name:\t"+name+"\nStudent rollno:\t"+rollno);
    }
}
public class Interface {
    public static void main(String[]args){
        kavya S = new kavya();
        S.data();
    }
}
