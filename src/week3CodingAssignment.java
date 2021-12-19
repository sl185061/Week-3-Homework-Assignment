import java.util.Arrays;

public class week3CodingAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	// Question #1
		int[] ages = {3,9,23,64,2,8,28,93,100}; //b:added element 100 to the end- dynamic
		int lastelement= ages[ages.length -1];
		int firstelement= ages[ages.length - ages.length];
		{System.out.println(lastelement -firstelement);}

		double sum = 0;
		for (double age : ages) { //c: added loop
			sum += age;}
			System.out.println(sum / ages.length);
			
	//Question #2 A: 
		String [] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		double sumOfString = 0;
		
		for (String name : names) {
			sumOfString += name.length();
		}
		System.out.println(sumOfString / names.length); 
	//Question #2 B:
	
		String str = new String();

		for (int i = 0; i <names.length; i++) {
			str += names[i] +" ";}
		
		{System.out.println(str);}
		
	// Question #3- access the last element by stating the lenght of the array - 1. 
	//Question # 4- subtracting the lenght by the lenght to get you to zero.
	
	// Question # 5
		int[] nameLengths = new int [names.length]; //this is new int array of names
	
		for (int i = 0; i <names.length; i++) {
					nameLengths[i] = names[i].length();}
				
			//	{System.out.println(Arrays.toString(nameLengths));} // 3,5,3,5,4,3
		
	//Question # 6. summing the numbers in the elements	
		int sum2 = 0;
		for (int element : nameLengths) {
			sum2 += element;}
			{System.out.println( sum2);}
			
/// variabl	
			String firstName = "Bob";
			String lastName = "Ross";
		int[] baller = {20,20,100};
		double[] baller2 = {20,20,100};
		double[] baller3 = {12,13,50};
		boolean isHotOutSide = true;
		double moneyInPocket = 10.50;		
//		{System.out.println(concatenateString("Hello", 3));	} //printout question 7
//		{System.out.println(firstAndLastName("Scott","Lewis"));}// printline Question8
//		{System.out.println(calculateSumArrayLessThan100(baller));}// pring question 9
//		{System.out.println(calculateAVG(baller2));} // question 10
//		{System.out.println(calculateAVG2(baller3,baller2));} question 11
//		 {System.out.println(willBuyDrink(isHotOutSide,moneyInPocket));}
		{System.out.println(addUpCash(baller2));}
	} 
	//Question #7. Concatenating word and number (print above)
	public static String concatenateString(String str, int number) {
		String result = "";
		for (int i = 0; i <number; i++) {
			result += str;
		}
	return result;
	}
	// Question #8:
	public static String firstAndLastName(String x, String y) {
	 return x +" "+y;
	}
	// Question #9
	public static boolean calculateSumArrayLessThan100( int[]x) {
		int sum3 = 0;
		for (int number : x) { //c: added loop
			sum3 += number;
			if (sum3 >100);
		}
	return (sum3 > 100); // remember if implies true so do not need to add true/false to return
	}
	//Question # 10
	public static double calculateAVG( double[] x) {
	double sum = 0;
	for (double number : x) { //c: added loop
		sum += number;}
	
	return sum / x.length;
	}
	//Quesiton # 11 //// it works! holy crap!
	public static boolean calculateAVG2( double[] x,double[] y) {
	double sum = 0;
	for (double number : x) { //c: added loop
		sum += number;}
	for (double number : y) 
		sum += number;
	
	return sum / x.length > sum / y.length;
	}
	///Question # 12
	public static boolean willBuyDrink(boolean x, double y) {
		if (x = true && y > 10.50); {
			
		return false;
	
	}
//Question # 13-- THIS ADDS UP THE CASH FROM THE YARD SALE, AND ANY CASH 
//	OVER 0 IS MORE THAN I HAD SO IT PRINTS HOW RICH I AM.
		public static String addUpCash( double[] x)	{
		double sum = 0;
		for (double number : x) { //c: added loop
			sum += number;}
		
	return sum + "= Bam, you are rich!";
	
	}
}