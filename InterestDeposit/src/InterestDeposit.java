import java.util.Scanner;

public class InterestDeposit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int res = 0;
        System.out.println("Input your money : ");
        double money = sc.nextDouble();
        
        Scanner type = new Scanner(System.in);
        System.out.println("Input your account type(Please type A B C or X in uppercase) : ");
        char account = type.next().charAt(0);
        
        if (account == 'A') {
            double inter = 0.015 * money;
            res += (money + inter);
        } else if (account == 'B') {
            double inter = 0.02 * money;
            res += (money + inter);
        } else if (account == 'C') {
            double inter = 0.015 * money;
            res += (money + inter);
        } else if (account == 'X') {
            double inter = 0.05 * money;
            res += (money + inter);
        }
        System.out.println("Your total money in one year = " + res);
        
    }
}
