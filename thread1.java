import java.lang.*;

class counterthread extends Thread
{
public void run()
{
int i;
for( i=1;i<=10;i++)
{
System .out.println(i);
}
}
}

class thread1
{
public static void main(String args[])
{
counterthread c=new counterthread();
c.start();
}
}