package Proxy;

/*
 * @author Shyam Makwana
 */

public class Test {

    public static void main(String[] args) {
        Account myAcc = new AccountProxy("Kisan", 500.0);
        System.out.println("Deposit Rs. 10,000");
        System.out.println("Transaction Status: " + myAcc.deposit(10000));
        System.out.println("Widthdraw Rs. 10,001");
        System.out.println("Transaction Status: " + myAcc.withdraw(10001));
    }
}
