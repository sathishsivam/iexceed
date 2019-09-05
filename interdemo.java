interface one
 {
   int x=10;
   public void display();
 }


class sample implements one
 {
     public void show()	{}

     public void display()
	{
	  System.out.println("from interface"+x);
	}
 }

class interdemo
 {
    public static void main(String asd[])
	{
	   sample obj=new sample();
		obj.display();

	        obj.show();
	}
 }

