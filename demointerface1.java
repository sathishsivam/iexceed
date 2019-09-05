interface done
 {
    public void draw();
 }

class sample implements done
  {
     public void draw()
	{
	  System.out.println("Drawing sample");
	}
  }

class sample1 implements done
  {
     public void draw()
	{
	  System.out.println("Drawing sample1");
	}
  }

class demointerface1
  {
    public static void main(String asd[])
	{
	    done obj=new sample1();
	    done obj1=new sample();
	   obj.draw();
	}
 }
     