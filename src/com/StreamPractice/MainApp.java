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

	}

}
