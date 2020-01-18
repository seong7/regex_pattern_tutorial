package regex_tutorial;

import java.util.regex.*;

public class Regex1 {

	public static void main(String[]agrs) {
		
		String longString = " Derec Banas CA 12345 PA (412)555-1212 johnsmith@hotmail.com 412-555-1234 412 555 1234";
		String strangeString = " 1Z aaa **** *** {{{ {{ { ";
		
		System.out.println("\r 1 : 단어 찾기");
		regexChecker("\\s[A-Za-z]{2,20}\\s", longString);  
		//__ Derec, CA, PA 출력함  / Banas 는 Derec 체크 후 단어 앞 " " 가  없어져 Banas\\s 로 인식되므로 출력 X

			//		[A-Za-f] - Any characters (alphabet)
			//		[0-9]
			//		[^A-G] - not A - G (upper case) 
			//		\\s  - white space
			//		\\S  - not white space 
			//		{n,m} - minimum length, maximum length
			
			
			// Word that is 2 to 20 characters in length
			// [A-Za-z]{2, 20}	 =	\\w{2,20}
			
		
	
		System.out.println("\r 2 : 5자리 숫자 찾기 (zipcode)");	
		regexChecker("\\s\\d{5}\\s", longString);
		//__ 12345 출력         | zipcode 가 integer 5 자리라고 가정하면 체크할 수 있음
		
			//   		\\d  : digit
			//   		\\D  : not digit
			//			{5}  : length = 5
			
		
		System.out.println("\r3 : 주 이름 찾기 (미국)");		
		regexChecker("A[KLRZ]|C[AOT]", longString);
			// 2 characters that start with a C or A 
			// A[KLRZ]|C[ADT]
		
	
		
		System.out.println("\r4 : \" { \" 찾기");
		//regexChecker("(\\{{1,})", strangeString);
				// 위 아래 같음.
		regexChecker("(\\{+)", strangeString);  //__ {{{  , {{ , { 출력
		
			// 	{5,}  : minimum length = 5 / maximum length = none ( 띄어쓰기 유의 ) 
			//  +   :  최소 한번 이상 proceed 하라는 지시 ({1,} 와 같음)
			//  - ^ * + ? {} [] \ | ()   :   
			// 	  => 위 기호들은 regex 예약어 이므로 "\" back slash 를 앞에 써주어야 해당 문자 검색 가능
		
		
		
		System.out.println("\r5 : . 사용");
		regexChecker(".{3}", strangeString); //__ 길이 세개 연속인 아무 문자	찾기 (white space 도 문자로 인식하는것 유의하기)
		
			// .  :  anything
		
		
		System.out.println("\r6 : w 사용");
		
		
	}
	
	public static void regexChecker(String theRegex, String str2Check) {
		
		Pattern checkRegex = Pattern.compile(theRegex);
		
		Matcher regexMatcher = checkRegex.matcher(str2Check);
		
		while(regexMatcher.find()) {
			if(regexMatcher.group().length() != 0) {
				System.out.println(regexMatcher.group().trim());
			}
			
			System.out.println("Start index : " + regexMatcher.start());
			System.out.println("End Index : " + regexMatcher.end());
		}
		
	}
}
