import java.awt.*;
import java.applet.*;
/*<html>
<applet code=Awt8.class height=700 width=500>
</applet>
</html>*/

public class Awt8 extends Applet
{
public void init()
{
Button b1;
TextField t1,t2,t3;
Label l1,l2;

Panel p=new Panel();
GridLayout g1=new GridLayout(3,2);
p.setLayout(g1);

t1=new TextField(20);
t2=new TextField(20);
t3=new TextField(20);
l1=new Label("enter first number");
l2=new Label("enter second number");
b1=new Button("Add");

p.add(l1);
p.add(t1);
p.add(l2);
p.add(t2);
p.add(b1);
p.add(t3);

add(p);
}
}