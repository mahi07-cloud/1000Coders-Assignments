package Assignment;

// Student Result: Create a class StudentResult
// with static methods
// calculateTotal() and calculateAverage().

public class StudentResult
{
    public static int calculateTotal(int[] marks)
    {
        int sum=0;
        for (int x:marks) {
            sum = sum + x;
        }
        return sum;
    }
    public static int calculateAverage(int[] marks)
    {
        int total=calculateTotal(marks);
        return (int) ((double) total/marks.length);
    }
    public static void main(String[] args)
    {
        int [] marks={2,4,5,6,7};

        System.out.println("Average "+ calculateAverage(marks));
        System.out.println("Total "+ calculateTotal(marks));

    }
}
