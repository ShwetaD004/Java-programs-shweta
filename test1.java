import java.lang.*;
import java.util.*;
class student
{
protected String name;
protected int roll_no,marks;
public void get()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the name:");
name=sc.next();
System.out.println("enter the roll no:");
roll_no=sc.nextInt();
System.out.println("enter the marks of student:");
marks=sc.nextInt();

}
}

class result extends student
{
public void set()
{
System.out.println("name is:"+name);
System.out.println("roll no is:"+roll_no);
System.out.println("marks is:"+marks);
}
}

class test1
{
public static void main(String args[])
{
result r=new result();
r.get();
r.set();
}
}


