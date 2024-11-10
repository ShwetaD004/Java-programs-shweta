import java.lang.*;
interface A
{
public void display();
}

class B
{
public void show()
{
System.out.println("learn interface");
}
}

class C extends B implements A
{
public void display()
{
System.out.println("learn inheritance");
}
}

class interface3
{
public static void main(String args[])
{
C c=new C();
c.show();
c.display();
}
}