 class sample			// super class
  {
     String name="sivam";
     sample()
	{
	   System.out.println(""+name);
	}
  }

class sample1 extends sample 	// derived class
  {
     sample1()
	{
	  name="shridharn";
	  System.out.println("Derived class"+name); 
	}
  }


class demoinher
  {
     public static void main(String asd[])
	{
	    sample1 obj=new sample1();
	}
 }	