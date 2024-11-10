import java.util.*;
class A
{
public void callme()
{
System.out.println("inside class A");
}
}
 class B extends A
{
public void callme()
{
System.out.println("inside class B");
}
}
class C extends A
{
public void callme()
{
System.out.println("inside class C");
}
}

class override1
{
public static void main(String args[])
{
A a=new A();
B b=new B();
C c=new C();
 
A r;

r=a;
r.callme();

r=b;
r.callme();

r=c;
r.callme();
}
}