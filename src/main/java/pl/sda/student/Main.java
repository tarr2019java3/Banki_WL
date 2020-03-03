package pl.sda.student;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Jan", "Kowalski",44);
        User user2 = new User("Marcin", "Nowak", 66);
        User user3 = new User("Katarzyna", "Dobroń", 33);
        User user4 = new User("Ola", "Lewandowska", 33);

        BankAccount bankAccount1 = new BankAccount(1, "BankDlaBogatych", 5555, 6555);
        BankAccount bankAccount2 = new BankAccount(2, "BankNowoczesny", 4444, 6532455);
        BankAccount bankAccount3 = new BankAccount(3, "Bank", 3333, 234234);
        BankAccount bankAccount4 = new BankAccount(4, "BigBank", 2222, 2342);


       Bank bank1 = new Bank(user1, 1);
       Bank bank2 = new Bank(user2, 2);
       Bank bank3 = new Bank(user3, 3);
       Bank bank4 = new Bank(user4, 4);

        System.out.println("Imię: " + bank1.getUser().getName());
        System.out.println("Nazwisko: " + bank1.getUser().getLastName());
        System.out.println("Wiek: " + bank1.getUser().getAge());
        System.out.println("Nr konta: " + bankAccount1.getAccountNumber());
        System.out.println("Saldo: " + bankAccount1.getBalance());
    }

}
