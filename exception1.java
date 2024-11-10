import java.lang.*;

public class exception1
{
public static void main(String args[])
{
int a=10,b=0,result;

try
{
result=a/b;
}
catch(exception e1)
{
System.out.println("error"+e1);
}
System.out.println("hello");
}
}