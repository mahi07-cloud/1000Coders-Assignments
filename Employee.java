package Assignment;

public class Employee {
    int employeeId;
    String employeeName;
    double monthlySalary;

    public double calculateAnnualSalary() {
        double annualSalary = monthlySalary * 12;
        return annualSalary;
    }

    public void displayEmployeeDetails() {
        System.out.println(" Employee Id:" + employeeId + " Employee Name:" + employeeName + ""
                + " Monthly Salary:" + monthlySalary + " Annual Salary:" + calculateAnnualSalary());

    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.employeeId = 101;
        emp1.employeeName = "Rocky";
        emp1.monthlySalary = 30000;
        emp1.displayEmployeeDetails();

        Employee emp2 = new Employee();
        emp2.employeeId = 102;
        emp2.employeeName = "Rahul";
        emp2.monthlySalary = 45000;
        emp2.displayEmployeeDetails();

        Employee emp3 = new Employee();
        emp3.employeeId = 103;
        emp3.employeeName = "Madhu";
        emp3.monthlySalary = 30000;
        emp3.displayEmployeeDetails();

        Employee emp4 = new Employee();
        emp4.employeeId = 104;
        emp4.employeeName = "Rajiv";
        emp4.monthlySalary = 50000;
        emp4.displayEmployeeDetails();

        Employee emp5 = new Employee();
        emp4.employeeId = 105;
        emp4.employeeName = "Pavan";
        emp4.monthlySalary = 55000;
        emp4.displayEmployeeDetails();
    }
}