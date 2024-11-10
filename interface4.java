import java.lang.*;
import java.util.*;
interface shape
{
public void getarea();
}

class rectangle implements shape
{
int l,b;
double area;
rectangle(int x,int y)
{
l=x;
b=y;
}
public void getarea()
{
area=l*b;
System.out.println("area of rectangle is:"+area);
}
}

class circle implements shape
{
double area;
int r;
circle(int z)
{
r=z;
}
public void getarea()
{
area=3.14*r*r;
System.out.println("area of circle is:"+area);
}
}

class triangle implements shape()
{
int b,h;
double area;
triangle(int a,int x)
{
b=a;
h=x;
}
public void getarea()
{
area=0.5*b*h;
System.out.println("area of  triangle is:"+area);
}
}

class interface4
{
public static void main(String args[])
{
rectangle r=new rectangle(5,10);
r.getarea();

circle c=new circle(5);
c.getarea();

triangle t=new triangle(5,10);
t.getarea();
}
}