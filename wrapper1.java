import java.io.*;
class wrapper1
{
public static void main(String args[])
{
Float pamount=new Float(0);
Float intrate=new Float(0);
int numyears=0;

try
{
DataInputStream in=new DataInputStream(System.in);
System.out.println("enter the principal amount:");
System.out.flush();

String principalstring=in.readLine();
pamount=Float.valueOf(principalstring);

System.out.println("enter the interest rate:");
System.out.flush();

String instring=in.readLine();
intrate=Float.valueOf(instring);

System.out.println("enter the years:");
System.out.flush();

String yearstring=in.readLine();
numyears=Integer.parseInt(yearstring);
}
catch(IOException e)
{
System.out.println(e);
System.exit(0);
}

float value=loan(pamount.floatValue(),intrate.floatValue() ,numyears);

printLine();
System.out.println("\nFinal value="+value);
printLine();
}
public static float loan(float x, float y, int z)
{
float si;
si=(x*y*z)/100;
return(si);
}
public static void printLine()
{
for(int i=0;i<=30;i++)
{
System.out.print("=");
}
}
}