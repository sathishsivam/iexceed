class sample extends Thread
 {
   public void run()
	{
	  System.out.println("hi...");
	}
 }

class demothread
 {
   public static void main(String asd[])
	{
	    sample obj=new sample();
		obj.start();
		obj.start();

	}
 }