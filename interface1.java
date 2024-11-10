import java.lang.*;
interface A
{
public void show();
}

class B implements A
{
public void show()
{
System.out.println("Hello");
}
}

class C implements A
{
public void show()
{
System.out.println("hello");
}
}

class interface1
{
public static void main(String args[])
{
B b=new B();
b.show();

C c=new C();
c.show();
}
}