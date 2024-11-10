import java.lang.*;
import java.util.*;
class args2{
  public static void main(String args[])
  {
  String name= new String();
  int accountnum;
  double balance;
  System.out.println("*****Bank Deatils*****");
  name=args[0];
  accountnum=Integer.parseInt(args[1]);
  balance=Double.parseDouble(args[2]);
  System.out.println("Name: "+name);
  System.out.println("Account no: "+accountnum);
  System.out.println("Balance: "+balance);
  }
}