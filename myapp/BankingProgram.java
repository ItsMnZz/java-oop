package myapp;

import java.util.Scanner;

public class BankingProgram {

    private Scanner sc = new Scanner(System.in);

    private double balance = 10000;
    private boolean isRunning = true;
    private int choice;
    private double input;

    public BankingProgram() {

        System.out.println("****************");
        System.out.println("BANGKING PROGRAM");
        System.out.println("****************");
        System.out.println("1. Show Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");

        System.out.println("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.println("show balance");
                System.out.println(showBalance());
            }
            case 2 -> {
                System.out.println("deposit");
                System.out.println(deposit());
            }
            case 3 -> {
                System.out.println("withdraw");
                System.out.println(withdraw());
            }
            case 4 -> {
                System.out.println("exit");
                System.out.println(exit());
            }
            default ->
                System.out.println("unavailable choice");
        }

    }

    private double showBalance() {
        return balance;
    }

    private double deposit() {
        input = sc.nextDouble();
        return balance + input;
    }

    private double withdraw() {
        input = sc.nextDouble();
        return balance - input;
    }

    private String exit() {
        return "EXIT PROGRAM";
    }

}
