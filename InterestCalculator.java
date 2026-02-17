package Assignment;

public class InterestCalculator {


    public static double calculateSI(double p, double t, double r) {
        double result = (p * t * r) / 100;
        return result;
    }

    public static void main(String[] args) {

        double SI = calculateSI(100, 2, 2);

        System.out.println("The Simple Interest is: " + SI);
    }
}