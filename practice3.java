import java.util.*;
import java.lang.*;

interface sortable
{
public void sort();
}

class bubblesort implements sortable
{
Scanner sc=new Scanner(System.in);
int arr[]=new int[5];
public void sort()
{
System.out.println("enter the elements of an array:");
for(int i=0;i<5;i++)
{
arr[i]=sc.nextInt();
}
for(int i=0;i<5;i++)
{
for(int j=i+1;j<5;j++)
{
int temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
System.out.println("elements of an array after sorting:");
for(int i=0;i<5;i++)
{
System.out.print(a[i]);
}
}
}

class practice3
{
public static void main(String args[])
{
bubblesort b=new bubblesort();
b.sort();
}
}