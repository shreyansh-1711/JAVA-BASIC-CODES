// program to create gui with event handling using awt controls
import java.awt.*;
import java.awt.event.*;
class LAB_11Event extends Frame implements ActionListener
{
Button b;
TextField tf;
TextField txt;
LAB_11Event()
{
b= new Button("click me");

tf = new TextField();
txt = new TextField();

tf.setBounds(60,50,170,20);
txt.setBounds(300,50,170,20);
b.setBounds(100,120,80,30);


b.addActionListener(this); 
add(b);
add(tf);
add(txt);

setSize(500,500);
setLayout(null);
setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
tf.setText("Welcome");
txt.setText("To Java");

}

public static void main(String args[])
{
new LAB_11Event();
}
}
