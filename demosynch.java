class callme
 {
      synchronized public void call(String msg)
	{
	   System.out.println(""+msg);
	    display();
	
	}
	
      public void display()
	{
		for(int i=0;i<10;i++)
		{
	             System.out.println(""+i);
		    try{
			Thread.sleep(1000);
			}catch(InterruptedException d){}
		}
	}
	
 }

class caller extends Thread
  {
    callme tar;
    String s;
    Thread t=new Thread(this);
    
   caller(callme tar,String msg)
      {
  	this.tar=tar;
        s=msg;
	t.start();
      }
   public void run()
	{
	    tar.call(s);
	}
 }


class demosynch
 {
     public static void main(String sd[])
	{
	   callme target =new callme();
	
	   caller obj1=new caller(target,"Hi");
	   caller obj2=new caller(target,"Hello");
	   caller obj3=new caller(target,"How are you");
	}
  }



