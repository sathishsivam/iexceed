class sample extends Thread
 {
    sample()
	{
	    for(int i=0;i<10;i++)
	 	{
		try{
	           	  System.out.println(""+i);
			  Thread.sleep(1000);
	  	   }catch(InterruptedException d){}
		} 

	}
  }


class demot
 {
    public static void main(String ads[])
	{
	   sample obj=new sample();

	    for(int i=0;i<10;i++)
		{
	           System.out.println(""+i);
		}
	}
  }