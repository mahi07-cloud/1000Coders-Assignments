package Assignment;

public class Calculator
{
    public static int add(int a, int b)
    {
        return a+b;
    }
    public static int sub(int a, int b)
    {
        return a-b;
    }
    public static int mul(int a, int b)
    {
        return a*b;
    }
    public static int div(int a, int b)
    {
        return a/b;
    }
    public static void main(String[] args)
    {
        System.out.println("Addition "+Calculator.add(10,5)+
                "\nSubtraction "+Calculator.sub(55,10)+
                "\nMultiplication "+Calculator.mul(7,11)+
                "\nDivision "+Calculator.div(35,7)
        );

    }
}
