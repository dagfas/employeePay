import java.util.Scanner;

public class employeePay {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String employee1 = scanner.nextLine();

        System.out.println("How many hours did you work?");
        int hoursWorked = scanner.nextInt();

        int totalHoursWorked = hoursWorked;

        int overtimeWorked = totalHoursWorked - 35;

        if (totalHoursWorked > 35 && totalHoursWorked <60){
            System.out.println("Overtime pay for " + employee1 + " is " + overtimeWorked * 1.5);
            System.out.println();
        }else{
            System.out.println(employee1 + ", you cannot go beyond 60 hours per week");
        }


    }
}
