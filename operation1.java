
class sample
  {
     public void display(String x,String y)
	{
	  String s=x+y;
	  System.out.println(""+s);
           
        }
  }

class operation1
  {
     public static void main(String a[])
	{
	  sample obj=new sample();
	  sample obj1=new sample();
	  obj.display("i18n","Solutions");	
	  obj1.display("Welcomes","U all");	

	}
  } 
 