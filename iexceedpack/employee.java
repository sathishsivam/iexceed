package iexceedpack;

import java.io.*;

interface two
 {
    void show();
 }



public class employee
   {
      DataInputStream din=new DataInputStream(System.in);
      public void getdata()
	{
	 try{
	   System.out.println("Enter the details of employees");
	   String nam=din.readLine();
	   int phn=Integer.valueOf(din.readLine()).intValue();
	  }catch(IOException d){}
	}
  }




