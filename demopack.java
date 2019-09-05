import iexceedpack.employee;

class sample extends employee
 {
    sample()
	{

	}
     public void show()
	{
	  System.out.println("from pack interface");
	}	 
  }


class demopack
 {
    public static void main(String asd[])
	{
	    sample obj=new sample();
	    obj.getdata();
	    obj.show();
	}
 }