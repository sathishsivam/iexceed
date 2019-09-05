import java.util.*;

class sample
  {
    PriorityQueue<String> q=new PriorityQueue<String>();

     sample()
	{
	   q.add("Python1");
	   q.add("Python2");
	   q.add("Python3");
	   q.add("Python4");


	   Iterator itr=q.iterator();
		
		while(itr.hasNext())
			{
	   		   System.out.println(""+itr.next());
			}
		
		q.remove();
		q.poll();

	   Iterator itr1=q.iterator();

		while(itr1.hasNext())
			{
	   		   System.out.println(""+itr1.next());
			}
	}
  }


class democollection5
  {
     public static void main(String asd[])
	{
	   sample obj=new sample();
	}
 }
