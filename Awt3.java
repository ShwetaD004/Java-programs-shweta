import java.awt.*;
import java.applet.*;
/*<html>
<applet code=Awt3.class height=700 width=500>
</applet>
</html>*/

public class Awt3 extends Applet
{
public void init()
{
Panel p=new Panel();
Label l1=new Label("select any one",Label.CENTER);
CheckboxGroup cg=new CheckboxGroup();
Checkbox c1=new Checkbox("true",cg,false);
Checkbox c2=new Checkbox("false",cg,false);

p.add(l1);
p.add(c1);
p.add(c2);

add(p);
}
}