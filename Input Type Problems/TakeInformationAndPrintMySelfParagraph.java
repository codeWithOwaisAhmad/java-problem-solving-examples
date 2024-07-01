import java.util.Scanner;

public class TakeInformationAndPrintMySelfParagraph {
    String name;
    String fatherName;
    int age;
    String occupation;
    String goal;
    String aspiration;

    public static void main(String[] args) {
        TakeInformationAndPrintMySelfParagraph takeInformationAndPrintMySelfParagraph = new TakeInformationAndPrintMySelfParagraph();
        takeInformationAndPrintMySelfParagraph.takingInformationAsInput();
        takeInformationAndPrintMySelfParagraph.printingMyselfParagraph();
    }
    void takingInformationAsInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        name = scanner.next();
        System.out.println("Enter Your Father Name: ");
        fatherName = scanner.next();
        System.out.println("Enter Your Age: ");
        age = scanner.nextInt();
        System.out.println("Enter Your Occupation: ");
        occupation = scanner.next();
        System.out.println("Enter Your Goal: ");
        goal = scanner.next();
        System.out.println("Enter Your Aspiration: ");
        aspiration = scanner.next();
    }
    void printingMyselfParagraph(){
        System.out.println("My name is " + name + ".My Father name is " + fatherName + ".My age is " + age + ".I am currently a " + occupation + ".My Goal is to become a " + goal + ".My aspiration is to gain " + aspiration);
    }
}
