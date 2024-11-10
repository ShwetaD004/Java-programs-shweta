import java.lang.*;
import java.util.*;
class oop{
 private int rollno;
 private String name;

 public void get(){
 rollno=19;
 name="SHWETA";
 }
 
 public void put(){
 System.out.println("Roll number: "+rollno);
 System.out.println("Name: "+name);
 }
}
 class oop1{
 public static void main(String args[])
 {
  oop c1=new oop();
  c1.get();
  c1.put();
 } 

}