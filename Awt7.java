import java.awt.*;
import java.applet.*;
/*<html>
<applet code=Awt7.class height=700 width=500>
</applet>
</html>*/

public class Awt7 extends Applet
{
public void init()
{
GridLayout g1;
Button b1,b2,b3,b4;

Panel p=new Panel();
g1=new GridLayout(2,3);
p.setLayout(g1);

b1=new Button("first");
b2=new Button("second");
b3=new Button("third");
b4=new Button("fourth");

p.add(b1);
p.add(b2);
p.add(b3);
p.add(b4);

add(p);
}
}