public class Account{

    private String name;
    private double balance;

    public Account (String name, double balance){
        this.name = name;
        this.balance= balance;

    }

    public String getName(){
        return name;
    }

    public Double getBalance(){
        return balance;

    }

    public void setName(String name){
        this.name = name;
    }

    public void setBalance(Double balance){
        this.balance = balance;
        
    }


    public void checkBalance(){
        System.out.println("User:"+name + " Account Balance: " + balance);

    }

    public void withdraw(double amount){
        if(amount>balance){
            System.out.println("Balance is insufficient");
            
        }else if (amount <=0){
            System.out.println("Invalid withdrawal");


        }else{
            balance -= amount;
            System.out.println("Widthdrawal succeess:" + amount + "New balance:"+ balance);

        }


    }

    public void deposit(double amount){
        if(amount>0){
            balance += amount;
            System.out.println("New balance:"+ balance);

        }else{
            System.out.println("Invalid deposit");

        }

    }



    
}
