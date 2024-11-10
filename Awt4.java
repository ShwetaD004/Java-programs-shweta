import java.awt.*;
import java.applet.*;
/*<html>
<applet code=Awt4.class height=700 width=500>
</applet>
</html>*/

public class Awt4 extends Applet
{
Label l1;
Button b;
List li;
TextField t;
public void init()
{
Panel p=new Panel();
p.setBackground(Color.green);
l1=new Label("list demo");
li=new List();
li.add("sports");
li.add("music");
li.add("reading");

b=new Button("add");

t=new TextField(10);

p.add(l1);
p.add(li);
p.add(t);
p.add(b);

add(p);
}
}