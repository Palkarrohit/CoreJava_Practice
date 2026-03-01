package com.StreamPractice;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
	
	public static Map<Integer, List<Integer>>groupElementsInRange(int[] input)
	{
		List<Integer> list = Arrays.stream(input).boxed().collect(Collectors.toList());
		
		Map<Integer, List<Integer>> groupedMap =list.stream()
		.collect(Collectors.groupingBy(x->x/10*10,TreeMap::new ,Collectors.toList()));
		
	    return groupedMap;
	}
	
	public static List<Integer> getIntegersOnly(String[] input)
	{
	List<Integer> list=	Arrays.stream(input)
		.filter(x->x.matches("[0-9]+")).map(Integer::valueOf)
		.collect(Collectors.toList());
	
	return list;
	
		
	}
	public static List<String> getStringsOnly(String[] input)
	{
		 List<String> StringList=Arrays.stream(input).filter(x->x.matches("[a-zA-z]+"))
		.collect(Collectors.toList());
		 
		 return StringList;
		
	}
	
	public static List<Integer> getSquareOfFirstTwo(int[] input)
	{
		List<Integer> productList =Arrays.stream(input).boxed().collect(Collectors.toList())
		.stream().limit(2).map(x->x*x).collect(Collectors.toList());
		
	    return productList;
	}
	public static Integer getProductOfFirst_N_number(int[] input,int n)
	{
		int answer =Arrays.stream(input).boxed().collect(Collectors.toList())
		.stream().limit(n).reduce(1,(a,b)->a*b);
		
		return answer;
	}
	
	public static List<List<String>> getListOfAnagrams(String input)
	{
		//this is incorrect approach it gives all angrams converted in list by its own word
//		List<List<String>> answer= Arrays.stream(input.split(" ")).sorted()
//		.collect(Collectors.groupingBy(Function.identity(),Collectors.toList()))
//		.entrySet().stream().map(x->x.getValue()).collect(Collectors.toList());
		
		List<List<String>> answer=Arrays.stream(input.split(" "))
        .collect(Collectors.groupingBy(word -> {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            return new String(charArray);
        }))
        .values()
        .stream()
        .collect(Collectors.toList());
		
		return answer;
	}
	
	public static Integer multiplyAlternativeElements(int[] input,String category)
	{
		if(category.equalsIgnoreCase("even"))
		{
		int evenanswer=IntStream.range(0, input.length).filter(x->x%2==0)
				.map(x->input[x])
				.reduce(1,(a,b)->a*b);
		
		return evenanswer;
		}
		
		if(category.equalsIgnoreCase("odd"))
		{
		int evenanswer=IntStream.range(0, input.length).filter(x->x%2!=0)
				.map(x->input[x])
				.reduce(1,(a,b)->a*b);
		
		return evenanswer;
		}
		
		return -1;
	}
	
	public static Integer multiplyFirstandLastElements(int[] input)
	{
		
	  int answer=IntStream.of(0,input.length-1).map(x->input[x]).reduce(1,(a,b)->a*b);
	  return answer;
	}
	
	public static void multiplyFirstandLastAndSoOnElements(int[] input)
	{
		
		IntStream.range(0, input.length/2).map(x->input[x]*input[input.length-x-1])
		.forEach(System.out::println);
	}
	
	public static List<Integer> moveAllZerosOnCondition(int[] input,String zeroLocation)
	{
	   //approach 1: make two sub list one is of zero, one without zeores and then combine it
		
		List<Integer> mainList= Arrays.stream(input).boxed().collect(Collectors.toList());
		List<Integer> zeroList=mainList.stream().filter(x->x==0).collect(Collectors.toList());
		List<Integer> NonzeroList=mainList.stream().filter(x->x!=0).collect(Collectors.toList());
		List<Integer> frontzero= new ArrayList<>();
		List<Integer> Lastzero= new ArrayList<>();
		
		if(zeroLocation.equalsIgnoreCase("front"))
		{
			frontzero.addAll(zeroList);
			frontzero.addAll(NonzeroList);
			
			return frontzero;
			
		}
		if(zeroLocation.equalsIgnoreCase("last"))
		{
			Lastzero.addAll(NonzeroList);
			Lastzero.addAll(zeroList);
			
			return Lastzero;
			
		}
		
		return Arrays.asList(0);
	}
		
	public static List<Integer> moveAllZerosOnCondition_Approach2(int[] input,String zeroLocation)
	{
		//approach 2: using partitioned by+values+flatMap
		
		if(zeroLocation.equalsIgnoreCase("last"))
		{
		List<Integer> lastZero= Arrays.stream(input).boxed().collect(Collectors.toList())
		.stream().collect(Collectors.partitioningBy(x->x==0))
		.values().stream().flatMap(x->x.stream()).collect(Collectors.toList());
		
		return lastZero;
		}
		
		if(zeroLocation.equalsIgnoreCase("front"))
		{
			List<Integer> frontZero=Arrays.stream(input).boxed().collect(Collectors.toList())
			.stream().collect(Collectors.partitioningBy(x->x!=0))
			.values().stream().flatMap(x->x.stream()).collect(Collectors.toList());
		
			return frontZero;
			
			
		}
		
		
		return null;
		
	}
	
	
	public static boolean isArrayHaveUniqueValues(int[] input)
	{
		boolean answer = Arrays.stream(input).boxed().collect(Collectors.toList())
		.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().noneMatch(x->x.getValue()>1);
		
		
		
		return answer;
		//apprach 2
//		return Arrays.stream(input)
//                .distinct()
//                .count() == input.length;
	}
	
	
	public static Map<Character, List<String>> groupbyMiddlecChar(String[] input)
	{
		Map<Character, List<String>> answer =Stream.of(input).collect(Collectors.groupingBy(word->word.charAt(word.length()/2),Collectors.toList()));
		
		return answer;
		
	}
	
	public static Integer sumOfAllElementsOfList(List<Integer> input)
	{
		int answer=input.stream().mapToInt(Integer::valueOf).sum();
		return answer;
		
	}
	
	public static List<String> sortList(List<String> input)
	{
	
	List<String> answer=input.stream().sorted().collect(Collectors.toList());
	
	return answer;
	
	}
	
	public static List<Integer> getSquareOfAllFromList(List<Integer> input)
	{
		List<Integer> answer= input.stream().map(x->x*x).collect(Collectors.toList());
		
		return answer;
	}
	
	public static List<Integer> getUniqueOddFromList(List<Integer> input)
	{
		
		List<Integer> answer= input.stream().distinct().filter(x->x%2!=0).collect(Collectors.toList());
		return answer;
	}
	
	
	public static List<Integer> joinTwoList(List<Integer> input1,List<Integer> input2,String Condition)
	{
		if(Condition.equalsIgnoreCase("unionALL"))
		{
		List<Integer>  alljoinedList=Stream.concat(input1.stream(), input2.stream()).collect(Collectors.toList());
		
		return alljoinedList;
		}
		
		if(Condition.equalsIgnoreCase("uniqueOnly"))
		{
		List<Integer>  uniquejoinedList=Stream.concat(input1.stream(), input2.stream()).distinct().collect(Collectors.toList());
		
		return uniquejoinedList;
		}
		
		return null;
	}
	
	public static Integer finfKthSmallestNumber(List<Integer> input,int k)
	{
		int answer=input.stream().distinct().sorted().skip(k-1).findFirst().orElse(0);
		
		return answer;
	}
	
	public static List<String> getOnlyINTvalues(List<String> input)
	{
		List<String> answer=input.stream().map(word->word.replaceAll("[a-zA-Z]", ""))
		.collect(Collectors.toList());
		
		return answer;
	}
	
	public static List<String> getOnlyNumbers(List<String> input)
	{
		List<String> answer=input.stream().filter(word->word.matches("[0-9]+"))
				.collect(Collectors.toList());
		
		return answer;
		
	}
	
	public static List<String> convertListToUpperCase(List<String> input)
	{
		List<String> answer=input.stream().map(word->word.toUpperCase())
		.collect(Collectors.toList());
		
		
		return answer;
	}
	
	public static double getAvgOfAll(List<Integer> input)
	{
		
	double answer=input.stream().mapToDouble(Integer::doubleValue).average().getAsDouble();
	return answer;
		
	}
	
	
	public static List<Integer> findCommanElements(List<Integer> input1,List<Integer> input2)
	{
		//with out using stream :
//		Set<Integer> set = new HashSet<>();
//		List<Integer> answer=new ArrayList<>();
//		for(Integer element:input1)
//		{
//			set.add(element);
//			
//		}
//		for(Integer element2:input2)
//		{
//			if(set.contains(element2))
//			{
//				answer.add(element2);
//			}
//			
//		}
		List<Integer> answer= input1.stream().filter(input2::contains).collect(Collectors.toList());
		
		
		return answer;
	}
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
