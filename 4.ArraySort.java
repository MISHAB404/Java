import java.util.*;

class ArraySort
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Size of Array : ");
		int size = sc.nextInt();
		String[] strings = new String[size];
		System.out.println("Enter The String : ");
		
       		 for(int i = 0; i<size; i++)
		 {
			strings[i] = sc.next();		
		 }
		
		System.out.println("\n Choose a Function : \n 1. Built-in function \n 2. User-define function");
		System.out.println("Enter Your Option : ");
		int opt = sc.nextInt();
		
		switch(opt)
		{
			case 1 : Arrays.sort(strings);
				 break;
			case 2 : String temp;
				 for(int i = 0; i<size-1; i++)
				 {
   				   for(int j = i+1; j<size; j++)
				   {
	 			      if(strings[i].compareTo(strings[j])>0)
				      {
				          temp = strings[i];  
              				  strings[i] = strings[j];  
              				  strings[j] = temp;  
				      }
				   }
				 }
				 break;
		       default : System.out.println("You Entered Wrong Key");
				 break;
		}
		for(int i = 0; i<size; i++)
		{
	     	 	System.out.println(strings[i]);
		}
	}
}
