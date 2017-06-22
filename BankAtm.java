package bankatm;

import session6_assignment2.BankATMException;
import java.util.Scanner;
                                                 //class having withdraw and deposit method for the main bank class
public class BankAtm{
int atmId;
String bankName;
String location;
double balance;

Scanner get = new Scanner(System.in);

                                                     // COntructor of BANKAtm having all the properties in the argument
public BankAtm(int atmId,String bankName,String location,double balance){
this.atmId =atmId;
this.bankName = bankName;
this.location = location;
this.balance = balance;

}

public void withdraw(double amt){                     //Withdraw method
if( balance < 10000){
System.out.println("*****************************");
throw new BankATMException("Balance is less than 10K");
}

else if( amt > balance ){
System.out.println("*****************************");
throw new BankATMException("Amount entered is more than Balance");
}
else {

balance = balance -amt;
System.out.println("*****************************");
System.out.println("your balance now is "+balance);
System.out.println("Thank You");
}
}

public void deposit(double amt){                      //deposit method  
System.out.println("*****************************");

balance = balance +amt;
System.out.println("your balnace is now :"+balance);
}
}