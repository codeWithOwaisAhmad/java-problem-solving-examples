

import java.util.Scanner;

public class TakeSalaryOfTwoEmployeesAndPrintAverage {
    float salaryOne;
    float salaryTwo;
    float averageSalary;
    public static void main(String[] args) {
        TakeSalaryOfTwoEmployeesAndPrintAverage takeSalaryOfTwoEmployeesAndPrintAverage = new TakeSalaryOfTwoEmployeesAndPrintAverage();
        takeSalaryOfTwoEmployeesAndPrintAverage.takingSalaryASInput();
        takeSalaryOfTwoEmployeesAndPrintAverage.calculatingTheAverage();
        takeSalaryOfTwoEmployeesAndPrintAverage.printingTheAverage();
    }
    void takingSalaryASInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Salary Of First Person: ");
        salaryOne = scanner.nextFloat();
        System.out.println("Enter The Salary Of Second Person: ");
        salaryTwo = scanner.nextFloat();
    }
    void calculatingTheAverage(){
        averageSalary = (salaryOne + salaryTwo) / 2;
    }
    void printingTheAverage(){
        System.out.println("The Average Salary Of Two Employees Is: " + averageSalary);
    }

}
