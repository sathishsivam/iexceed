class sample extends Thread
 {
    Thread t=new Thread(this);

    public void run()
	{
         try{
	   System.out.println(""+Thread.currentThread().getName());
	   t.sleep(1000);
	 }catch(InterruptedException d){}
	   
	}
 }

class sampledemo
 {
    public static void main(String asd[])
	{
	   sample obj1=new sample();
	   sample obj2=new sample();	
	   sample obj3=new sample();
	   sample obj4=new sample();	

	   obj4.setName("Praveen ");	


	   System.out.println(""+obj1.getPriority());
	   System.out.println(""+obj2.getPriority());

	   obj3.setPriority(Thread.MAX_PRIORITY);
	   System.out.println(""+obj2.getPriority());

	   obj1.start();	
	   obj2.start();	
	   obj4.start();	
	   obj3.start();	


	  
	}
 }

/*
Thread NAME
		getName()
		setName()

		getPriority()
		setPriority()
*/	