// method overridding 

/*   Method in the derived class sharing the same name and type signature of the method 
   in the super class then we call method in the derived class 
   overrides the method in the super class*/

 class x
  {
	final public void display(int x,int y)
	 {
	   System.out.println(x+y);		
       	 }
    	
  }

class y extends x
  {
    public void display(int x,int y)
	{
	   System.out.println(x*y);		
	}    
  }

class demoover
  {
     public static void main(String asd[])	
	{
	   x ref;
           
	   x obj=new x();
	   y obj1=new y();

	   ref=obj1;
	   ref.display(1,2);
  	     
    	     
	}
 }
	   



	

