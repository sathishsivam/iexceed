class sample
  {
      public void display(int x,int y)
	 {
		System.out.println((x<y) || (x!=100));
	 }
  }


class relation 
 {
    public static void main(String arg[])
	{
	   sample obj=new sample();
	    obj.display(100,10);
	}
 }