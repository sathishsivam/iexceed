class sample
  {
    int x=10;
     public void display()
	{
	    System.out.println(x++);
	    System.out.println(++x);

	    System.out.println(x--);
	    System.out.println(--x);


		


	}
  }

class unary
  {
     public static void main(String ase[])
	{
	   sample obj=new sample();
		obj.display();
	}
 }

