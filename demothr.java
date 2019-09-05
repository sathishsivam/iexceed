class sample
 {
    public void show(int age)
	{
	   if(age<18)
		{
	   	   throw new ArithmeticException("Not eligible");
	 	}
	   else{
		 System.out.print("hi");
		}	 
	
	}
  }


class demothr 
  {
     public static void main(String asd[])
	{
	    sample obj=new sample();
		obj.show(12);
	}
 }


