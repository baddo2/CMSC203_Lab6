
public class SavingsAccount extends BankAccount {

    private static final double RATE = 0.025;
    private  int savingsNumber = 0;
    private String accountNumber;

    
    public SavingsAccount(String name, double amount) {
        
    	super(name, amount);
        this.savingsNumber = savingsNumber++;
        this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
    }

    public void postInterest() {
        double interest = super.getBalance() * RATE / 12;
        super.deposit(interest);
    }

    @Override
    public String getAccountNumber() {
        return this.accountNumber;
    }

    public SavingsAccount(SavingsAccount originalAccount, double amount) {
        super(originalAccount, amount);
        this.savingsNumber++;
        this.accountNumber = super.getAccountNumber() + "-" + this.savingsNumber;
    }

}
