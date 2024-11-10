import java.lang.*;
import java.util.HashMap;
public class hashmap1
{
public static void main(String args[])
{
HashMap<Integer ,String>hm=new HashMap<Integer,String>();

hm.put(19,"shweta");
hm.put(71,"disha");

System.out.println("size of the map is"+hm.size());

for(Map.Entry m:hm.entrySet())
{
System.out.println(hm);
}

  