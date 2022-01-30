import java.awt.*;
import java.applet.*;


/* 
<applet code="Applet8" width="800" height="800">
<param name="Name" value="SHREYANSH JAIN">
<param name="Age" value="19">
<param name="Sport" value="CRICKET">
<param name="Food" value="CHOLE">
<param name="Fruit" value="MANGO">
<param name="Destination" value="DUBAI">
</applet>
*/
  
  
public class Applet8 extends Applet 
{
String name;
String age;
String sport;
String food;
String fruit;
String destination;



public void init()
{
name = getParameter("Name");
age = getParameter("Age");
food = getParameter("Food");
fruit = getParameter("Fruit");
destination = getParameter("Destination");
sport = getParameter("Sport");
}



public void paint(Graphics g)
{
g.drawString("Reading parameters passed to this applet -", 20, 20);
g.drawString("Name -" + name, 20, 40);
g.drawString("Age -" + age, 20, 60);
g.drawString("Favorite fruit -" + fruit, 20, 80);
g.drawString("Favorite food -" + food, 20, 100);
g.drawString("Favorite destination -" + destination, 20, 120);
g.drawString("Favorite sport -" + sport, 20, 140);
}

}
