class sample
 {
    sample()
	{
	   System.out.println("welcome to i18nsolutions");
	}
    sample(int x)
	{
	   System.out.println("Biggest Analytics community in Tamilnadu"+x);
	   this();
	}
 }

 class thisdemo2
   {
       public static void main(String asd[])
	{
	    sample obj=new sample(12);
	}
  } 