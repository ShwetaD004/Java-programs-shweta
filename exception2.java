import java.lang.*;

public class exception2
{
public static void main(String args[])
{
int a=10,b=2,result;
int arr[]=new int[5];
try
{
result=a/b;
arr[8]=6;
}
catch(ArithmeticException e1)
{
System.out.println("error"+e1);
}
catch(ArrayIndexOutOfBoundsException e1)
{
System.out.println("error"+e1);
}
System.out.println("hello");
}
}