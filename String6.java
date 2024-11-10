//Program of compare string
import java.lang.*;
class String6{
  public static void main(String args[])
   {
    String str= new String("cse");
    String str1= new String("cse");
    String str2= new String("CSe");

    System.out.println("str equals to str1: "+str.equals(str1));
    System.out.println("str equals to str2: "+str.equals(str2));
    System.out.println("str equals to str2: "+str.equalsIgnoreCase(str2));  
 }
}