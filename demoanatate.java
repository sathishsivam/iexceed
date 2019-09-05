class sample
 {
     public void getdata(int x)
	{
	   System.out.println("super class");
	}
 }

class sample1 extends sample
 {
     @Override
      public void getdata(int age)
	{
	  if(age<18)
		{
		  throw new ArithmeticException("Not valid");
		}
	   else{
		System.out.println("Eligible to appear for exam");
		}	
	  
	}
 }


class demoanatate
 {
     public static void main(String asd[])
	{
	   sample1 obj=new sample1();
	    obj.getdata(12);
	}
 }