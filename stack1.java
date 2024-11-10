import java.util.*;

class stack1
{
public static void main(String args[])
{
Stack s=new Stack();

s.push(10);
s.push("a");
System.out.println("element present in stack:"+s);
System.out.println("size of stack:"+s.size());
System.out.println("poped element in stack:"+s.pop());
System.out.println(" poped element in stack:"+s.pop());
System.out.println("stack is:"+s); 
System.out.println("size of stack :"+s.size());
}
}