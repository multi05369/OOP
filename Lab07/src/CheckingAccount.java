
public class CheckingAccount extends Account{
    private double credit;
    
    public CheckingAccount() {
        super(0, "");
        this.credit = 0;
    }
    public CheckingAccount(double balance, String name, double credit) {
        super(balance, name);
        this.credit = credit;
    }
    public void setCredit(double credit) {
        if (credit > 0) {
            this.credit = credit;
        }
        else {
            System.out.println("Input number must be a positive integer.");
        }
    }
    public double getCredit() {
        return this.credit;
    }
    public void withdraw(double a) {
        if (a > 0) {
            if ((getBalance() - a) > 0) {
                setBalance(getBalance() - a);
                System.out.println(a + " baht is withdrawn from " + getName() + " and your credit balance is " + getCredit() + ".");
            }
            else if (getBalance() - a + credit > 0) {
                setBalance(0);
                this.credit = credit - Math.abs(getBalance() - a);
                System.out.println(a + " baht is withdrawn from " + getName() + " and your credit balance is " + getCredit() + ".");
            }
            else if ((getBalance() - a) + credit < 0) {
                System.out.println("Not enough money!");
            }
        }
    }
    public void withdraw(String a) {
        withdraw(Double.parseDouble(a));
    }
    @Override
    public String toString() {
        return "The " + name + " account has " + balance + " baht and " + credit + " credits.";
    }
    
}
