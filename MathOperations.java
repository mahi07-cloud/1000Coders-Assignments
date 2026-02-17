package Assignment;

public class MathOperations
{
    public static int square(int n)
    {
        int square=n*n;
        return square;
    }
    public static int cube(int n)
    {
        return n*n*n;

    }
    public static void main(String[] args)
    {
        System.out.println(square(2));
        System.out.println(cube(3));

    }
}