class sample
 {
    public void display()
	{
	   System.out.println("welcome to i18n");
	}

    public void display1()
	{
   	   System.out.println("welcome to Salem");  
	   this.display();

	}
 }


class thisdemo1
  {
     public static void main(String asd[])
	{
	    sample obj=new sample();
	    obj.display1();
	    
	}
 }



