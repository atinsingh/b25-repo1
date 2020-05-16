package javaPrograms;
  // instance variables
public class Student {
	//1)we have created a Student class 
	int id;   // instance variables
	String name;

	public static void main(String[] args) {

    /*2)Student class have two data members:  id and name. 
     *3)creating the object of the Student class by :new keyword and printing the objects value.
     */
	
		// s1 is object reference
		
		Student s1 = new Student();//creating an object of Student
		System.out.println(s1.id);//accessing member through reference variable
		System.out.println(s1.name);

		
		
	}

}
