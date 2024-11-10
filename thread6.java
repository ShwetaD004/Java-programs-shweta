import java.lang.*;

class mythread implements Runnable
{
public void run()
{
try
{
for(int i=5;i>0;i--)
{
System.out.println("main thread"+i);
Thread.sleep(500);
}
}
catch(InterruptedException e)
{
System.out.println("exception pccurs");
}
System.out.println("main thread exisiting");
}
}

class thread6
{
public static void main(String args[])
{
mythread m1=new mythread();
Thread t1=new Thread(m1);
t1.start();
try
{
for(int i=5;i>0;i--)
{
System.out.println("my thread"+i);
Thread.sleep(1000);
}
}
catch(InterruptedException e)
{
System.out.println("exception occurs in my thread");
}
System.out.println("my thread existing");
}
}