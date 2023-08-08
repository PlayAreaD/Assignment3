import java.util.Scanner;
public class Assignment3 {
    private static final Scanner scanner = new Scanner (System.in);
    
    public static void main(String[] args) {

        final String COLOR_RED_BOLD = "\033[31;1m";
        final String RESET = "\033[30;0m";
        String name;
        int age;
        String subject1;
        String subject2;
        String subject3;
        double marks1;
        double marks2;
        double marks3;

        final String ERROR_MSG =String.format("%s%s%s", COLOR_RED_BOLD, "%s", RESET);

        
    app:{
        System.out.print("Enter your name: ");
        name = scanner.nextLine().strip();

        if (name.length() ==0){
            System.out.printf(ERROR_MSG, "Name cannot be empty \n");
            //System.out.printf("%sName can't be empty%s\n", COLOR_RED_BOLD,RESET);

            break app;
        }

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        if (age <10 || age >18){
            System.out.printf(ERROR_MSG, "Invalid age\n");
            //System.out.printf("%sInvalid age%s\n", COLOR_RED_BOLD,RESET);
            break app;

        }
        //subject 1
        System.out.print("Enter subject 1: ");
        subject1 = scanner.nextLine().strip();

        if (subject1.isBlank()){
            System.out.printf(ERROR_MSG, "Subject can't be empty\n");
            break app;
        }
        else if (!subject1.startsWith("SE-")){
            System.out.printf(ERROR_MSG,"Invalid subject code");
            break app;
        }

        System.out.println("Enter marks for subject 1: ");
        marks1 = scanner.nextDouble();
        scanner.nextLine();

        if (marks1 <0 || marks1>100){
            System.out.printf(ERROR_MSG, "Invalid marks\n");
            break app;
        }








        


        }

        
        
    }
}