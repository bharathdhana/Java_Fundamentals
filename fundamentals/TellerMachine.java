
class MachineBalance{
    private double balance;

    public MachineBalance(){
        this.balance = 0.0;
        System.out.println("Initial balance set to zero.");
    }

    public MachineBalance(double initialBal){
        this.balance = initialBal;
        System.out.println("Initial balance set to: " + initialBal);
    }

    public void deposit(double amount){
        this.balance += amount;
        System.out.println("Amount deposited: " + amount);
    }

    public void withdraw(double amount){
        if(amount <=balance){
            this.balance -= amount;
            System.out.println("Amount withdrawn: " + amount);
        }
        else{
            System.out.println("Insufficient balance for withdrawal of: " + amount);
        }
    }

    public double getBalance(){
        return this.balance;
    }
}
public class TellerMachine {
    public static void main(String[] args) {
        MachineBalance machine = new MachineBalance(10000.0);
        machine.deposit(5000.0);
        System.out.println("Current balance: " + machine.getBalance());
        machine.withdraw(3000.0);
        System.out.println("after withdrawal: " + machine.getBalance());

        MachineBalance mybalance = new MachineBalance();
        mybalance.deposit(2000.0);
        System.out.println("Current balance: " + mybalance.getBalance());
        mybalance.withdraw(1000.0);
        System.out.println("after withdrawal: " + mybalance.getBalance());
    }
}
