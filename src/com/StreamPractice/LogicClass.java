package com.StreamPractice;

import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
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

	public static String getOccurenceOfEachWord(String input)
	{
		Map<String, Long> FreqMap=Arrays.stream(input.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
	
		String answer=FreqMap.toString();
		return answer;
	}
	
	public static String findWordwithNnumOfVowels(String input,int n)
	{
		String answer=Arrays.stream(input.split(" ")).distinct()
		.filter(words->words.replaceAll("[^aeiouAEIOU]", "").length()==n)
		.collect(Collectors.joining(" "));
		
		return answer;
		
	}
	
	public static List<List<Integer>> seperateList(int[] array)
	{
		List<List<Integer>> answermap=Arrays.stream(array).boxed().collect(Collectors.toList())
		.stream().collect(Collectors.groupingBy(x->x%2==0,Collectors.toList()))
		.entrySet().stream().map(x->x.getValue())
		.collect(Collectors.toList());
		
		return answermap;
		
	}
	
	public static String getOccurenceOfEachChar(String input)
	{
	//Map<String,Long> freqMap.toString
		String Answer= Arrays.stream(input.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.toString();
		
		return Answer;
	}
	
	public static List<Integer> sortOnOrderCondition(int[] array,String Order)
	{
		List<Integer> list=Arrays.stream(array).boxed().collect(Collectors.toList());
	
		if(Order.equalsIgnoreCase("ASC"))
		{
			return list.stream().sorted().collect(Collectors.toList());
		}
		else if(Order.equalsIgnoreCase("DSC"))
		{
			return list.stream().sorted((a,b)->b-a).collect(Collectors.toList());
		}
		else {
		return null;
		}
	}
	
	public static Integer getSumOfUniqueNumber(int[] array)
	{
		int answer=Arrays.stream(array).distinct().sum();
		return answer;
	}
	
	public static String getFirstNonrepeatedChar(String input)
	{
	
		String answer=Arrays.stream(input.split(""))
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet().stream().filter(x->x.getValue()==1).findFirst().orElse(null).getKey();
		
		return answer;
		
	}
	public static String getFirsRepeatedChar(String input)
	{
		
		String answer=Arrays.stream(input.split(""))
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet().stream().filter(x->x.getValue()>1).findFirst().orElse(null).getKey();
		
		return answer;
	}
	
	
}
