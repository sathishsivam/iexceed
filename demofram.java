import java.awt.*;
import java.awt.event.*;

class sample extends Frame implements MouseListener
 {
    sample()
	{
	   setVisible(true);
	   setSize(400,400);
	   addMouseListener(this);
	}
	public void  mouseExited(MouseEvent d)
	{
	    System.out.println("Mouse exited ");
	}
	
	public void  mouseEntered(MouseEvent d)
	{
             System.out.println("Entered into frame");
	}
	public void  mouseReleased(MouseEvent d)
	{
	    System.out.println("Mouse Released");

	}
	public void mousePressed(MouseEvent d)
	{
	    System.out.println("Mouse Pressed");

	}
	public void mouseClicked(MouseEvent d)
	 {
	    System.out.println("Mouse Clicked");

	}
 }

class demofram
 {
    public static void main(String asd[])
	{
	   sample obj=new sample();
	}
 }