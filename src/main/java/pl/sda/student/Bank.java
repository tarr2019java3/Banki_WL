package pl.sda.student;

public class Bank {
    User user;
    int bankAccount;

    public Bank(User user, int bankAccount) {
        this.user = user;
        this.bankAccount = bankAccount;
    }

    public User getUser() {
        return user;
    }

    public int getBankAccount() {
        return bankAccount;
    }
}
