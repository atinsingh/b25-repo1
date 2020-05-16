

package javaPrograms;

//there are 3 ways to initialise an object .
	// 1) by reference variable
	// 2) by method
	// 3) by constructor
	//We can also create multiple objects and store information in it through reference variable.
	
	class Studentinfo{  
	 int id;  
	 String name;  
	}  
	class InitialiseObjects{  
	 public static void main(String args[]){  
	  //Creating objects  
	   
	   
	  Studentinfo s1=new Studentinfo();  
	  Studentinfo s2=new Studentinfo();
	    
	  //Initializing objects  
	    
	  s1.id=101;  
	  s1.name="Ssss";  
	  s2.id=102;  
	  s2.name="Aaaa";  
	  //Printing data  
	  System.out.println(s1.id+" "+s1.name);  
	  System.out.println(s2.id+" "+s2.name);  
	 } 
	 	}  