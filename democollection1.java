import java.util.*;



 class sample
  {
    ArrayList<int> a=new ArrayList<int>();
 
     sample()
	{
	  a.add("Scala");
	  a.add("Java");
	  a.add("Python");
	  a.add("C++");
	  a.add("Fortran");
	  a.add("Pascal");

		  
	  a.add(1);
	  a.add(2);


	 Iterator itr=a.iterator();


	 while(itr.hasNext())
		{
		   System.out.println(""+itr.next());
		}




	}


  }


class democollection1
 {
    public static void main(String asd[])
	{
	     sample obj=new sample();
	}
  }