import java.util.*;

class LinkedList1
{
public static void main(String args[])
{
LinkedList l1=new LinkedList();
l1.add("s");
l1.add("h");
l1.add("w");
l1.add("e");
l1.add("t");
l1.add("a");
System.out.println("content in linked list is:"+l1);
l1.addFirst("a");
l1.addLast("b");
System.out.println("content in linkedlist:"+l1);

l1.remove("s");
l1.remove(2);
l1.removeFirst();
System.out.println("after removing the element:"+l1);

Object val=l1.get(2);
l1.set(2,(String) val +"change");
System.out.println("content in list is:"+l1);
}
}