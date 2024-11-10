import java.util.*;
class A
{
protected int a,b,c;
public void cal(int x,int y)
{
a=x;
b=y;
c=a+b;
System.out.println("addition is:"+c);
}
}

class B extends A
{
public void cal(int x,int y)
{
a=x;
b=y;
c=a-b;
System.out.println("substraction is:"+c);
}
}

class C extends A
{
public void cal(int x,int y)
{
a=x;
b=y;
c=a*b;
System.out.println("multiplication is:"+c);
}
}

class override2
{
public static void main(String args[])
{
A a=new A();
B b=new B();
C c=new C();

A r;

r=a;
r.cal(10,20);

r=b;
r.cal(20,10);

r=c;
r.cal(5,5);
}
}

