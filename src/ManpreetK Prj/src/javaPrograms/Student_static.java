// what does static keyword do?? 
// static variable or method is shared

package javaPrograms;
 class Student_data{
	static int NoOfStudents = 0;
	// constructor
	Student_data(){
		NoOfStudents++;
		}
	// Method or Function
	// making method static will help to call it in main by calling class , 
	//not necessary to call by references.******explained below
	
	public static int getNoOfStudents(){
		return NoOfStudents;
	}
}

public class Student_static {

	public static void main(String[] args) {
		Student_data sD1 = new Student_data();
		Student_data sD2 = new Student_data();
		Student_data sD3 = new Student_data();
		System.out.println(Student_data.getNoOfStudents());
		// because getNoOfStudents() is a static member method fn .
		
		// VARIABLE Name --'NoOfStudents' is shared 
		
		/* ******Student_data sD = new Student_data();
		 * System.out.println(sD1.getNoOfStudents());
		 * Student_data sD = new Student_data();
		 * System.out.println(sD2.getNoOfStudents());
		 */

	}

}
