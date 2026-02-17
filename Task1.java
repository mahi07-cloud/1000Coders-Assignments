package Assignment;

public class Task1
{
    public void NonStaticMethod1()
    {
        System.out.println("First Non Static method");
        NonStaticMethod2();

    }
    public void NonStaticMethod2()
    {
        System.out.println("Second Non Static Method");

    }
    public static void main(String[] args)
    {
        Task1 obj1=new Task1();
        obj1.NonStaticMethod1();



    }
}
