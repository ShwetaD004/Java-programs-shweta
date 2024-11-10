import java.lang.*;

class three extends Thread
{
public void run()
{
int i;
System.out.println("numbers dividied by 3:");
for(i=1;i<=50;i++)
{
if(i%3==0)
{
System.out.println(i);
}
}
}
}

class five extends Thread
{
public void run()
{
int i;
try
{
Thread.sleep(3000);
System.out.println("nubmers dividied by 5:");
for(i=1;i<=50;i++)
{
if(i%5==0)
{
System.out.println(i);
}
}
}
catch (InterruptedException e)
{
}
}
}

class seven extends Thread
{
public void run()
{
int i;
try
{
Thread.sleep(6000);
System.out.println("nubmers dividied by 7:");
for(i=1;i<=50;i++)
{
if(i%7==0)
{
System.out.println(i);
}
}
}
catch (InterruptedException e)
{
}
}
}

class thread4
{
public static void main(String ars[])
{
three t=new three();
t.start();

five f=new five();
f.start();

seven s=new seven();
s.start();
}
}

