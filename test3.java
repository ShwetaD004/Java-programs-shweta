import java.lang.*;
import java.util.*;
class number
{
protected int number;
public void get()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number:");
number=sc.nextInt();
}
}

class square extends number
{
public void calsquare()
{
int result=number*number;
System.out.println("square of the number is:"+result);
}
}

class cube extends number
{
public void calcube()
{
int result=number*number*number;
System.out.println("cube is:"+result);
}
}

class test3
{
public static void main(String args[])
{
square s=new square();
s.get();
s.calsquare();

cube c=new cube();
c.get();
c.calcube();
}
}
