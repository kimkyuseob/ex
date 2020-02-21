package com.human.ex2;

public class JavaClass4 {

	public static void main(String[] args) {
		//사용자 입력을 받아보자 
		//사용자가 키보드로 입력한 데이터를 프로그램에서 받아서 처리하는것 
		//int a 
		
		java.util.Scanner scanner
			=new java.util.Scanner(System.in);
		System.out.println("문자열을 입력해주세요 >>");
		String str1=scanner.nextLine();//사용자입력을 받아 문자열로 리턴해주는 함수, 이부분이 사용자가 입력하는 부분으로 바뀐다 
		System.out.println(str1+"을 입력하셨습니다");
		
		//scanner.nextLine(); 만 사용해도 충분 
		
		//사용자입력은 모두 문자열이다. 
		//숫자를 사용자로부터 받으려면 문자열을 숫자로 변경하는 함수를 사용한다 
		
		
		System.out.println("정수를 입력해주세요>>");
		str1=scanner.nextLine();		
		int i1=Integer.parseInt(str1);
		System.out.println("입력한 정수는 :"+i1);
		//사용자에게 2수를 입력받아 더해서 출력해보자.
		System.out.println("다음 정수를 입력해주세요>>");
		String str2=scanner.nextLine();
		int i2=Integer.parseInt(str2);
		System.out.println("입력한 정수는 :"+i2);
		
		System.out.println("결과는 :"+(i1+i2));
		
		
		
		
		
		System.out.println("프로그램종료");
		scanner.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
 	}

}
