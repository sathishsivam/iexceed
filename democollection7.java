// it use hash table and it contains unique items

/*	HashSet
	LinkedHashSet
	TreeSet*/



import java.util.*;

class sample
  {
    TreeSet<String> s=new TreeSet<String>();
    sample()
	{
             s.add("Bamboo");
             s.add("Oak");
             s.add("Teak");
             s.add("Arasu");
             s.add("Teak");


	     for(String x:s)
		{
	           System.out.println(x);
		}



	}
  }


class democollection7
  {
    public static void main(String asd[])
	{
	   sample obj=new sample();
	}
  }