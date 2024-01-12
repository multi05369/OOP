import java.util.*;

public class CalculateTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary = sc.nextDouble();
        
        if (salary > 50000.00) {
            double tax = 0.10 * salary;
            System.out.println(tax);
        } else {
            double tax = 0.05 * salary;
            System.out.println(tax);
        }
    }
}
