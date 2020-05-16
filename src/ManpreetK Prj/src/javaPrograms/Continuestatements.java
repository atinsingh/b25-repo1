package javaPrograms;

public class Continuestatements {
	

		   public static void main(String args[]){
			for (int j=0; j<=6; j++)
			{
		           if (j==4)
		           {
			      continue;
			   }

		           System.out.print(j+" ");
			
			}
			//using continue inwhile loop
			System.out.println("using continue in while loop");
			
			int counter=10;
			while (counter >=0)
			{
		           if (counter==7)
		           {
			       counter--;
			       continue;
		           }
		           System.out.print(counter+" ");
		           counter--;
			}
			// using continue in do while loop
		System.out.println("using continue in dowhile loop");	
			int k=0;
	        do
		{
		   if (k==7)
		   {
			 k++;
			 continue;
		   }
		   System.out.print(k+ " ");
		   k++;
	       }while(k<10);

				   }
		   
		}



