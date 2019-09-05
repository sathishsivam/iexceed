interface one
  { 
	static final int x=10;
        public void display();
	public void show();
  }

interface two 
  { 
     public void display1();
  }



class sample implements one,two 
  {
    sample()
	{

	}

	public void display()
	{
//	  x=100;
	  System.out.println("From interface_one"+x);
	}

	public void display1()
	{
	  System.out.println("From interface_two");
	}

	public void show(){}

    }

 class interfacedemo
  {
    public static void main(String ds[])
	{
	    sample obj=new sample();
	    obj.display();
	    obj.display1();

	}
	
 }

   