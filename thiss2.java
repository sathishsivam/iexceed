

class sample
 {
    sample()
	{
	   System.out.println("welcome to i18n");
	}

    sample(String s)
	{
	  this();
	  System.out.println(""+s);

        }
 }

class thiss2
 {
    public static void main(String ads[])
	{
	   sample obj=new sample();
	}
 }