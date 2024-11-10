import java.lang.*;

public class exception3
{
public static void main(String args[])
{
int a=10,b=0,result;
int arr[]=new int[5];
try
{
result=a/b;
try
{
arr[3]=5;
}
catch( ArrayIndexOutOfBoundsException e1)
{
System.out.println("error"+e1);
}
}
catch(ArithmeticException e1)
{
System.out.println("error"+e1);
}

System.out.println("hello");
}
}