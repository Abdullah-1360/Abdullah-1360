
package account;

public class account {
    String name;
    double balance=0;
    double Minbalance=1000;
     public void deposit(double amount){
        balance=balance+amount;
        System.out.println(amount+" deposited");
        if(balance<Minbalance){
            System.out.println("Account balance low deposit more...");
            minBalance();
        }
    }
    public void withdraw(double amount){
        if(balance<Minbalance){
            System.out.println("Can't withdraw amount ");
            minBalance();
        }
        else{   balance = balance -amount;
        System.out.println(amount+" Withdrawn");
    }
    }
   public  void display(){
        System.out.println("Amount: "+balance);
    }
   public void minBalance(){
       System.out.println("Minimum Balance should be: "+Minbalance);
   }
}
