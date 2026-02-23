package com.Stream_Code;

import java.util.Arrays;
import java.util.List;

public class MainCaller {
	
	public static void main(String args[])
	{
		LogicMethodCaller LcallerObj=new LogicMethodCaller();
		
//		String input="My name is anthony gonzalvis.";
//		System.out.println("Using max() & get() highest size of number : "+LcallerObj.getHighestLenghtWord(input));
//	
//		System.out.println("Using filter(),collect(Collectors.tolist()) number of words on condtn : "+LcallerObj.getNoOfWordsOnCondition(input));
//		
//		System.out.println("Using filter & Map highest size of number : "+LcallerObj.getSmallerWordInCapital(input));
//	
//		ComplexLogicMethodCaller CcallerObj=new ComplexLogicMethodCaller();
//	
//	List<List<String>> complexList= Arrays.asList(
//			Arrays.asList("I","Love","Java"),
//			Arrays.asList("Java","is","funny","lang"),
//			Arrays.asList("lets","learn","Java"));
//	System.out.println("Calling complex List using flatMap "+CcallerObj.flatMapCaller(complexList));
    
	
		String input="I am learning java";
		String output=LcallerObj.findLongestWord(input);
		System.out.println("Find Longest word : "+output );
		
		String input2="ababcdef";
		String output2=LcallerObj.removeDuplicateChars(input2);
		System.out.println("Remove duplicate : "+output2 );
		
		String input3="I am learning java in simple manner";
		int n=1;
		String output3=LcallerObj.findNthLongestWord(input3, n);
		System.out.println("find Nth Longest Word : "+output3 );
		
		String input4="I am learning java in simple manner";
		int output4=LcallerObj.findSecondHighestWordLength(input4);
		System.out.println("SecondHighestWordLength : "+output4 );
	
		String input5="I am learning java in simple manner in java ";
		String output5=LcallerObj.findFreqOfWord(input5);
		System.out.println("findFreqOfWord : "+output5);
		
		String input6="I am learning java in simple manner in java ";
		int numberofVowles=2;
		String output6=LcallerObj.findNnumberOfVowelsWord(input6,numberofVowles);
		System.out.println("findFreqOfWord : "+output6);
		
	}

	
	
}
