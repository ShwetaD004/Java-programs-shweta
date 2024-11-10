import java.lang.*;
interface A
{
public void show();
}

interface B
{
public void display();
}

class C implements A,B
{
public void show()
{
System.out.println("java");
}
public void display()
{
System.out.println("programming");
}
}

class interface2
{
public static void main(String args[])
{
C c=new C();
c.show();
c.display();
}
}