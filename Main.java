package BankChallenge;

public class Main {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount("1234567890", 230.78, "Sameer Pokhrel", "sameerpokhrel2002@gmail.com",
                "9844737905");
        System.out.println("Account number: " + ba.getAccountNumber());
        System.out.println("Account holder's name: " + ba.getCustomerName());
        System.out.println("Starting balance: $" + ba.getAccountBalance());
        ba.depositFund(123);
        ba.withdrawFund(12);
        // ba.setAccountNumber("1234567890");
        // ba.setAccountBalance(1234206.78);
        // ba.setCustomerName("Sameer Pokhrel");
        // ba.setEmail("sameerpokhrel2002@gmail.com");
        // ba.setPhoneNumber("9844737905");
        // ba.depositFund(123);
        // ba.withdrawFund(321456);

    }
}
