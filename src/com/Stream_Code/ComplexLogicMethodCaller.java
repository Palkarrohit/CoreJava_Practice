package com.Stream_Code;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ComplexLogicMethodCaller {
	
	public List<String> flatMapCaller(List<List<String>> input)
	{
		Stream<String> answerStream=input.stream().flatMap(sent-> sent.stream())
		.map((String word)-> word.toUpperCase() );
		
		List<String> output=answerStream.distinct().sorted().toList();
		
		
		return output;
	}
	
	

}
