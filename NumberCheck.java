package Assignment;

public class NumberCheck
{
    public static boolean isEven(int n)
    {
        return n%2==0;
    }
    public static void main(String[] args)
    {
        int num=7;
        if (NumberCheck.isEven(num))
        {
            System.out.println(num+" is Even ");
        }
        else {
            System.out.println(num+" is odd ");
        }
    }
}
