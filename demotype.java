import java.io.*;

 class sample
   {
      DataInputStream din=new DataInputStream(System.in);
      public void getdata()
	{
	  try{
//	    float nam1= Float.valueOf(din.readLine()).floatValue();		
	    double nam2= Double.valueOf(din.readLine()).doubleValue();		
	     System.out.println(nam2);
	     
	     }catch(IOException x){}	
	}
   }


  class demotype
    {
      public static void main(String asd[])
	{
	   sample obj=new sample();
            obj.getdata();
	}
     }	