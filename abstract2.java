import java.lang.*;
abstract class A
{
abstract void display();
abstract void show();
}

class B extends A
{
public void display()
{
System.out.println("Drive a bike in pune");
}
public void show()
{
System.out.println("drive a car in pune");
}
}

class C extends A
{
public void display()
{
System.out.println("Drive a bike in mumbai");
}
public void show()
{
System.out.println("drive a car in mumbai");
}
}

class abstract2
{
public static void main(String args[])
{
B b=new B();
b.display();
b.show();
C c=new C();
c.display();
c.show();
}
}
