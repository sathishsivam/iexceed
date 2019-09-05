
class sample
  {
     public void display(int x,int y)
	{
	  int tot=x+y;
	  System.out.println(""+tot);
           
        }
  }

class operation1
  {
     public static void main(String a[])
	{
	  sample obj=new sample();
	  sample obj1=new sample();
	  obj.display(1,2);	

	}
  } 
 