package com.StreamPractice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class LogicClass {
	
	public static String getLongestWord(String input)
	{
		
		String answer=Arrays.stream(input.split(" ")).max(Comparator.comparing(String::length)).get();
		
		return answer;
	}
	
	public static String removeDuplicates(String input)
	{
		String answer=Arrays.stream(input.split("")).distinct().collect(Collectors.joining());
	
		return answer;
	}
	
	public static String getSecondLongestWord(String input)
	{
		String answer=Arrays.stream(input.split(" ")).sorted((a,b)->b.length()-a.length())
		.skip(1).findFirst().orElseThrow().toString();
	
		return answer;
	}

}
