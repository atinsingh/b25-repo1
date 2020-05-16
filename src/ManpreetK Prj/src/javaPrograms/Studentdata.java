package javaPrograms;

     //Object and Class Example: Initialization through reference
    /*Initializing object simply means storing data into object. Let's see a simple example 
    * where we are going to initialize object through reference */
    
class Student4{  
	 int id;  
	 String name;  
	}  
	class Studentdata{  
	 public static void main(String args[]){  
	  Student4 s1=new Student4();  
	  s1.id=101;  
	  s1.name="mmm"; 
	  
	  System.out.println(s1.id+" "+s1.name);//printing members with a white space  
	 }  
	}  

	