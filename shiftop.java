class sample
  {
     public void display()
	{
	   int x=12;
	   System.out.println(x>>5);	
	 	
	}
   }


class shiftop
  {
     public static void main(String ds[])
	{
	   sample obj=new sample();
		obj.display();
	}
   }
	
/*	128 64 32 16 8421	
	0   0  0  0  1100
      	0   0  1  1  0000*/