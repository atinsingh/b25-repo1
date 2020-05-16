package javaPrograms;

public class ArraysNloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int salaries[] =new int[5];
            salaries[0] = 1000;
            salaries[1] = 5000;
            salaries[2] = 1000;
            salaries[3] = 6000;
            salaries[4] = 3000;
            System.out.println("value of the 5th element of the array stored at elementINDEX 4 is:" +salaries[4]);
       
          
        int esalaries[] = new int [5];
        esalaries[0] = 1000;
        esalaries[1] = 5000;
        esalaries[2] = 1000;
        esalaries[3] = 6000;
        esalaries[4] = 3000;
        /*for (i=0;i<=4;i++); can either use (i) or (esalaries.length)
         * Arrays in java have the length property which returns the length of the array.
         * for (initialization; termination; increment) {
                 *statement(s)*/
        System.out.println("FURTHER result is to expain FOR LOOP STATEMENT under array name: esalaries");
        int i = 0;
        for (i=0;i<esalaries.length;i++){
        System.out.println("the salary stored at element index " +i+ " is " +esalaries[i]);
       
        } /*for loop ends */
      
        
        
       
      /*while 	loop: Condition is boolean. 
       * This means until the condition is true the while loop will be executed.*/
        System.out.println("FURTHER result is to expain WHILE LOOP STATEMENT under array name: empsalaries");
        int empsalaries[] = new int [5];
        empsalaries[0] = 10000;
        empsalaries[1] = 50000;
        empsalaries[2] = 20000;
        empsalaries[3] = 80000;
        empsalaries[4] = 60000;
        int j = 0;
        while (j<5){
        
        System.out.println("the salary stored at element index " +j+ " is " +empsalaries[j]);
          j++;  
        	
        } /*while loop ends*/
        /*dowhile loop starts*/
        System.out.println("FURTHER result is to expain FOR LOOP STATEMENT under array name: empnewsalaries");
        int empnewsalaries[] = new int [5];
        empnewsalaries[0] = 10;
        empnewsalaries[1] = 50;
        empnewsalaries[2] = 20;
        empnewsalaries[3] = 80;
        empnewsalaries[4] = 60;
        int k = 0;
        do{
        	System.out.println("the salary stored at element index " +k+ " is " +empnewsalaries[k]);	
        	k++;
        }while(k<5);
        /*dowhile loop ends*/
	}
        }
        	
       	
        	
       

        
       
       


	
	
	
	
	
	


