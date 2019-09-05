/*
class sample
  {
    public void display(String msg)
	{
	  System.out.println("welcome"+msg);
	}
    public void display1(String str )
	{
	  this.display(str);
	}
 }

*/


class sample
  {
     sample()
	{
	    System.out.println("Hello");
	}

      sample(int x)
	{
	  this();

	}
  }
class thiss
 {
    public static void main(String asd[])
	{
	   sample obj=new sample();
//	   obj.display1("Salem"	);
	}
 }