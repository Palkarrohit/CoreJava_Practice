package com.StreamPractice;

public class MainApp {

	public static void main(String[] args) {
		//1.Longest word
		String Que1="My name is Rohit palkar brother of prabhramchandra";
		System.out.println("1.Longest word : "+LogicClass.getLongestWord(Que1));

		System.out.println("**********************************");
		
		//2.Remove duplicates and maintain order
		String Que2="dabcadefg";
		System.out.println("2.Remove duplicates and maintain order : "+LogicClass.removeDuplicates(Que2));
		
		System.out.println("**********************************");
		
		//3.Second Longest word
		String Que3="My name is Rohit palkar brother of prabhramchandra";
		System.out.println("3.Second Longest word : "+LogicClass.getSecondLongestWord(Que3));

		System.out.println("**********************************");
		//5.Occurrence of each word
	
		String Que5="My name is Rohit palkar brother of prabhramchandra";
		System.out.println("5.Occurrence of each word : "+LogicClass.getOccurenceOfEachWord(Que5));

		System.out.println("**********************************");
		//6.Find words with n number of vowels
	
		String Que6="My name is Rohit palkar brother of prabhramchandra";
		int num=2;
		System.out.println("6.Find words with n number of vowels : "+LogicClass.findWordwithNnumOfVowels(Que6,num));

		System.out.println("**********************************");
		//7.Separate odd even integer from list
		int[] Que7= {1,2,3,4,5,9,8,7,6,5,4};
		System.out.println("7.Separate odd even integer from list : "+LogicClass.seperateList(Que7));

		System.out.println("**********************************");
		//8.Occurrence of each character in word
		String Que8="rohitnital";
		System.out.println("8.Occurrence of each character in word : "+LogicClass.getOccurenceOfEachChar(Que8));

		System.out.println("**********************************");
		//9.Arrange number in ASC and DSC order
		int[] Que9= {1,2,3,4,5,9,8,7,6,5,4};
		String order="dSC";
		System.out.println("9.Arrange number in ASC and DSC order : "+LogicClass.sortOnOrderCondition(Que9, order));

		System.out.println("**********************************");
		//10.Sum of unique number from Array
		int[] Que10= {1,2,3,4,5,9,8,7,6,5,4};
		System.out.println("10.Sum of unique number from Array : "+LogicClass.getSumOfUniqueNumber(Que10));

		System.out.println("**********************************");
		//11.First non repeating character
		String Que11="aabcbdeff";
		System.out.println("11.First non repeating character : "+LogicClass.getFirstNonrepeatedChar(Que11));

		System.out.println("**********************************");
		//12.First repeating character
		String Que12="klmaabcbdeff";
		System.out.println("12.First repeating character : "+LogicClass.getFirsRepeatedChar(Que12));

		System.out.println("**********************************");
		//13.Group number by the range
		int[] Que13= {5,9,14,10,24,20,34,33,44,46,58,54};
		System.out.println("13.Group number by the range: "+LogicClass.groupElementsInRange(Que13));

		System.out.println("**********************************");
		//14.Find integers in String array
		String[] Que14= {"Rphit","Nit","88","Pal","99"};
		System.out.println("14.Find integers only in String array : "+LogicClass.getIntegersOnly(Que14));
		System.out.println("14-b.Find words only in String array : "+LogicClass.getStringsOnly(Que14));

		System.out.println("**********************************");
		//15.Find product of first N elements
		int[] Que15= {5,9,2,10,24,20,34,33,44,46,58,54};
		int N_numberInput=3;
		System.out.println("15-B.Find square of first two elements idividually : "+LogicClass.getSquareOfFirstTwo(Que15));
		System.out.println("15.Find product of first N elements : "+LogicClass.getProductOfFirst_N_number(Que15,N_numberInput));
		
		System.out.println("**********************************");
		//16.Find List of anagrams from String 
		String Que16="pat pan tap team nap meat tree";
		System.out.println("16.Find List of anagrams from String  : "+LogicClass.getListOfAnagrams(Que16));
		
		
		System.out.println("**********************************");
		//17.Multiply alternative elements from array
		int[] Que17= {5,9,1,10,4,6,3};
		String categeory="odd";
		System.out.println("17.Multiply alternative elements from array : "+LogicClass.multiplyAlternativeElements(Que17,categeory));
		
		System.out.println("******************************************");
		//18.Multiply 1st element and last from array
		int[] Que18= {5,9,1,10,4,6,3};
		System.out.println("18.Multiply 1st element and last from array : "+LogicClass.multiplyFirstandLastElements(Que18));
//		System.out.println("18-b.Multiply 1st & last,2nd & 2nd last and ....so on from array : ");
//		LogicClass.multiplyFirstandLastAndSoOnElements(Que18);
		
		System.out.println("******************************************");
		//19.Move all zeroes on Condition from array
		int[] Que19= {5,9,0,0,4,0,3};
		String zeroLocation="FRONT";
		System.out.println("19.Move all zeroes on Condition from array : "+LogicClass.moveAllZerosOnCondition(Que19,zeroLocation));
		System.out.println("19(Approach 2).Move all zeroes on Condition from array : "+LogicClass.moveAllZerosOnCondition_Approach2(Que19,zeroLocation));
		
		System.out.println("******************************************");
		//20.Check is all value from array are distinct or not
		int[] Que20= {5,9,0,0,4,0,3};
		System.out.println("20.Check is all value from array are distinct or not : "+LogicClass.isArrayHaveUniqueValues(Que20));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
