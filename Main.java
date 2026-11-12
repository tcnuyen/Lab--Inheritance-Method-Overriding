import java.util.Scanner;

class Employee{
    double CalculateSalary(){
        return 0.0;
    }
}

class FullTimeEmployee extends Employee{
    double BasePay;
    double Bonus;

    FullTimeEmployee(double pay, double extra){
        BasePay = pay;
        Bonus = extra;
    }

    @Override
        double CalculateSalary(){
        return BasePay + Bonus;
    }
}

class PartTimeEmployee extends  Employee{
    double hourlyRate;
    double hoursWorked;

    PartTimeEmployee(double rate, double worked){
        hourlyRate = rate;
        hoursWorked = worked;
    }
    @Override
        double CalculateSalary(){
            return hourlyRate*hoursWorked;
    }
}

public class Main {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

    System.out.println("Enter employee type (full-time / part-time)");
        String type = input.nextLine();

    if (type.equals("full-time")){

        System.out.println("Enter base pay: ");
            double BasePay = input.nextDouble();

        System.out.println("Enter Bonus: ");
            double Bonus = input.nextDouble();

    FullTimeEmployee FTE = new FullTimeEmployee(BasePay, Bonus);
                System.out.println("Monthly Salary: $" + FTE.CalculateSalary());

    } else if (type.equals("part-time")){

        System.out.println("Enter hourly rate: ");
            double hourlyRate = input.nextDouble();

        System.out.println("Enter hours worked: ");
            double hoursWorked = input.nextDouble();

    PartTimeEmployee PTE = new PartTimeEmployee(hourlyRate, hoursWorked);
                System.out.println("Monthly Salary: $" + PTE.CalculateSalary());

    } else {
        System.out.println("invalid employee type");

    }

    }
}