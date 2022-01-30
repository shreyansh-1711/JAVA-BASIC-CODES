// different fonts
import java.awt.Graphics;
import java.awt.Font;



public class Font12 extends java.applet.Applet
{
public void paint(Graphics g)
{
Font f = new Font("TimesRoman", Font.PLAIN, 20);
Font fb = new Font("TimesRoman", Font.BOLD, 20);
Font fi = new Font("TimesRoman", Font.ITALIC, 20);
Font fbi = new Font("TimesRoman", Font.ITALIC+ Font.BOLD, 20);



g.setFont(f);



g.drawString("SHREYANSH JAIN", 10,25);
g.setFont(fb);
g.drawString("RAJASTHAN", 10,50);
g.setFont(fi);
g.drawString("UDAIPUR", 10,75);
g.setFont(fbi);
g.drawString("this is bold and italicfont", 10,100);
}
}



/*
<html>
<body>
<applet code = Font12 width=500 height=700>
</applet>
</body>
</html>
*/