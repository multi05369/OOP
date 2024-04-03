import java.util.*;
public class Customer {
    private String firstName;
    private String lastName;
    //private Account acct[];
    private ArrayList acct;
    //private int numOfAccount;
    
    public Customer() {
        this("", "");
        //acct = new Account[5];
        acct = new ArrayList();
    }
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        //acct = new Account[5];
        acct = new ArrayList();
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public Account getAccount(int index) {
        //return acct[index];
        return ((Account) acct.get(index));
    }
    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " has " + this.getNumOfAccount() + " accounts.";
    }
    public boolean equals(Customer c) {
        return (this.firstName.equals(c.firstName) && (this.lastName.equals(c.lastName)));
    }
    public void addAccount(Account acct) {
        //this.acct[numOfAccount] = acct;
        //numOfAccount += 1;
        this.acct.add(acct);
    }
    public int getNumOfAccount() {
        //return this.numOfAccount;
        return this.acct.size();
    }
}
