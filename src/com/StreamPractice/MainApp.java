package com.StreamPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
		
		
		System.out.println("******************************************");
		//21.Group by using middle  char of string
		String[] Que21= {"rohit","nital","shital","mohit","zeb","pa"};
		System.out.println("21.Group by using middle  char of string : "+LogicClass.groupbyMiddlecChar(Que21));
		
		
		System.out.println("******************************************");
		//22.Get sum of all elements from List
		List<Integer> Que22= List.of(5,9,0,0,4,0,3);
		System.out.println("22.Get sum of all elements from List : "+LogicClass.sumOfAllElementsOfList(Que22));
		
		
		System.out.println("******************************************");
		//23.Sort all elements from List
		List<String> Que23= Arrays.asList("pat", "pan" ,"tap" ,"team", "nap", "meat", "tree"); 
		System.out.println("23.Sort all elements from List : "+LogicClass.sortList(Que23));
		
		System.out.println("******************************************");
		//24.Take square of all elements from List
		List<Integer> Que24= List.of(5,9,0,0,4,0,3);
		System.out.println("24.Take square of all elements from List: "+LogicClass.getSquareOfAllFromList(Que24));
		
		System.out.println("******************************************");
		//25.Take unique Odd numbers from List
		List<Integer> Que25= List.of(5,9,0,9,4,0,3,6,7,5,4,1);
		System.out.println("25.Take unique Odd numbers from List : "+LogicClass.getUniqueOddFromList(Que25));
		
		System.out.println("******************************************");
		//26.Join two List on condition
		List<Integer> Que26_a= List.of(5,9,0,9,4,0,3,6,7,5,4,1);
		List<Integer> Que26_b= List.of(6,7,5,4,1);
		String condition="uniqueOnly";
		System.out.println("26.Join two List on condition : "+LogicClass.joinTwoList(Que26_a, Que26_b, condition));
		
		
		System.out.println("******************************************");
		//27.Find Kth smallest number from List 
		List<Integer> Que27= List.of(5,9,0,9,4,15,3,6,7,5,4,1);
		int kposition=2;
		System.out.println("27.Find Kth smallest number from List : "+LogicClass.finfKthSmallestNumber(Que27, kposition));
		
		System.out.println("******************************************");
		//28.Get only neumeric values skip characters
		List<String> Que28= List.of("ro23p","patil123","n1i8t0l","999");
		System.out.println("28.Get only neumeric values skip characters : "+LogicClass.getOnlyINTvalues(Que28));
		
		
		System.out.println("******************************************");
		//29.Get only numbers from list
		List<String> Que29= List.of("333","ro23p","patil123","n1i8t0l","999","rohit","888","patil");
		System.out.println("29.Get only numbers from list : "+LogicClass.getOnlyNumbers(Que29));
		
		System.out.println("******************************************");
		//30.Convert list to upper case
		List<String> Que30= List.of("maharaj","ro23p","patil123","N1I8T0L","999","rohit","888","patil");
		System.out.println("30.Convert list to upper case : "+LogicClass.convertListToUpperCase(Que30));
		
		System.out.println("******************************************");
		//31.Find avg of all numbers from list
		List<Integer> Que31= List.of(6,7,5,4,1);
		System.out.println("31.Find avg of all numbers from list : "+LogicClass.getAvgOfAll(Que31));
		
		System.out.println("******************************************");
		//32.Find intersection of two list
		List<Integer> Que32_a= List.of(6,7,9,8,0);
		List<Integer> Que32_b= List.of(6,7,5,4,1);
		System.out.println("31.Find avg of all numbers from list : "+LogicClass.findCommanElements(Que32_a, Que32_b));
		
		
System.out.println("***********************************************************************************************");
		
		//Playing with custom objects list
		
		
		
		  List<Employee> employees = Arrays.asList(

	                new Employee(101, "Rohit Sharma", "rohit@gmail.com", "Backend Developer", "IT", 75000),
	                new Employee(102, "Anita Verma", "anita@yahoo.com", "QA Engineer", "Testing", 65000),
	                new Employee(103, "Suresh Patil", "suresh@rahu.com", "DevOps Engineer", "Operations", 85000),
	                new Employee(104, "Priya Singh", "priya@gmail.com", "Frontend Developer", "IT", 70000),
	                new Employee(105, "Amit Kulkarni", "amit@yahoo.com", "Business Analyst", "Business", 72000),
	                new Employee(106, "Neha Joshi", "neha@rahu.com", "HR Manager", "HR", 60000),
	                new Employee(107, "Vikas Rao", "vikas@gmail.com", "Tech Lead", "IT", 95000),
	                new Employee(108, "Sneha Iyer", "sneha@yahoo.com", "UI/UX Designer", "Design", 68000),
	                new Employee(109, "Ramesh Gupta", "ramesh@rahu.com", "System Admin", "Operations", 78000),
	                new Employee(110, "Pooja Mehta", "pooja@gmail.com", "Product Manager", "Product", 92000),
	                new Employee(111, "Karan Shah", "karan@yahoo.com", "Support Engineer", "Support", 55000),
	                new Employee(112, "Divya Nair", "divya@rahu.com", "Data Analyst", "Analytics", 73000),
	                new Employee(113, "Arjun Desai", "arjun@gmail.com", "Cloud Engineer", "IT", 88000),
	                new Employee(114, "Meena Reddy", "meena@yahoo.com", "Scrum Master", "Agile", 81000),
	                new Employee(115, "Rahul Chavan", "rahul@rahu.com", "Security Engineer", "Security", 90000)
	        );

		//33.Find occurance of @gmail.com,... domains 
		Map<String, Long>answer =employees.stream()
		.collect(Collectors.groupingBy(x->x.getEmail().substring(x.getEmail().indexOf("@")),Collectors.counting()));
		
		System.out.println(answer);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
