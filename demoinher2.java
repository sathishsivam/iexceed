import java.io.*;

class student
  {
	protected String name,city;
	protected int age;

	DataInputStream din=new DataInputStream(System.in);
    
      student()
	{
	 try{
	   System.out.println("Students Details");
	   System.out.println("Enter the name");
	   name=din.readLine();
	   System.out.println("Enter the City");
	   city=din.readLine();
	   System.out.println("Enter the Age");
	   age=Integer.valueOf(din.readLine()).intValue();
	   }catch(IOException d){}
		
	}
  }

 class trainer extends student
  {
	int salary;
     trainer()
	{
	  try{
		   System.out.println("Trainer Details");
		   name=din.readLine();
		   city=din.readLine();
		   age=Integer.valueOf(din.readLine()).intValue();
   		   salary=Integer.valueOf(din.readLine()).intValue();
             }catch(IOException d){}   		
			
	}
  }


class demoinher2
  {
     public static void main(String asd[])
	{
	   trainer obj=new  trainer();
		
	}
  }