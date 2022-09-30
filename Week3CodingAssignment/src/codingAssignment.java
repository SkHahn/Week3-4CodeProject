import java.util.Arrays;

public class codingAssignment {

	public static void main(String[] args) {
	
//1.Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
	int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

	//a. Programmatically subtract the value of the first element in the array from the value in the 
	//   last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.  
		int lastMinusFirst = (ages[ages.length - 1] - ages[0]);
		System.out.println("Last element - first element: " + lastMinusFirst);
			
	//b. Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		ages = Arrays.copyOf(ages, ages.length + 1);
		ages[ages.length - 1] = 42;
			System.out.println("New array with additional age added: " + Arrays.toString(ages));
		
	//c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		int sum = 0;
		for (int age : ages) {
		sum += age;
	}
		int average = sum / ages.length;
		System.out.println("average age: " + average);
		
		
		
//2.Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

		// a.Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		int sumOfLetters = 0;
		for (int i =0; i < names.length; i++) {
			sumOfLetters += names[i].length();
		}
		average = sumOfLetters / names.length;
		System.out.println("Average number of letters per name: " + average);
		
		// b.Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		for (String name : names) {
			System.out.print(name + " ");
		}
		System.out.println();
//3.How do you access the last element of any array?	
	//to access an element in the array you use arrayName[element number in array] 
	System.out.println("3.to access the last element of an array you use arrayName[arrayName.length]");
	
//4.How do you access the first element of any array?
	System.out.println("4.to access the first element of an array you use arrayName[0]");	
		
//5.Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
	int[] nameLengths = new int[names.length];
	for (int i = 0; i < names.length; i++) {
		nameLengths[i] = names[i].length();	
	}
	System.out.println(Arrays.toString(nameLengths));

//6.Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
	int sumOfNameLengths = 0;
	for (int nameLength : nameLengths) {
		sumOfNameLengths += nameLengths.length;
	}
	System.out.println("Sum of each name length: " + sumOfNameLengths);
	
//7.Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. 
//  (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	System.out.println(multiplyString("Hello", 3));
	
//8.Write a method that takes two Strings, firstName and lastName, and returns a full name 
//	(the full name should be the first and the last name as a String separated by a space).
	String firstName = "Shannon";
	String lastName = "Hahn";
	String fullName = createFullName(firstName, lastName);
	System.out.println(fullName);
	
	
//9.Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	int[] nineTest = {45, 12, 3, 17, 14};
	System.out.println("Is the sum of this array greater than 100?" + " " + sumOfArray(nineTest));
	
//10.Write a method that takes an array of double and returns the average of all the elements in the array.
	double[] tenTest = {12.03, 34.50, 60.00, 25.75};
	System.out.println("The Average of thi array of double is:" + " " + calculateAverage(tenTest));
	
	
//11.Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	double[] elevenOne = {14.50, 12.50, 15.00, 19.75};
	double[] elevenTwo = {10.75, 11.00, 17.75, 16.50};
	System.out.println("Average of first array greater than average of second array:" + " " + isFirstGreater(elevenOne, elevenTwo));
	
//12.Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.		
	boolean isHotOutside = true;
	double moneyInPocket = 12.00;
	System.out.println("Will I buy a drink today?" + " " + willBuyDrink(isHotOutside, moneyInPocket));
	
	
//13.Create a method of your own that solves a problem. In comments, write what the method does and why you created it.		
		//a method that takes the dimensions of a flowerbed and determines the amount of soil needed to fill it.
	double height = 12.00;
	double width = 36.50;
	double length = 60.50;
	System.out.println("the amount of soil needed is " + soilNeeded(length, height, width) + " cubic ft.");
	
	


	}
	// #7
	public static String multiplyString(String str, int num) {
	String result = "";
	for (int i = 0; i < num; i++) {
		result += str;
	}
	return result;
	}	
	
	// #8
	public static String createFullName(String x, String y) {
	return x + " " + y;
	} 

	// #9
	public static boolean sumOfArray(int[] numbers) {
		int sum = 0;
		for (int number : numbers) {
			sum += number; }
		return (sum > 100);		
	}
	
	// #10
	public static double calculateAverage(double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
		}
		return sum / numbers.length;
	}

	// #11
	public static boolean isFirstGreater(double[] arrOne, double[] arrTwo) {
		return calculateAverage(arrOne) > calculateAverage(arrTwo);
	}

	// #12
	public static boolean willBuyDrink(boolean weather, double money) {
		return (weather && money > 10.50);
	}
	
	// #13
	public static double soilNeeded(double a, double b, double c) {
		double volume = (a * b * c) / 1728.00;
		double result = Math.round(volume);
		return result;
		
	}




}