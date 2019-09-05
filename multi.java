/*interface

	multiple inheritance*/


class sample 
  {
     sample()
	{
	}

 }

 class sample1
   {
     sample1()
	{

	}
   }

 class sample2 extends sample1,sample
   {
     sample2()
	{

	}
  
   }


 class multi
   {
     public static void main(String asd[])
	{
	    sample2 obj=new sample();
	}
   }


	