
interface one
  {
	 int x=10;
	 public void show();
  }


class sample implements one
  {
     sample()
	{
	}
      public void show()
	{
	   System.out.println("Version of sample"+x);
	}

  }

class sample1 implements one
 {
     sample1()
	{

	}
      public void show()
	{
	   System.out.println("version of sample1"+x);
	}
 }

   

class demointerface2
 {
    public static void main(String asd[])
	{
	   one obj=new sample1();
	    obj.show();
	}
 }

