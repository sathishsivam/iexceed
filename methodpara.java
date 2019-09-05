
class sample
  {  
     public int getdata(int x, int y)
	{
	   System.out.println("Value of x= "+x);
	   System.out.println("Value of y="+y);
	   int tot=x+y;
	   return tot;
 	

	}
  }

 class methodpara
  {
     public static void main(String arg[])
	{
	   sample obj=new sample();

	   int x=obj.getdata(100,120);

	   System.out.println(""+x);
  
  	 //  System.out.println(""+obj.getdata(100,120));
	  
	}
  }	   