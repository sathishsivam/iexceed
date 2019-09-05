import java.io.*;

class sample
  {
    int x[][]=new int[3][3];
    int y[][]=new int[3][3];
    int tot[][]=new int[3][3];

    DataInputStream din=new DataInputStream(System.in);


     sample()
	{

	    System.out.println("Enter the Matrix A");
	
		for(int i=0;i<3;i++)
		{
	          for(int j=0;j<3;j++)
			{
		          try{
				    x[i][j]=Integer.valueOf(din.readLine()).intValue();
				}catch(IOException d){}
			}
                 }

	    System.out.println("Enter the Matrix B");
	
		for(int i=0;i<3;i++)
		{
	          for(int j=0;j<3;j++)
			{
		          try{
				    y[i][j]=Integer.valueOf(din.readLine()).intValue();
				}catch(IOException d){}
			}
                 }

		for(int i=0;i<3;i++)
		{
	          for(int j=0;j<3;j++)
			{
				   tot[i][j]=x[i][j]+y[i][j];
			}
                 }

		for(int i=0;i<3;i++)
		{
	          for(int j=0;j<3;j++)
			{
			   System.out.print(""+tot[i][j]);
			}
			System.out.println("");
                 }




	}
  }


class demoar1
  {
     public static void main(String ads[])
	{
	   sample obj=new sample();
	}
 }