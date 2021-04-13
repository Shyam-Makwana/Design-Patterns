package Proxy;

/*
 * @author Shyam Makwana
 */

public class AccountImpl implements Account {

    double customerBalance;
    String customerName;

    public AccountImpl(String custName, double balance) {
        this.customerName = custName;
        this.customerBalance = balance;
    }

    @Override
    public String withdraw(double amount) {
        String status;
        if (amount <= 0) {
            status = "Error: Negative Balance";
        } 
        else if ((this.customerBalance - amount) < 500.0) {
            status = "Error: Insufficient Balance. Min. Rs. 500 needed in your account.";
        } 
        else {
            this.customerBalance -= amount;
            status = "Withdrawal Succesful, Updated balance=" + this.customerBalance;
        }
        return status;
    }

    @Override
    public String deposit(double amount) {
        String status;
        if (amount <= 0) {
            status = "Error: Negative Balance";
        } 
        else {
            this.customerBalance += amount;
            status = "Deposit Succesful, Updated balance=" + this.customerBalance;
        }
        return status;
    }
}
