package Assignment;

public class Task2
{
    public void nonStaticMethod()
    {
        System.out.println("This is non static Method");
        StaticMethod();

    }
    public static void StaticMethod()
    {
        System.out.println("This is static Method");
    }

    public static void main(String[] args)
    {
        Task2 obj1=new Task2();
        obj1.nonStaticMethod();


    }
}
