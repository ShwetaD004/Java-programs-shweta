import java.lang.*;
import java.util.*;
class max
{
int a,b,c;
public void get(int x,int y,int z)
{
a=x;
b=y;
c=z;
if(a>b  && a>c)
{
System.out.println("a is greater"+a);
}
else if(b>a && b>c)
{
System.out.println("b is greater"+b);
}
else
{
System.out.println("c is greater"+c);
}
}
}

class B 
{
int a,b;
public void get(int z,int y)
{
a=z;
b=y;
if(z>y)
{
System.out.println("z is greater "+z);
}
else
{
System.out.println("y is greater"+y);
}
}
}

class test4
{
public static void main(String args[])
{
max m=new max();
m.get(5,10,15);

B b=new B();
b.get(5,10);
}
}






