class sample extends Thread
  {
    Thread t=new Thread(this);
    sample()
	{
	   t.start();
	}

     public void run()
	{
	   for(int i=0;i<10;i++)
		{
		 try{	
		          System.out.println("Child thread"+i);
			  t.sleep(1000);
			}catch(InterruptedException d){}
		  
		}
	}	
  }


class demot1
 {
   public static void main(String asd[])  throws Exception
	{
	   sample obj=new sample();

	   for (int i=0;i<10;i++)
		{
	             System.out.println("Main thread"+i);
		     Thread.sleep(500);	
		}
	  
	}
 }