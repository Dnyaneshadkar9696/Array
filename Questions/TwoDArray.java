package arraypractise;

import java.util.Arrays;

public class TwoDArray {
	
	public void calling() {
		this.twoDArrayPrint();
		System.out.println();
		this.twoDArrayEvenOdd();
		System.out.println();
		this.reverseTwoD();
		System.out.println();
		this.printSum();
		System.out.println();
		this.maxValue();
		System.out.println();
		this.minValue();
		System.out.println();
		this.twoDSort();
		System.out.println();
		this.searchElement();
		System.out.println();
		this.countEvenOdd();
	}
	
	// declaration of an 2 D Array is  same as 1 D array just we have to add new brackets
	
	// print the values in 2D array
	public void twoDArrayPrint() {
		
		int[][] arr = {{1, 2, 3}, {11, 12, 13}, {21, 22, 23}};
		
		// the number of blocks like {} is the number of the rows 
		
//		int[][] arr1 = {{31, 32, 34}, {41, 42, 43}, {51, 52, 53}};
		
		// we have to print both the arrays 
		// now to print an 2D array we have two loops like one for rows and another for coloums
		
		for(int i = 0; i < arr.length; i++) {
			// above loop is for the rows 
			for(int j = 0; j < arr.length; j++) {
				// above loop is for column
				
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println(); // move to the next line
		}
	}
	
	// To check the Even odd numbers in the 2 D array
	
	public void twoDArrayEvenOdd() {
		
		int[][] arr1 = {{31, 32, 34}, {41, 42, 43}, {51, 52, 53}};
		System.out.println("Even Numbers : ");
		for(int k = 0 ; k < arr1.length ; k++) {
			for(int l = 0 ; l < arr1.length; l++) {
				
			
				if( arr1[k][l]%2 == 0) {
					System.out.print(arr1[k][l] + " ");
					// got the even numbers from the array
				}
			}
		}
		
	}
	
	// Program to reverse an 2 D array 
	public void reverseTwoD() {
		int[][] arr2 = {{31, 32, 34}, {41, 42, 43}, {51, 52, 53}};
		System.out.println("Reverse the 2 D array : ");
		for(int i = arr2.length -1 ; i >= 0; i--) {
			// above loop is for rows
			for(int j = arr2.length -1; j >= 0; j--) {
				System.out.print(arr2[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	// To print sum of all the array elements in the 2 D array
	
	public void printSum() {
		
		int[][] sum = {{23, 45, 54}, {27, 87, 56}, {45, 76, 98}};
		int max = 0;
		for(int t = 0; t <sum.length; t++) {
			for(int r = 0 ; r < sum[t].length; r++) {
				
				max = max + sum[t][r];
				
				
			}
		}
		System.out.println("Total sum of all elements in array : "+ max);
	}
	
	// To find the maximum value in the 2 D array
	
	public void maxValue() {
		
		int[][] arrAll = {{23, 45, 54}, {127, 87, 56}, {45, 76, 8}};
		int max = arrAll[0][0]; // fix the initial max
		for(int e = 0; e < arrAll.length; e++) {
			for(int s = 0 ; s < arrAll[e].length; s++) {
				
				if(arrAll[e][s] > max) {
					max = arrAll[e][s];
				}
			}
		}
		System.out.println("Max value in the array is : "+ max);
	}
	
	// to find the min value in the 2 D array 
	
	public void minValue() {
		
		int[][] arrM = {{23, 35, 1}, {17, 87, 36}, {5, 76, 8}};
		int min = arrM[0][0];
		for(int h = 0 ; h < arrM.length; h++) {
			for(int d = 0 ; d < arrM[h].length ; d++) {
				
				if(arrM[h][d] < min) {
					min = arrM[h][d];
				}
			}
		}
		System.out.println("The minimum value in the 2D array is : "+ min);
	}
	
	// using sort method sort the 2D array
	
	public void twoDSort() {
		
		int[][] arrSort = {{23, 35, 1}, {17, 87, 36}, {5, 76, 8}};
		
		
		System.out.println("The Sorted array as follows row wise: ");
		for(int j = 0 ; j < arrSort.length; j++) {
			for(int s = 0 ; s < arrSort.length; s++) {
				Arrays.sort(arrSort[j]);
				System.out.print(arrSort[j][s]+ " ");
			}
			System.out.println();
		
		}
		
	}
	
	// Program to search an element in the 2 D array
	public void searchElement() {
		
		int[][] arrSearch = {{23, 35, 1}, {17, 87, 36}, {5, 76, 8}};
		int element = 36;
		boolean found = false;
		for(int j = 0 ; j < arrSearch.length; j++) {
			for(int s = 0 ; s < arrSearch.length; s++) {
				if(arrSearch[j][s] == element) {
					found = true;
					break;
				}
			}
		}
		
		if(found) {
			System.out.println("Element is found in the array");
		}else {
			System.out.println("Element is not found in the array");
		}
		
	}
	
	// Program to count even and odd numbers in the 2 D array
	public void countEvenOdd() {
		
		int[][] arrCount = {{23, 35, 1}, {17, 87, 36}, {5, 76, 8}};
		int evenCount = 0;
		int oddCount = 0;
		for(int j = 0 ; j < arrCount.length; j++) {
			for(int s = 0 ; s < arrCount.length; s++) {
				if(arrCount[j][s] % 2 == 0) {
					evenCount++;
				}else {
					oddCount++;
				}
			}
		}
		
		System.out.println("Total even numbers in the array : "+ evenCount);
		System.out.println("Total odd numbers in the array : "+ oddCount);
		
	}
	
	
	

}
