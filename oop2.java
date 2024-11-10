import java.lang.*;
import java.util.*;
class emp{
 Scanner sc=new Scanner(System.in);
 private String name;
 private int id;
 private double salary;
  
 public void get(){
  System.out.println("Enter employee's name,id & salary: ");
  name=sc.nextLine();
  id=sc.nextInt();
  salary=sc.nextDouble();
 }
 public void put(){
  System.out.println("Name: "+name);
  System.out.println("Id: "+id);
  System.out.println("Salary: "+salary);
 }
}
 
 class oop2{
 public static void main(String args[])
 {
  emp e1=new emp();
  emp e2=new emp();
 
  e1.get();
  e1.put();
  e2.get();
  e2.put();
 }
}