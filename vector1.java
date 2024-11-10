import java.util.*;

class vector1
{
public static void main(String args[])
{
int i;
Vector v=new Vector();

v.addElement(10);
v.addElement(5.5);
v.addElement("hello");
v.addElement("hii");
v.addElement(10.5);
v.addElement(2500);
System.out.println("elements present in vector :"+v);

String s=new String("bye");
v.insertElementAt(s,3);
System.out.println("elements in vector after adding the string :"+v);

v.removeElementAt(2);
System.out.println("after removing element present in vector :"+v);

for(i=0;i<5;i++)
{
System.out.println("element at"+ i +"= "+v.elementAt(i));
}
}
}