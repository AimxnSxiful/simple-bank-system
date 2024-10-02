import java.util.Scanner;
public class BankSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account[] accounts = {
            new Account("Amir", 100.0),
            new Account("Ali", 500.0),
            new Account("Aiman", 1200.0)
        };

        System.out.println("Please enter your name");
        String enteredName = scanner.nextLine();

        Account currentAccount = null;

        for(Account account:accounts){
            if(account.getName().equalsIgnoreCase(enteredName)){
                currentAccount = account;
                break;

            }



        }
        if(currentAccount == null){
            System.out.println("The Account name is not available");
            System.exit(0);
        }
        int choice;
        do{
            System.out.println("\nBanking Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch(choice){
                case 1:
                    currentAccount.checkBalance();
                    break;
                case 2:
                    System.out.print("Enter amount to deposit:");
                    double depositAmount = scanner.nextDouble();
                    currentAccount.deposit(depositAmount);
                    break;
                case 3:
                    System.out.print("Enter amount to Withdraw:");
                    double withdrawAmount = scanner.nextDouble();
                    currentAccount.withdraw(withdrawAmount);
                    break;

                case 4:
                    System.out.println("Exit the system");
                    System.exit(0);
                default:
                    System.out.println("Invalid action");




            }
        } while (choice !=4);
        scanner.close();

        
    }
    
}
