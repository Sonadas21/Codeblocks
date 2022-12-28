import java.util.*;


//Main
public class Basics_in_java {
	
	public static void main(String args[]) {
		
		//Type casting................................................
		
		//Widening casting............................................
		
		 int myInt = 9;
		 double myDouble = myInt; // Automatic casting: int to double

		 System.out.println(myInt);      // Outputs 9
		 System.out.println(myDouble);   // Outputs 9.0
		 
		 
		 
		//Narrowing casting........................................
		 
		 double myDouble = 9.78d;
		 int myInt = (int) myDouble; // Manual casting: double to int
		    
		 System.out.println(myDouble);   // Outputs 9.78
		 System.out.println(myInt);      // Outputs 9
	}
	
	

}
