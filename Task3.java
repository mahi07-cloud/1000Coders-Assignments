package Assignment;

public class Task3
{
    public static void StaticMethod()
    {
        System.out.println("First Static Method");
    }
    public void NonStaticMethod1()
    {
        System.out.println("First Non Static method");
    }
    public void NonStaticMethod2()
    {
        StaticMethod();
        NonStaticMethod1();
        System.out.println("Second non Static Method");
    }
    public static void main(String[] args)
    {
        Task3 obj1=new Task3();
        obj1.NonStaticMethod2();
    }
}
