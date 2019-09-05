class sample
 {
    sample()
	{
	  System.out.println("**************************");
	}

    sample(String x,int y,String z)
	{
	   this();
           System.out.println("Name of the employee"+x);
           System.out.println("Age of employee"+y);
           System.out.println("Cityof the employee"+z);

	}
  }


class sample1 extends sample
 {
 	
     sample1(String nam,int age,String city,int salary)
	{
          super(nam,age,city);

	  System.out.println("Salary"+salary);
	System.out.println("**************************");
	}


  }

class demosuper
 {
   public static void main(String asd[])
	{
	    sample1 obj=new sample1("haridharan",21,"salem",12300);
	}
 }


