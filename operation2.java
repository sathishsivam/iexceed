class sample
  {
    String sch="Govt Hr Sec School Salem";

     public void display(String name,int age)
	{
	   System.out.println("Name of the student="+name);
	   System.out.println("Age of the student="+age);
	   System.out.println("School"+sch);
	}

     public void display1(String nam,int age)
	{
	   System.out.println("Name of the student="+nam);
	   System.out.println("Age of the student="+age);
	   System.out.println("School"+sch);
	}	

   }



 class operation2
   {
      public static void main(String ads[])
	{
	  sample obj=new sample();
	  obj.display("Sivam",21);
	  obj.display1("Sathish",22);

	}
    }


