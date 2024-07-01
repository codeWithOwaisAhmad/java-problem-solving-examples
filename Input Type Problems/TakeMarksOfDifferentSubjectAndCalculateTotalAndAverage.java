

import java.util.Scanner;

public class TakeMarksOfDifferentSubjectAndCalculateTotalAndAverage {
    double mathematics;
    double biology;
    double physics;
    double chemistry;
    double totalMarks;
    double percentage;

    public static void main(String[] args) {
        TakeMarksOfDifferentSubjectAndCalculateTotalAndAverage takeMarksOfDifferentSubjectAndCalculateTotalAndAverage = new TakeMarksOfDifferentSubjectAndCalculateTotalAndAverage();
        takeMarksOfDifferentSubjectAndCalculateTotalAndAverage.takingMarksAsInput();
        takeMarksOfDifferentSubjectAndCalculateTotalAndAverage.calculatingTotalMarks();
        takeMarksOfDifferentSubjectAndCalculateTotalAndAverage.calculatingPercentage();
        takeMarksOfDifferentSubjectAndCalculateTotalAndAverage.printingTotalMarksAndPercentage();
    }
    void takingMarksAsInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Marks Of Mathematics: ");
        mathematics = scanner.nextDouble();
        System.out.println("Enter The Marks Of Biology:  ");
        biology = scanner.nextDouble();
        System.out.println("Enter The Marks Of Physics: ");
        physics = scanner.nextDouble();
        System.out.println("Enter The Marks Of Chemistry: " );
        chemistry = scanner.nextDouble();
    }
    void calculatingTotalMarks(){
        totalMarks = mathematics + chemistry + biology + physics;
    }
    void  calculatingPercentage(){
        percentage = totalMarks / 4;
    }
    void printingTotalMarksAndPercentage(){
        System.out.println("The total Marks Are: "+ totalMarks);
        System.out.println("The Percentage is: "+ percentage);
    }
}
