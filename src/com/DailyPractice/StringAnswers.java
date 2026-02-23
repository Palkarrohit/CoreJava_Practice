package com.DailyPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class StringAnswers {
	
	public static String removeDuplicateCharacter(String input)
	{
		char[] characters=input.toCharArray();
		Set<Character> set=new LinkedHashSet<>();
		
		for(char ch:characters)
		{
			set.add(ch);
		}
		
		StringBuilder sb=new StringBuilder();
		for(char ch: set)
		{
			sb.append(ch);
			
		}
		
		String output=sb.toString();
		return output;
	}
	
	public static Character getFirstDuplicateCharacter(String Question)
	{
		char [] ch=Question.toCharArray();
		Set<Character> set=new HashSet<>();
		for(char c: ch)
		{
			if(set.contains(c))
			{
				return c;
			}
			set.add(c);
			
		}
		return null;
	}
	
	public static boolean isAnagram(String input1, String input2)
	{
		char[] chararray1=input1.toCharArray();
		char[] chararray2=input2.toCharArray();
		
		Arrays.sort(chararray1);
		Arrays.sort(chararray2);
		
		if(Arrays.equals(chararray1, chararray2))
		{
			return true;
		}
		else
		 {
		return false;
		}
	}
	
	

}
