import java.awt.*;
import java.applet.*;
/*<html>
<applet code=Awt1.class height=700 width=500>
</applet>
</html>*/

public class Awt1 extends Applet
{
public void init()
{
Panel p=new Panel();
Label l1=new Label("welcome",Label.RIGHT);
Label l2=new Label("abc",Label.LEFT);
Button b1=new Button("Add");

l1.setForeground(Color.red);
l1.setBackground(Color.yellow);

l2.setForeground(Color.red);
l2.setBackground(Color.yellow);

b1.setForeground(Color.red);
b1.setBackground(Color.blue);
p.setBackground(Color.green);

b1.setFont(new Font("Arial",Font.BOLD,40));

p.add(l1);
p.add(l2);
p.add(b1);
add(p);
}
}
