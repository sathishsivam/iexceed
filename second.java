class sample
  {

      public void display()
	{
	   short x=20;
	   short y=10;
           int tot=x+y;
	   System.out.println("Addition="+tot);
	}

      public void display1()
	{
	   int x=20;
	   int y=10;
	   int tot=x*y;
	   System.out.println("Multiplication="+tot);
	}

   }


class second
 {
     public static void main(String a[])	
	{
	   sample obj=new sample();
//	   obj.display();	
	   obj.display1();	
	}
 }

   