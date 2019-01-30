import java.util.Scanner;

public class employeePay {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String employee1 = scanner.nextLine();

        System.out.println("How many hours did you work?");
        int hoursWorked = scanner.nextInt();

        int totalHoursWorked = hoursWorked;

        int hourlyMaximumPay = 25;
        int paycheckWithoutOT = totalHoursWorked * hourlyMaximumPay;
        int overtimeWorked = totalHoursWorked - 35;
        Double overtimePay = overtimeWorked * (hourlyMaximumPay * 1.5);
        Double totalPay = paycheckWithoutOT + overtimePay;


        if (totalHoursWorked <= 35){
            System.out.println(employee1 + ", your weekly total take home is " + paycheckWithoutOT);
        }
        else if (totalHoursWorked > 35 && totalHoursWorked <60){
            System.out.println("Overtime pay for " + employee1 + " is " + overtimePay);
            System.out.println(employee1 + ", your weekly total take home is " + totalPay );
        }else{
            System.out.println(employee1 + ", sorry you cannot go beyond 60 hours per week");
        }


    }
}
