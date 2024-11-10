import java.awt.*;
import java.applet.*;
/*<html>
<applet code=Awt6.class height=700 width=500>
</applet>
</html>*/

public class Awt6 extends Applet
{
public void init()
{
Button b1,b2,b3,b4;
TextArea t1;
Panel p=new Panel();
BorderLayout f1=new BorderLayout();
p.setLayout(f1);

b1=new Button("first");
b2=new Button("second");
b3=new Button("third");
b4=new Button("fourth");

t1=new TextArea(10,25);

p.add(b1,"North");
p.add(b2,"South");
p.add(b3,"East");
p.add(b4,"West");
p.add(t1,"Center");
add(p);
}
}
