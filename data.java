import java.io.DataInputStream;

class sample
 {
   DataInputStream d=new DataInputStream(System.in);
    public void getdata()
	{
	    try
	       {

		int s=Integer.parseInt(d.readLine());

	       }catch(Exception d){}	
	}
  }

class data
 {
    public static void main(String asd[])
	{
	   sample obj=new sample();
		obj.getdata();
	}
  }
