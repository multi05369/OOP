package calculatesalary;
import java.util.Scanner;
public class CalculateSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please insert your name : ");
        String name = sc.nextLine();
        System.out.println("Please insert your age : ");
        int age = sc.nextInt();
        System.out.println("Please insert number of working days : ");
        int numDay1 = sc.nextInt();
        System.out.println("Please insert number of absent days : ");
        int numDay2 = sc.nextInt();
        System.out.println("Please insert your body weight : ");
        double weight = sc.nextDouble();
        int salary = 0;
        if ((age >= 21) && (age <= 30)) {
            salary = (numDay1 * 300) - (numDay2 * 50);
        } else if ((age >= 31) && (age <= 40)) {
            salary = (numDay1 * 500) - (numDay2 * 50);
        } else if ((age >= 41) && (age <= 50)) {
            salary = (numDay1 * 1000) - (numDay2 * 25);
        } else if ((age >= 51) && (age <= 60)) {
            salary = (numDay1 * 3000);
        }
        
        System.out.println("Hi, " + name);
        System.out.println("Your salary is " + salary + " Baht");
        
        if ((10 <= weight) && (weight <= 60)) {
            salary = salary + 5000;
        } else if ((61 <= weight) && (weight <= 90)) {
            salary = (int) ((int) salary +(5000 - ((weight - 60) * 10)));
        }
        
        System.out.println("Your salary and bonus is " + salary + " Baht");
    }
    
}
