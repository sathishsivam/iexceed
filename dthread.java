

class sample extends Thread
 {
   
    public void run()
	{
	   if(Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon thread working....");
		}
	   else {
		        System.out.println("User thread working ......");
		}
		

	}
 }


class dthread
 {
    public static void main(String asd[])
	{
	  sample obj1=new sample();
	  sample obj2=new sample();
	  sample obj3=new sample();


		obj1.setDaemon(true);

		obj1.start();
		obj2.start();
		obj3.start();

	}
 }