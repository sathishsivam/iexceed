import java.io.*;

class sample1
  {
     int x=10;
     sample1(int z,int o)
	{
	   System.out.println(z+2);
	   System.out.println(o+3);
	   x=32;
	  
	
	}
  }

class sample extends sample1
  {
    sample(int a,int b)
	{
           super(a,b);
	   System.out.println(a);
	   System.out.println(b);

	}
 }

 class demoinput
  {
     public static void main(String asd[]) throws IOException
	{
         DataInputStream din=new DataInputStream(System.in);
	   int x=Integer.valueOf(din.readLine()).intValue();
	   int y=Integer.valueOf(din.readLine()).intValue();
	   sample obj=new sample(x,y);
	
	}
  }