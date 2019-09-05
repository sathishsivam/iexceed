class sample
 {
    public void getdata()
	{
	   System.out.println("Super class method");

	}
 }

class sample1 extends sample
 {

    public void getdata(String str)
	{
	  System.out.println("derived class method"+str);
	}
 }

class ana
 {
   public static void main(String asd[])
	{
	    sample1 obj=new sample1();
	      obj.getdata();
	}
 }