import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for account name and balance
        System.out.print("Enter the name ==> ");
        String name = scanner.nextLine();

        System.out.print("Enter your balance ==> ");
        double balance = scanner.nextDouble();

       
        BankAccount firstAccount = new BankAccount(name, balance);
 
        System.out.print("Enter your withdrawal amount ==> ");
        double withdraw = scanner.nextDouble();
        firstAccount.withdraw(withdraw);

        System.out.print("Enter deposit amount ==> ");
        double deposit = scanner.nextDouble();
        firstAccount.deposit(deposit);
        
        firstAccount.displayAccountInfo();

        scanner.close();
    }
}
