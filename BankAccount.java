package BankChallenge;

public class BankAccount {
    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFund(double fund) {
        this.accountBalance += fund;
        System.out.println("Deposit of $" + fund + " made. New balance is $" + this.accountBalance);
    }

    public void withdrawFund(double fund) {
        if (accountBalance - fund < 0.0) {
            System.out.println(
                    "Can't withdraw as your balance is less than withdrawing amount!!" + accountBalance + "<" + fund);
        } else {
            this.accountBalance -= fund;
            System.out.println(
                    "$" + fund + " has been withdrawn from your account. Now, your balance is $" + this.accountBalance);
        }

    }

}
