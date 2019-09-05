import java.util.*;

class sample
  {
     sample()
	{
	   Deque<String> q=new ArrayDeque<String>();

	   q.add("Python1");
	   q.add("Python2");
	   q.add("Python3");
	   q.add("Python4");


	   Iterator itr=q.iterator();
		
		while(itr.hasNext())
			{
	   		   System.out.println(""+itr.next());
			}

		q.removeLast();


/*
	   Iterator itr1=q.iterator();

		while(itr1.hasNext())
			{
	   		   System.out.println(""+itr1.next());
			}
*/
	   for(String x:q)
   	   {
	   	System.out.println(""+x);
	   }		
	}
  }


class democollection6
  {
     public static void main(String asd[])
	{
	   sample obj=new sample();
	}
 }
