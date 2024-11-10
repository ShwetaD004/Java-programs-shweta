import java.lang.*;
import java.util.*;

class BalException extends Exception
{
 private int details;
public BalException(int a)
{
details=a;
}
public String toString()
{
return ("your balance should be greater than 500"+details);
}
}
class Exceptiondemo4
{
static void checkbal(String nm,int acc_no,int bal) throws BalException
{
if(bal<500){
throw new BalException(bal);
}
else
{
System.out.println("*********details***********");
System.out.println("name is:"+nm);
System.out.println("account number is:"+acc_no);
System.out.println("balance is:"+bal);
}
}

public static void main(String args[])
{
String nm;
int acc_no,bal;
Scanner sc=new Scanner(System.in);
System.out.println("enter name:");
nm=sc.next();
System.out.println("enter account number:");
acc_no=sc.nextInt();
System.out.println("enter balance:");
bal=sc.nextInt();

try
{
checkbal(nm,acc_no,bal);
}
catch(BalException e)
{
System.out.println("caught"+e);
}
}
}
