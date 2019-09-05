import java.net.*;

class sample
 {
    sample()
	{
	 try{
	  System.out.println(""+InetAddress.getByName("www.google.com"));
		}catch(Exception d){}
	}
 }

class netdemo
  {
      public static void main(String asd[])
	{
	    sample obj=new sample();
	}
 }