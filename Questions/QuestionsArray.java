package arraypractise;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class QuestionsArray {
	
	// method for calling all the methods 
	
	Scanner sc = new Scanner(System.in);
	
	public void call() {
		
		this.reverseArray();
		System.out.println();
		this.checkEvenOdd();
		System.out.println();
		this.printElementSum();
		System.out.println();
		this.maxValue();
		System.out.println();
		this.minValue();
		System.out.println();
		this.useofSort();
		System.out.println();
		this.oneDArray();
		System.out.println();
		this.findLength();
		System.out.println();
		this.findAverage();
		System.out.println();
		this.searchArray();
		System.out.println();
		this.evenOddCount();
		System.out.println();
		this.copyArryElements();
		System.out.println();
		this.decendingOrder();
		System.out.println();
		this.duplicateNumber();
		System.out.println();
		this.removeDuplicate();
		System.out.println();
		this.secondLargest();
		System.out.println();
		this.secondSmallest();
		System.out.println();
		this.mergArray();
		System.out.println();
		this.checkPalindrome();
	
		
	}
	
	// programm to reverse the 1D array
	public void reverseArray() {
		// Take the array from the user and reverse it
		System.out.println("Enter the 5 elements in the array : ");
		int[] arr = new int[5];
		
		// using loop i can store values in the array 
		for( int i = 0 ; i < arr.length; i++ ) {
			arr[i] = sc.nextInt();
			// we stored the values in the array
		}
		
		// now we have to reverse that array 
		System.out.println("------------------------------");
		
		for(int j = arr.length-1; j >=0 ; j--) {
			System.out.println(arr[j]);
		}
//		sc.close();
	}
	
	
	public void checkEvenOdd() {
		
		// To check the number is even or odd
		
		int[] arr1 = { 24, 23, 43, 434, 22, 45, 234, 343, 22, 224};
		// using loop we have to go through the array elements 
		
		System.out.println("Even number are as follows : ");
		for(int k = 0; k < arr1.length; k++) {
			
			if( arr1[k] %2 == 0) {
				System.out.println(arr1[k]);
			}
		}
		
		System.out.println("Odd number are as follows : ");
		for(int l = 0 ; l < arr1.length ; l++) {
			if(arr1[l] % 2 != 0) {
				System.out.println(arr1[l]);
			}
		}
	}
	
	
	// to print the sum of all the array elements 1D
	
	public void printElementSum() {
		int[] arr3 = { 23, 34, 37, 29, 234 };
		int sum = 0;
		for(int m = 0 ; m < arr3.length ; m++) {
			
			sum = sum + arr3[m];
			
		}
		System.out.println("The sum of the array is : " +sum);
	}
	
	// now to find the maximum value in the array 1D
	
	public void maxValue() {
		int[] arr4 = { 23, 123 , 564, 234, 234, 23, 422, 234 };
		
		int max = arr4[0]; 
		for(int n = 0 ; n < arr4.length ; n++) {
			
			if(arr4[n] > max) {
				// the max is the constant and we are checking with the canging with arr4 so changing should be first
				// the condition in the if is also changes the output so give it properly
				max = arr4[n];
			}
		}
		System.out.println("Biggest element in  the array is: " + max);
	}
	
	// Now the min value find in the 1D array
	
	public void minValue() {
		// To check the minimum value in the array
		
		int[] arr5 = { 324, 234, 2454, 363, 33, 234, 23, 2, 35, 4};
		int min = arr5[0];
		// consider the first value is min
		for(int o = 0; o < arr5.length; o++) {
			if(arr5[o] < min) {
				min = arr5[o];
			}
			
		}
		System.out.println("The smallest element is the array is : "+ min );
	}
	
	// Array give the built in method that is sort which sorts the array elements 
	// Programm to sort an array in the acessending order
	
	public void useofSort() {
		
		int[] arr6 = { 35, 45, 76, 435, 456 ,4356 ,567 };
		
		Arrays.sort(arr6);
		System.out.println("The sorted array : ");
		System.out.println(arr6); // when we give like this it gives the memory address
		
		for(int p = 0; p < arr6.length ; p++) {
			System.out.println(arr6[p]);
		}
	}
	
	// program to print all the elements in the 1D array
	
	public void oneDArray() {
		// to print the all the elements 
		
		int[] arroneD = { 34, 2, 45, 34, 23, 232 };
		
		System.out.println("Printing the 1D array : ");
		for(int q = 0 ; q < arroneD.length ; q ++) {
			System.out.print(arroneD[q] +" ");
		}
	}
	
	// programm to find the length of 1 D array
	
	public void findLength() {
		String[] arrlength = { "Ram", "Sham", "Rani", "Om", "Ganesh", "Ravi"};
		
		//  to find the length
		
		System.out.println("Length of the array : "+ arrlength.length);
	}
	
	
	// Programm to find the average of the elements in the 1D array
	
	public void findAverage() {
		System.out.println("Enter marks of 5 subjects to find the average : ");
		int[] arrAverage = new int[5];
		int sub = 5;
		// store the values using the for loop
		
		for(int r = 0; r < arrAverage.length ; r++) {
			arrAverage[r] = sc.nextInt();
		}
		
		// to find the average 
		int total = 0;
		for(int w = 0 ; w < arrAverage.length; w++) {
			total = total + arrAverage[w];
		}
		
		int average = (total/sub);
		
		System.out.println("Average Marks : " + average);
		
		sc.close();
	}
	
	// Program for search an element in an 1D arrray
	
	public void searchArray() {
		String[] arrNames =  { "Ganesh", "Vinod", "Suraj", "Rakesh", "Uday", "Pawan", "Manoj"};
		
		for(int x = 0; x < arrNames.length ; x++) {
			if(arrNames[x] == "Suraj") {
				System.out.println("The name is present at : "+ x + " Index");
			}
		}
	}
	
	// programm to count even and odd numbers in an array
	
	public void evenOddCount() {
		
		int[] arrycheck = { 234, 343, 34, 67, 89, 656, 34};
		int countE = 0;
		int countO = 0;
		
		System.out.print("Even number count is: ");
		for(int k = 0; k < arrycheck.length; k++) {
			
			if( arrycheck[k] %2 == 0) {
				countE++;
				
			}
		}
		System.out.print(countE);
		System.out.println();
		System.out.print("Odd number count is: ");
		for(int l = 0 ; l < arrycheck.length ; l++) {
			if(arrycheck[l] % 2 != 0) {
				countO++;
				
			}
		}
		System.out.print(countO);

		
	}
	
	// Write a program to copy elements from one array to another.
	
	public void copyArryElements() {
		int[] arrOriginal = { 11, 12, 22, 33, 34, 23, 23};
		int[] arrCopy = new int[arrOriginal.length];
		
		System.out.println("Printed the copied array : ");
		for(int f = 0; f < arrOriginal.length; f++) {
			
			for(f = 0; f < arrCopy.length; f++) {
				
				arrCopy[f] = arrOriginal[f];
				
//				System.out.println(arrCopy[f]);
				
			}
		}
		
		for(int sd = 0; sd < arrCopy.length; sd++) {
			System.out.println(arrCopy[sd]);
			// The copy array is printed successfully
		}
	}
	
	// programm to sort the array in the descending order
	
	public void decendingOrder() {
		
		Integer[] arrdes = { 34, 344, 565, 76, 998, 5, 45, 4, 32, 2};
		
		// using the sort method it sorted in ascending order 
		// for descending order
		// from higher numbers to the lower numbers 
		
		Arrays.sort(arrdes, Collections.reverseOrder());
		
		// This Collections. reverseOrder only works on the collection framework so we used Integer instead of int
		
        System.out.println("Descending Order: ");
		for(int t = 0; t < arrdes.length ; t++) {
			
			System.out.println(arrdes[t]);
		}
		
	}
	
//	Write a program to find duplicate elements in a 1D array.
	
	public void duplicateNumber() {
		int[] arrDuplicate = { 12, 23, 34, 43, 54, 23, 53};
		
		// to find the duplicate number
		int num = 0;
		for(int i = 0; i < arrDuplicate.length; i++) {
			
			for(int j = i + 1; j < arrDuplicate.length; j++) {
				
				if(arrDuplicate[i] == arrDuplicate[j]) {
					num = arrDuplicate[i];
				}
			}
		}
		System.out.print("Duplicate Number is : ");
		System.out.print(num);
		// we did here first number with the i and second index number as j
	}
	
	
//	Write a program to remove duplicate elements from a 1D array.
	
	public void removeDuplicate() {
		// here we have to remove the duplicate element from the array
		
		int[] arrdup = { 23, 43, 2, 4, 55, 33, 32, 23};
		
		// store in temporaray array
		int[] temp = new int[arrdup.length];
		int j = 0;
		
//		lets first find the duplicate element
		for(int as = 0; as < arrdup.length; as++) {
			boolean isduplicate = false;
			// value of as will be constant and it will be checked with all the remaining elements
			
			for(int ad = as + 1; ad < arrdup.length; ad++) {
				
				if(arrdup[as] == arrdup[ad]) {
					// basically we have to store here the values 
					isduplicate = true;
					break;
					// we break the inner loop and again go to the next outer loop
				}
			}
			
			if(!isduplicate) {
				temp[j] = arrdup[as];
				j++;
				// we increase the value of j because the index should increase
				
			}
		}
		
		// we have to print the values which are stored in the array
		
		System.out.println("Array without duplication : ");
		for(int g = 0; g < j; g++) {
			System.out.println(temp[g]);
		}
	}

	//	Write a program to find the second largest element in a 1D array
	
	public void secondLargest() {
		// To find the second largest element in the array
		
		int[] arrsec = { 32, 3 ,4, 54, 32, 23, 43, 232, 45, 32};
		
		// First to find the largest num
		int max = arrsec[0];
		int secondMax = arrsec[0];
		for( int jk = 0; jk < arrsec.length; jk++) {
			if(arrsec[jk] > max) {
				max = arrsec[jk];
			}
		}
		// another for loop for the second largest value
		for(int sc = 0 ; sc < arrsec.length ; sc++) {
			if(arrsec[sc] > secondMax && arrsec[sc] < max) {
				secondMax = arrsec[sc];
			}
		}
		
		System.out.println("Second Max : "+ secondMax);
		
	}
	
//	Write a program to find the second smallest element in a 1D array.
	
	public void secondSmallest() {
		
		int[] secSmall = { 32, 45, 56, 34, 65, 37};
		int min = secSmall[0];
		int secondMin = secSmall[1];
		// we initialize with the second element because the first element can be small 
		
		for(int mi = 0 ; mi< secSmall.length ; mi ++) {
			if(secSmall[mi] < min) {
				min = secSmall[mi];
//				 we got the second smallest number 
				
			}
		}
		// now another for loop for second smallest number 
		
		for(int se = 0 ; se < secSmall.length; se++) {
			
			 if (secSmall[se] > min && secSmall[se] < secondMin) {
		            secondMin = secSmall[se];
		        }
		}
		
		System.out.println( "Second Min : "+ secondMin);
		
		
	}
	
//	 Write a program to merge two 1D arrays.
	
	public void mergArray() {
		int[] arrO =  { 23, 23, 56, 78, 45, 76, 45};
		int[] arrS = { 4, 49, 4, 54};
		int[] arrCom = new int[11];
	
		// we have to store the elements in the new array
		
		
			for(int o = 0; o < arrO.length; o++)
			{
				arrCom[o]= arrO[o];
			}
			for(int h = 0; h< arrS.length; h++) {
				arrCom[arrO.length + h] = arrS[h];
				// the value need to be stored after the first array
			}
			// print last array
			for(int y = 0 ; y < arrCom.length; y++) {
				System.out.println(arrCom[y]);
			}
		
		
		
	}
	
	// check weather the array is palindrome or not 
	
	public void checkPalindrome() {
		int[] palin = { 1, 2, 67, 1};
		int[] check = new int[palin.length];
		int j = 0;
		for(int i = palin.length -1 ; i >=0 ; i--) {
			check[j] = palin[i];
			j++;
		}
		
		boolean isPalindrome = true;

	    for(int i = 0; i < palin.length; i++) {
	        if(palin[i] != check[i]) {
	            isPalindrome = false;
	            break;
	        }
	    }

	    if(isPalindrome) {
	        System.out.println("The array is palindrome");
	    } else {
	        System.out.println("The array is not palindrome");
	    }
	}
	
	
	
	
	
	
	
	

}

