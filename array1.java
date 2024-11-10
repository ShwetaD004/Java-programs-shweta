// program to display n nos minimum number in array
import java.util.*;
import java.lang.*;
class array1
{
public static void main(String args[])
{
int min,i,n;
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of array:");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter the elements of array:");
for( i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
min=a[0];
for(i=1;i<n;i++)
{
if(a[i]<min)
{
min=a[i];
}
}
System.out.println("min elements is : "+min);
}
}

