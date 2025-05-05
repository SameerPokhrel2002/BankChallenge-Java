package BankChallenge;

public class Main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        ba.setAccountNumber("1234567890");
        ba.setAccountBalance(1234206.78);
        ba.setCustomerName("Sameer Pokhrel");
        ba.setEmail("sameerpokhrel2002@gmail.com");
        ba.setPhoneNumber("9844737905");
        ba.depositFund(123);
        ba.withdrawFund(321456);

    }
}
