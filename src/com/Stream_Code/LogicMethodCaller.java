package com.Stream_Code;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LogicMethodCaller {
	
	public String getHighestLenghtWord(String input)
	{
		String answer=Arrays.stream(input.split(" ")).max(Comparator.comparing(String::length)).get();
		
		return answer;
	}
	
	public int getNoOfWordsOnCondition(String input)
	{
		List<String> answer=Arrays.stream(input.split(" "))
				.filter((String word)->word
						.length()>3)
				.collect(Collectors.toList());
		
		return answer.size();
	}
	
	public String getSmallerWordInCapital(String input)
	{
		String answer=Arrays.stream(input.split(" "))
				.filter((String word)->word.length()<3)
				.map((String word)->word.toUpperCase())
			     .collect(Collectors.joining(" "));
		return answer;
	}
	
	public String findLongestWord(String input)
	{
		String output=Arrays.stream(input.split(" ")).max(Comparator.comparing(String::length)).get();
	
		return output;
	}
	
	public String removeDuplicateChars(String input)
	{
		String output=Arrays.stream(input.split("")).distinct().collect(Collectors.joining());
		
		return output;
		
//		return input.chars().distinct()
//				.mapToObj(c-> String.valueOf((char) c))
//						.collect(Collectors.joining());
//		
		
	}
	public String findNthLongestWord(String input,int n)
	{
		String output=Arrays.stream(input.split(" "))
				.sorted(Comparator.comparing(String::length).reversed())
				.skip(n).findFirst().get();
	
		return output;
	
	}
	
	public int findSecondHighestWordLength(String input)
	{
		int output=Arrays.stream(input.split(" ")).map(word->word.length())
		.sorted(Comparator.reverseOrder())
		.skip(1).findFirst().get();
		return output;
	}
	
	public String findFreqOfWord(String input)
	{
		Map<String,Long> freq=Arrays.stream(input.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		String output=freq.toString();
	
		return output;
	
	}
	
	public String findNnumberOfVowelsWord(String input,int n)
	{
		String output=Arrays.stream(input.split(" ")).filter(words->words.replaceAll("[^aeiouAEIOU]", "").length()==n).collect(Collectors.joining(" "));
		
		return output;
	}
	
	public List<Integer> findSubOddEvenSubList(int[] array)
	{
		List<Integer> list=Arrays.stream(array).boxed().collect(Collectors.toList());
		
		return null;
	}
	
	

}
