import java.lang.*;

class test

private int a,b,res;
public test()
{
a=12;
b=78;
}
public test(int a, int b
{
this.a=a;
this.b=b;
}
res=a=b;
System.out.println("sum="+res);
}
}

public class constructdemo2
{
public static void main(String args[])
{
test t1=new test();
test t2=new test(67,78);
t1.display();
t2.display();
}
}