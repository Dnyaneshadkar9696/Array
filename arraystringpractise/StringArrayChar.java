package arraystringpractise;

public class StringArrayChar {

	public void stringtoArray() {

		String name = "Ganesh";
		// store each character into the string

		// we have to use the tochararray

		char[] ch = name.toCharArray();

		// using for each loop loop we print each character

		for (char c : ch) {
			System.out.print(c + " ");
		}

		System.out.println();
		this.findLength();

		this.checkPalindrome();
		System.out.println();
		this.removeSpaces();
		System.out.println();

		this.printAtEven();

		System.out.println();
		this.replaceStar();

		System.out.println();
		this.countVowelC();

		System.out.println();
		this.reverseString();

		System.out.println();
		this.lowerCaseUpperCase();

		System.out.println();
		this.countFrequency();
	}

// To count total vowels and consonants using the array

	public void countVowelC() {

		String name01 = "Dnyanesh";

		// here i have to check like the ascii value of a e i o u and then do the code
		// depending on that

		char[] chd = name01.toCharArray();

		// now using the for loop we can in it use the if else
		int countV = 0;
		int countO = 0;
		for (char c : chd) {

			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
					|| c == 'U') {
				countV++;
			} else {
				countO++;
			}
		}
		System.out.println("Count of Vowels is : " + countV);
		System.out.println("Count of Consonents is : " + countO);

	}

	public void findLength() {
		// to find the length of the string without using the length method

		String vector = "Suryawanshi";

		int count = 0;

		for (int t = 0; t < vector.length(); t++) {

			char ch = vector.charAt(t);

			if (ch != ' ') {
				count++;
			}
		}
		System.out.println("The length of String : " + count);
	}

	// to reverse the string using the array**
	// but in array the string is stored in ascii**

	public void reverseString() {

		String example = "Hellow World";
		// when ever i will store the string in the array it will store the ascci values

		// store into the char array and the we are able to perform opratioins on it

		char[] chh = example.toCharArray();

		// its not like you can use for each loop every time
		// here now doing reverse we can use normal for loop
		System.out.println("Reverse String : ");
		for (int i = chh.length - 1; i >= 0; i--) {
			System.out.print(chh[i]);
		}

	}

	// To check wheather the string is palindrome or not

	public void checkPalindrome() {

		String dx = "DaD";

		String output = "";

		for (int i = dx.length() - 1; i >= 0; i--) {

			char c = dx.charAt(i);

//			System.out.println(c);

			output = output + c;

		}

		if (dx.equals(output)) {
			System.out.println("The String is an palindrome");
		} else {
			System.out.println("The String is not an palindrome");
		}
	}

	// To convert all lowercase character to uppercase using array**

	public void lowerCaseUpperCase() {
		String hel = "JaVa";

		char[] cdd = hel.toCharArray();

		System.out.println("Lower and Upper Case: ");
		for (int i = 0; i < hel.length(); i++) {

			if (cdd[i] >= 'A' && cdd[i] <= 'Z') {

				cdd[i] = (char) (cdd[i] + 32);
			} else {
				cdd[i] = (char) (cdd[i] - 32);
			}

			System.out.print(cdd[i] + " ");
		}

	}

	// Count frequency of each character**
	// here frequency means how many times the h occurs and the l occurs and other
	// letters occurs that is the freauency

	public void countFrequency() {

	    String ns = "Hellow";  // input string

	    // outer loop → pick each character one by one
	    for (int s = 0; s < ns.length(); s++) {

	        int countF = 1;  // start count as 1 (current character itself)
	        char ch = ns.charAt(s);  // current character

	        // inner loop → check next characters (right side of current index)
	        for (int sd = s + 1; sd < ns.length(); sd++) {

	            char sh = ns.charAt(sd);  // next character

	            // if same character found → increase count
	            if (sh == ch) {
	                countF++;
	            }
	        }

	        // check whether this character was already counted before
	        boolean already = false;

	        // loop from start to current index (left side)
	        for (int h = 0; h < s; h++) {

	            // if same character already exists before → mark as counted
	            if (ns.charAt(h) == ch) {
	            	// each character is checked here and the same is skipped 
	            	//below
	                already = true;
	                break;  // no need to check further
	            }
	        }

	        // print only if character is not already counted
	        if (!already) {
	            System.out.println("Frequency of letter " + ch + " is : " + countF);
	        }
	    }
	}
	// remove all spaces from the string

	public void removeSpaces() {

		String ht = "Hello my name is suraj";
		String output = "";
		for (int g = 0; g < ht.length(); g++) {

			char ch = ht.charAt(g);

			if (ch != ' ') {
				output = output + ch;
			}
		}
		System.out.println("The String withour spaces : " + output);
	}

	// print characters at the even index positions

	public void printAtEven() {

		String hel = "Atomic Habits";
		System.out.println("Characters at the even positions : ");
		for (int p = 0; p < hel.length(); p++) {

			char c = hel.charAt(p);

			if (p % 2 == 0) {
				System.out.print(c + " ");
			}
		}
	}

	// Replace all vowels withe the *;

	public void replaceStar() {
		String n = "Dnyanesh";
		char s = '*';
		System.out.println("Replaced the vowels with the stars ");
		for (int y = 0; y < n.length(); y++) {

			char cc = n.charAt(y);
			if (cc == 'a' || cc == 'e' || cc == 'i' || cc == 'o' || cc == 'u' || cc == 'A' || cc == 'E' || cc == 'I'
					|| cc == 'O' || cc == 'U') {
				cc = s;
			}

			System.out.print(cc);

		}
	}

}
