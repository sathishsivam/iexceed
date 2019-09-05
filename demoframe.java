import java.awt.*;
import java.awt.event.*;


class sample extends Frame implements ActionListener,MouseListener
  {
     Label l1,l2;
     TextField t1,t2;
     Button b;

    sample()
	{
	   setLayout(null);
	   setVisible(true);
	   setSize(400,400);
	   setBackground(Color.cyan);

	   l1=new Label("UserName");
	   l2=new Label("Password");

	   t1=new TextField();
	   t2=new TextField();
	   t2.setEchoChar('*');
	
	   b=new Button("Sign-in");
	   b.addActionListener(this);

	   Panel p=new Panel(new GridLayout(2,2));
	   p.add(l1);
	   p.add(t1);
	   p.add(l2);
	   p.add(t2);

	   add(p);
	   p.setBounds(100,100,420,90);

	   add(b);
	   b.setBounds(150,220,70,40);

	  addMouseListener(this);
 
	}

	public void actionPerformed(ActionEvent e)
	{
	   System.out.println(""+t1.getText());
	   System.out.println(""+t2.getText());
	
	}

	public void mousePressed(MouseEvent d){}
	public void mouseReleased(MouseEvent d){}
	public void mouseClicked(MouseEvent d){}
	public void mouseEntered(MouseEvent d)
	{
	   System.out.println(""+t1.getText());
	   System.out.println(""+t2.getText());

	}
	public void mouseExited(MouseEvent d){}

  }

class demoframe
 {
    public static void main(String d[])	
	{
	   sample obj=new sample();
	}
 }