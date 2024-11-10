import java.lang.*;

class Fruit
{
private double fprice;
private String fname;

Fruit(double fprice,String fname)
{
this.fprice=fprice;
this.fname=fname;
}

Fruit(Fruit fruit)
{
this.fprice=fruit.fprice;
this.fname=fruit.fname;
}

double showPrice()
{
return fprice;
}

String showName()
{
return fname;
}
}

class constructor1
{
public static void main(String args[])
{
Fruit f1=new Fruit(200,"orange");


System.out.println("price of fruit:"+f1.showPrice());
System.out.println("name of fruit:"+f1.showName());
Fruit f2=new Fruit(f1);
System.out.println("price of fruit:"+f2.showPrice());
System.out.println("name of fruit:"+f2.showName());
}

}
