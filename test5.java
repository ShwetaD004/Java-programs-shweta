import java.util.*;
import java.lang.*;
abstract class shape
{
abstract void getarea();
abstract void getparamater();
}

class rectangle extends shape
{
private int l,b;
double area;
public void getparameter(int a,int c)
{
a=l;
c=b;
}
public void getarea()
{
area=l*b;
System.out.println("area of rectangle is:"+area);
}
}

class circle extends shape
{
private int r;
double area;
public void getparameter(int a)
{
a=r;
}
public void getarea()
{
area=3.14*r*r;
System.out.println("area of rectangle is:"+area);
}
}

class test5
{
public static void main(String args[])
{
rectangle r=new rectangle();
r.getparameter(10,5);
r.getarea();

circle c=new circle();
c.getparameter(5);
c.getarea();
}
}