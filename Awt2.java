import java.awt.*;
import java.applet.*;
/*<html>
<applet code=Awt2.class height=700 width=500>
</applet>
</html>*/

public class Awt2 extends Applet
{
public void init()
{
Panel p=new Panel();
Label l1=new Label("select any one",Label.CENTER);
Checkbox c1=new Checkbox("writing",false);
Checkbox c2=new Checkbox("reading",false);
Checkbox c3=new Checkbox("cooking",false);
p.add(l1);
p.add(c1);
p.add(c2);
p.add(c3);


add(p);
}
}
