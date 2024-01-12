
public class Account {
    public double balance;
    public String name;
    public void deposit(double b) {
        if (b >= 0) {
            balance += b;
        } else {
            System.out.println("The balnce variable must be greater than or equal to zero.");
        }
    }
    public double withdraw(double b) {
        if (b >= 0) {
            if (b < balance) {
                balance -= b;
                return balance;
            } else {
                System.out.println("Your account balance is insufficient.");
            }
        } else {
            System.out.println("The balnce variable must be greater than or equal to zero.");
        }
        return 0;
    }
    public void showInfo() {
        System.out.println("In " + name + " account, there is a balance equal to " + balance + " baht.");
    }
}
