//  Interthread communication


class customer
  {
    int amount=10000;

     synchronized void withdraw(int amount)
	{

	   System.out.println("Going to withdraw....");

           if(this.amount<amount)
		{
		  System.out.println("Less balance waiting for deposite");
		 try{
			  wait();
			}catch(InterruptedException d){}
		}

		this.amount-=amount;
	        System.out.println("Withdrawed");
        
         }

	
    synchronized void deposit(int amount)
	{
	    System.out.println("Going to deposite....");
            this.amount+=amount;
            System.out.println("Deposited");
		notify();

	}

  }


 class itc
  {
    public static void main(String asd[])
	{
	 final  customer c=new customer();

	   new Thread()
	    {
              public void run()
		{ 
	              c.withdraw(15000);
		}
            }.start();


	  new Thread()
		{
		 public void run()
		  {
	              c.deposit(10000);
		 }
                }.start();
	}
		
  }
 

