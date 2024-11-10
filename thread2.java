import java.lang.*;

class counterthread extends Thread
{
public counterthread()
{
start();
}
public void run()
{
int i;
for( i=1;i<=10;i++)
{
System .out.println(i);
}
}
}

class thread2
{
public static void main(String args[])
{
counterthread c=new counterthread();
}
}