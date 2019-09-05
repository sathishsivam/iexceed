import java.util.*;


class sample
 {

   ArrayList<String> a1=new ArrayList<String>();

    sample()
	{
 
	  a1.add("salem");
	  a1.add("Erode");
	  a1.add("Kovai");
	  a1.add("Trichy");


	  System.out.println("Size="+a1.size());




/*	 Iterator itr=a1.iterator();

	  while(itr.hasNext())
		{
			System.out.println(""+itr.next());
	 	   	  
	      }*/


	  for(String x:a1)
	   {
	       System.out.println(x);
           }

	  for(int i=0;i<a1.size();i++)
		{
	          System.out.println(""+a1.get(i));
		}


	}
 }

class democollection2
  {
     public static void main(String asd[])
	{
	   sample obj=new sample();
	}
 }