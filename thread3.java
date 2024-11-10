import java.lang.*;

class even extends Thread
{
public void run()
{
int i;
System.out.println("even numbers:");
for(i=2;i<=10;i=i+2)
{
System.out.println(i);
}
}
}

class odd extends Thread
{
public void run()
{
int i;
try
{
Thread.sleep(3000);
System.out.println("odd numbers:");
for(i=1;i<=10;i=i+2)
{
System.out.println(i);
}
}
catch (InterruptedException e)
{
}
}
}

class thread3
{
public static void main(String ars[])
{
even v=new even();
v.start();

odd o=new odd();
o.start();
}
}

