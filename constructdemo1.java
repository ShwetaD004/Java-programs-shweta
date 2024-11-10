import java.lang.*;
class test 
{
private int a,b,res;
public test()
{
a=12;
b=78;
}
public void display()
{
res=a+b;
System.out.println("sum="+res);
}
}

public class constructdemo1
{
public static void main(String args[])
{
test t1=new test();

t1.display();
test t2=new test();
t2.display();
}
}