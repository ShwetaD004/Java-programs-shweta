import java.lang.*;

class mythread implements Runnable
{
public void run()
{
try
{
for(int i=5;i>0;i--)
{
System.out.println("my thread "+i);
Thread.sleep(500);
}
}
catch(InterruptedException e)
{
System.out.println("my thread interrputed");
}
System.out.println("my thread existing");
}
}

public class thread5
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
System.out.println("main thread "+i);
Thread.sleep(1000);
}
}
catch(InterruptedException e)
{
System.out.println("main thread interrupted");
}
System.out.println("main thread exiting");
}
}