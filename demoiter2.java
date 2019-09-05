class sample
  {
       public void display()
	{
	  for(int i=0;i<6;i++)
	    {
		
		if(i==3)
		{
		   continue;
		}
		System.out.println(i);
			
	     }	

	}
  }


class demoiter2
  {
     public static void main(String asd[])
	{
	   sample obj=new sample();
		obj.display();
	}
  }