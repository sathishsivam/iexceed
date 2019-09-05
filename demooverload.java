
// A class may have several methods all the methods
//share the same name and differs with type signature

  class sample 
    {
       sample()
	{
	   System.out.println("inside empty method");
	}
      sample(String str,String str1)
	{
	    System.out.println(str+str1);
	}
      sample(int x,int y)
	{
	    System.out.println(x+y);
	
	}
   }

 class demooverload
 {
    public static void main(String asd[])
	{
	     sample obj1=new sample();
	     sample obj2=new sample(12,12);
	     sample obj3=new sample("i18n","Solutions");

	}
  }
 
