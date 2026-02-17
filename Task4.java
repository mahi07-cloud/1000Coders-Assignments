package BASICS;

public class Task4
{
    public static void main(String[] args)
    {
        String name="Mahendar";
        System.out.println("The name is "+name);

        int a=20;
        int b=10;
        System.out.println("Before Swapping");
        System.out.println("a="+a);
        System.out.println("b="+b);


        int temp=a;
        a=b;
        b=temp;
        System.out.println("After Swapping");
        System.out.println("a="+a);
        System.out.println("b="+b);

        int c=5;
        System.out.println("1st Assigned value="+c);
        c=26;
        System.out.println("2nd Assingned value="+c);

        int var1=2,var2=4,var3=6;
        System.out.println("Three var in a single line are Var1="+var1+" , Var2="+var2+" , Var3="+var3);


        String value="TYPE OF DATATYPE";
        System.out.println("Value is:"+value);
        System.out.println("DataType is:"+value.getClass().getSimpleName());


        int age=21;
        float height=5.6f;
        String city="Hyderabad";
        boolean isStudent=true;

        System.out.println("Age is"+age);
        System.out.println("Height is"+height);
        System.out.println("CIty is"+city);
        System.out.println("Is Student:"+isStudent);


        //ARITHEMATIC OPERATIONS

        int num1=20;
        int num2=4;
        int sum=num1+num2;
        System.out.println("Sum is "+sum);
        int sub=num1-num2;
        System.out.println("Subtraction is "+sub);
        int mul=num1*num2;
        System.out.println("Multiplication is "+mul);
        int div=num1/num2;
        System.out.println("Div is "+div);
        int mod=num1%num2;
        System.out.println("Modulus is "+mod);
    }
}
