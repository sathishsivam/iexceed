import java.util.*;


class sample
  {
    Stack v=new Stack();
     sample()
	{
	    v.add("Java");
	    v.add("JavaScript");
	    v.add("Python");
	    v.add("Scala");
	    v.add("Julia");


	    Iterator itr=v.iterator();

	    while(itr.hasNext())
		{
	           System.out.println(""+itr.next());
		}

		
	}
  }

class democollection4
  {
     public static void main(String asd[])
	{
	   sample obj=new sample();
	}
  }