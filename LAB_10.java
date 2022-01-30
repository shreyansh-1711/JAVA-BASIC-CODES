//to create GUI application without event handling using awt controls
import java.awt.*;
class LAB_10 extends Frame
{
LAB_10()
{
Button c = new Button("New button");
c.setBounds(75,130,100,50);
add(c); // 
setSize(500,500); 
setLayout(null); 
setVisible(true);

Button b = new Button("click me");
b.setBounds(30,100,80,30);
add(b); 
setSize(500,500); 
setLayout(null); 
setVisible(true); 

Button a = new Button("SHREYANSH ");
a.setBounds(120,100,80,30);
add(a); // 
setSize(500,500); 
setLayout(null); 
setVisible(true); 

}


public static void main(String args[])
{
LAB_10 f =new LAB_10();

}
}
