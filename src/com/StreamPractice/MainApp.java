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

	
	}

}
