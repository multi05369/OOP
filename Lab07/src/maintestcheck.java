
public class maintestcheck {
    public static void main(String[] args) {
        Account a1 = new CheckingAccount();
                a1.setName("Nook");
        System.out.println(a1);
        ((CheckingAccount)a1).setCredit(1000);
        System.out.println(a1); 
    }
}
