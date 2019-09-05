
class sample extends Thread
 {
     Thread t=new Thread(this);

     public void run()
	{
	   t.setName("i-exceed");
	   System.out.println("Name of the thread"+t.getName());
	
	   for(int i=0;i<10;i++)
		  {
                    try{
		             System.out.println("Child thread"+i);
				t.sleep(1000);
			}catch(InterruptedException d){}
		  }

	}
 }

class demot3 
  {
    public static void main(String das[]) throws Exception
	{
            Thread t=Thread.currentThread();
	    sample obj=new sample();
		
	    obj.start();

	    System.out.println("Name of the threadd"+t.getName());

	    t.setPriority(Thread.MAX_PRIORITY);

	    System.out.println("Priority Now"+t.getPriority());


	    for(int i=0;i<10;i++)
		{
	         System.out.println("Main thread"+i);	
		 Thread.sleep(500);		
		}
	}
  }