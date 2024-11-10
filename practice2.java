import java.util.*;
import java.lang.*;

interface perimeter
{
public void calperimeter();
}

class rectangle implements perimeter
{
public void calperimeter()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of l and b:");
int l=sc.nextInt();
int b=sc.nextInt();
int perimeter=(2*l)+(2*b);
System.out.println("perimeter od rectangle:"+perimeter);
}
}

class square implements perimeter
{
public void calperimeter()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of b:");
int b=sc.nextInt();
int perimeter=4*b;
System.out.println("perimeter od square:"+perimeter);
}
}

class practice2
{
public static void main(String args[])
{
rectangle r=new rectangle();
r.calperimeter();

square s=new square();
s.calperimeter();
}
}