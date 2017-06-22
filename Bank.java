package bank;
import bankatm.BankAtm;

import java.util.Scanner;
// class containing main program
class Bank{

public static void main(String args[]){
//three new objects of BankAtm 
BankAtm bank1 = new BankAtm(1010, "citi bank", "navi mumbai", 10000) ;
BankAtm bank2 = new BankAtm(1011, "citi bank", "navi mumbai", 15000) ;
BankAtm bank3 = new BankAtm(1012, "citi bank", "navi mumbai", 8000) ;

//calling withdraw and deposit methods using all three objects created above

bank1.withdraw(10000);
System.out.println("");       
bank2.deposit(500);
System.out.println("");


bank2.withdraw(2500);
System.out.println("");

bank3.deposit(1500);
bank3.withdraw(1000);



}
}