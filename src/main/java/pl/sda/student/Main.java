package pl.sda.student;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Jan", "Kowalski", 44);
        User user2 = new User("Marcin", "Nowak", 66);
        User user3 = new User("Katarzyna", "Dobroń", 33);
        User user4 = new User("Ola", "Lewandowska", 33);

        BankAccount bankAccount1 = new BankAccount(1, "BankDlaBogatych", 5555, 6555);
        BankAccount bankAccount2 = new BankAccount(2, "BankNowoczesny", 4444, 6532455);
        BankAccount bankAccount3 = new BankAccount(3, "Bank", 3333, 234234);
        BankAccount bankAccount4 = new BankAccount(4, "BigBank", 2222, 2342);


        Bank bankDlaBogatych = new Bank(user1, 1);
        Bank bankNowoczesny = new Bank(user2, 2);
        Bank bank = new Bank(user3, 3);
        Bank bigBank = new Bank(user4, 4);

     /*   System.out.println("Imię: " + bankDlaBogatych.getUser().getName());
        System.out.println("Nazwisko: " + bankDlaBogatych.getUser().getLastName());
        System.out.println("Wiek: " + bankDlaBogatych.getUser().getAge());
        System.out.println("Nr konta: " + bankAccount1.getAccountNumber());
        System.out.println("Saldo: " + bankAccount1.getBalance());

      */

        Scanner scanner= new Scanner(System.in);

        System.out.println("Podaj ID konta od 1 do 4");
        String ID = scanner.next();

        int bankAccountID = Integer.parseInt(ID);

        switch (bankAccountID) {

            case 1:
                System.out.println("Imię: " + bankDlaBogatych.getUser().getName());
                System.out.println("Nazwisko: " + bankDlaBogatych.getUser().getLastName());
                System.out.println("Wiek: " + bankDlaBogatych.getUser().getAge());
                System.out.println("Nr konta: " + bankAccount1.getAccountNumber());
                System.out.println("Saldo: " + bankAccount1.getBalance());
                break;

            case 2:
                System.out.println("Imię: " + bankNowoczesny.getUser().getName());
                System.out.println("Nazwisko: " + bankNowoczesny.getUser().getLastName());
                System.out.println("Wiek: " + bankNowoczesny.getUser().getAge());
                System.out.println("Nr konta: " + bankAccount2.getAccountNumber());
                System.out.println("Saldo: " + bankAccount2.getBalance());

            case 3:
                System.out.println("Imię: " + bank.getUser().getName());
                System.out.println("Nazwisko: " + bank.getUser().getLastName());
                System.out.println("Wiek: " + bank.getUser().getAge());
                System.out.println("Nr konta: " + bankAccount3.getAccountNumber());
                System.out.println("Saldo: " + bankAccount3.getBalance());
                break;

            case 4:
                System.out.println("Imię: " + bigBank.getUser().getName());
                System.out.println("Nazwisko: " + bigBank.getUser().getLastName());
                System.out.println("Wiek: " + bigBank.getUser().getAge());
                System.out.println("Nr konta: " + bankAccount4.getAccountNumber());
                System.out.println("Saldo: " + bankAccount4.getBalance());

            default:
        }

    }

}
