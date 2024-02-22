
package main;

import account.account;
public class Main {

    public static void main(String[] args) {
        account acc= new account();
        acc.display();
        acc.withdraw(200);
        acc.deposit(2200);        
        acc.display();
        
        acc.withdraw(400);
        acc.display();    }
    
}
