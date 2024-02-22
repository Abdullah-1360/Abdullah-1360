/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import account.account;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        account acc= new account();
        acc.display();
        acc.withdraw(200);
        acc.deposit(2200);        
        acc.display();
        
        acc.withdraw(400);
        acc.display();    }
    
}
