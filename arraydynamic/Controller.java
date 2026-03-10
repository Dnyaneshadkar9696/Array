package arraydynamic;

import java.util.Scanner;

public class Controller {  
	
	
	
	public static void main(String[] args) {
		
		Scanner sd = new Scanner(System.in);
		// here in dynamic array the values are not fixed we take the values from the user
		
		System.out.println("Enter the marks for 5 Subjects : ");
		
		int[] marks = new int[5];
		for(int i = 0 ; i < 5; i++) {
			 marks[i] = sd.nextInt(); 
			 // like in mark i each integer value will go
			 // we store the values in the array 
		}
		
		// we have to also print those values
		
		System.out.println("------------------------------");
		for(int j = 0;  j < marks.length; j++) {
			
			System.out.println(marks[j]);
		}
	}

}
