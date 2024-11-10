import java.awt.*;
import java.applet.*;
/*<html>
<applet code=Awt5.class height=700 width=500>
</applet>
</html>*/

public class Awt5 extends Applet
{
Label l1;
Button b;
Choice ch;
TextField t;
public void init()
{
Panel p=new Panel();
p.setBackground(Color.green);
l1=new Label("list demo");
ch=new Choice();
ch.add("sports");
ch.add("music");
ch.add("reading");

b=new Button("add");

t=new TextField(10);

p.add(l1);
p.add(ch);
p.add(t);
p.add(b);

add(p);
}
}