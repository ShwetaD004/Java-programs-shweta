import java.lang.*;
abstract class instrument
{
abstract void sound();
}

class guitar extends instrument
{
public void sound()
{
System.out.println(" sound of guitar");
}
}

class tabala extends instrument
{
public void sound()
{
System.out.println("sound of tabala");
}
}

class abstract3
{
public static void main(String args[])
{
guitar g=new guitar();
g.sound();
tabala t=new tabala();
t.sound();
}
}