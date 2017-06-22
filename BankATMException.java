package session6_assignment2;
// creating custom exception for our bankAtm app
public class BankATMException extends RuntimeException{
String msg;
//constructor created to pring excepton error message
public BankATMException(String msg){
this.msg = msg;
System.out.println(msg);
}
}
