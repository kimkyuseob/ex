/*
다른 줄까지 넘어갈때 사용하는 주석


 */
//한줄 주석

package com.human.ex;	//폴더 경로		패키지를 쓰고 폴더경로를 입력
public class HelloWorld3 {
	public static void main(String[] args) {//main : 프로그램 시작 부분
		System.out.println("hello");	// ln 라인을 바꾸라는 뜻  그래서 println을 쓰면 출력할때 한출 바뀜
		System.out.println("World");
		System.out.println("hello\tworld");		// \t tab에 약자       뛰어쓰기 처럼 뛰어짐
		System.out.println("hello\nWorld");		// \n enter에 약자       한줄 밑으로 내려감
		
		System.out.print("hello");		// print를 사용했을때 서로 떨어져서 사용해도 마지막에 \n을 사용한다면 
		System.out.print("World");		// 붙어서 나옴
		System.out.print("\n");			 
		
		/*
		System.out.println("hello");	// println을 사용해서 \n 을 사용한다면 앞에 출력과 뒤에 출력사이 2줄이 뛰어짐 
		System.out.println("World");		
		System.out.println("\n");	
		*/

		System.out.println("hello\"World\""); // \뒤에 붙은 문자가 ""를 붙은 상태로 출력 
		
		//이스케이프 시퀸스 (escape sequence)	
		//문법에 문제가 되는 문자나 특수기호를 문자열로 출력학 싶을때 사용한다.
		//사용방법은 /(역슬레쉬) 다음에 문자형태로 사용 ex) \n \"
	}

}