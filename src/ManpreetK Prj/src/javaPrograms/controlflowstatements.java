package javaPrograms;

public class controlflowstatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 1) CONDITIONAL OPERATORS: < less than  , <= less than or equal to , > greater than
        >= greater than or equal to  , == equal to , != not equal to*/
		
        //  IF STATEMENT : BOOLEAN CONDITION
		/*check if the age is lower than 4 , then output will be he/she is a baby.*/
		
		System.out.println("EXAMPLE OF IF STATEMENT BY USING CONDITIOANL OPERATORS");
		int age = 2;
		System.out.println("Age of the child is :" + age+ "years old " );
		if (age < 4){
		System.out.println("he/she is a baby");
		}
		
		/* 2) COMAPRISON Operators in Java: The && and || operators perform Conditional-AND and 
		 * Conditional-OR operations on two boolean expressions.
		 */
		System.out.println("EXAMPLE OF IF STATEMENT BY USING COMPARISON OPERATORS");
		int a = 2;
		int b = 2;
		int c = 5;
			
		if (a == 2 && b == 2) {
			System.out.println("A & B BOTH ARE EQUAL");
		}
		if (a == 6 || c == 5) {
			System.out.println("DISPLAY RESULT");
		}
		
		//if loop ends 	
		
		//IF ELSE 
		
		System.out.println("USING IF ELSE STATEMENT");
		
		int childage =20;
		System.out.println("age of the child is :" +childage + "years old.");
		  if (childage < 4 ){
			  System.out.println("he/she is a baby");
		  }
		   
		  else if(childage>12 && childage<=18){
			  System.out.println("he/she is a teenager");
		  }
		  else if(childage>18 && childage<30 ){
			  System.out.println("he/she is an adult");
		  }
		  else {
			  System.out.println("he/she is not a baby anymore");
		  }
		 
	}  
}

		
		
		
		
		
		
	


