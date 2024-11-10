import java.lang.*;
import java.util.ArrayList;
public class arl1
{
public static void main(String args[])
{
ArrayList<Integer>arrlist=new ArrayList<Integer>(5);

arrlist.add(15);
arrlist.add(10);
arrlist.add(25);
arrlist.add(20);
arrlist.add(30);

for(Integer number:arrlist)
{
System.out.println(number);
}
int retvalue=arrlist.get(2);
System.out.println("elements is:"+retvalue);
}
}