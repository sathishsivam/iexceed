import java.util.*;

class sample
  {
    ArrayList a=new ArrayList();
     sample()
	{
	    a.add("Salem");
	    a.add("Dharmapuri");
	    a.add("Krishnagiri");
	    a.add("Hosur");

/*	   Iterator itr=a.iterator();
		
		 while(itr.hasNext())
		  {
		    System.out.println(""+itr.next());
		}*/
		
		System.out.println("Size of array list"+a.size());

		System.out.println(""+a.get(3));

	/* for(int i=0;i<a.size();i++)
		{
	          System.out.println(""+a.get(i));
	 	}	 */




	
	}
 }


class democollection3
  {
     public static void main(String asd[])
	{
	    sample obj=new sample();
	}
 }