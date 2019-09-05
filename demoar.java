import java.io.*;

class sample
 {
    int x[]=new int[3];

    DataInputStream din=new DataInputStream(System.in);

    sample()
	{
         try{
	      for(int i=0;i<3;i++)
		{
		  x[i]= Integer.valueOf(din.readLine()).intValue();
		}
	    }catch(IOException d){}

	      for(int i=0;i<3;i++)
		{
		  System.out.println(""+x[i]);
		}

	 

	}
 }


class demoar
 {
    public static void main(String ar[])
	{
	  sample obj=new sample();
	}
  }