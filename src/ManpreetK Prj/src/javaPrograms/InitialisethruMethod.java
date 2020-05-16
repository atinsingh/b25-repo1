package javaPrograms;

class Method{
	int rollno; //instance variable
	String name;
	//invoking insertRecord () method ****
	
   void insertRecord(int r,String n){
     rollno = r;
     name = n;
  }
   //invoking displayInformation() method****
   
   void displayInformation(){
	   System.out.println("rollno of the student :" +rollno + "name of the student:" +name);
       }
     }
public class InitialisethruMethod {
  public static void main(String[]args){
	Method m1 = new Method();   // calling class "method" and "insertrecord" method for inserting values in main class.
	Method m2 = new Method();
	m1.insertRecord (777,"nnn");
	m2.insertRecord (222,"mmm");
		m1.displayInformation();	// calling "displaymethod" method
     m2.displayInformation();
  }
}
       
