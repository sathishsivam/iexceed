import java.util.*;


class sample
 {
    HashMap h=new HashMap();

    sample()
	{

	   h.put(1,"Sivam1");
	   h.put(10,"Sivam2");
	   h.put(13,"Sivam3");
	   h.put(187,"Sivam4");
	   h.put(112,"Sivam6");

	   System.out.println(""+h);

	   h.remove(112);

	   System.out.println(""+h);



	}
  }

class democollection8
  {
     public static void main(String asd[])
	{
	    sample obj=new sample();
	}
  }