import java.lang.*;
abstract class A
{
abstract void show();
public void dislay()
{
System.out.println("non-abstact function");
}
}

class B extends A
{
public void show()
{
System.out.println("abstract function");
}
public void display()
{
System.out.println("non abstract function");
} 
}

class abstract1
{
public static void main(String args[])
{
B b=new B();
b.display();
b.show();
b.display();
}
}