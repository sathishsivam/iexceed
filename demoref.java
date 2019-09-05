class sample
  {
     int x,y;
	
     public void getdata(int x,int y)
	{
	  x=x;
	  y=y;	

	}

     public void display()
	{
	  System.out.println(""+x);
	  System.out.println(""+y);
	
	}	
  }

class demoref
 {
    public static void main(String asd[])
	{
	   sample obj=new sample();
	   obj.getdata(10,21);
	   obj.display();
	}
  }