package com.human.ex2;

public class JavaClass {

	public static void main(String[] args) {
		//String.format() 새로운 문자열을 만드는 함수 
		String str=String.format("안녕 내이름은%s","홍길동");//문자열을 쉽게 만들기 위해 만들어짐 %s 와 , 뒤에 있는 문자열과 바뀜
		System.out.println(str);
		//여러개의 문자열 처리
		str=String.format("안녕 내이름은%s이고사는곳은 %s"+"다니는 학교는%s입니다","홍길동","대전","휴먼");//순서대로 넣어지는듯 하다
		System.out.println(str);
		
		str=String.format("나이는%d",20);
		System.out.println(str);
		
		//%s는 문자열 
		//%d는 정수
		//%f는 실수 
		
		str=String.format("나이는%d,키는 %f",20,170.3);
		System.out.println(str);
		
		int i1=30;
		int i2=11205580;
		double d1=3.141592;
		String str1="안녕하세요 ";
		//String.format를 사용해서 3개를 출력해보자 
		
		str=String.format("i1는%d이고d1은%f이며str1은 %s입니다", i1,d1,str1);
		
		System.out.println(str);
		System.out.println(String.format("i1는%d이고d1은%f이며str1은 %s입니다", i1,d1,str1));
		
		str=String.format(":%d:%10d:%10d:",i1,i1,i2);
		System.out.println(str);
		

		str=String.format(":%f:%.3f:%3.3f:",d1,(d1-0.0005),d1);
		//(d1-0.0005) 
		//내리고싶을때는 상기와 같이 원하는 자리수에 -5를 하면 된다 
		//올림의 경우에는 반대로 +를 한다 
		System.out.println(str);
		
	
		str=String.format("%%\"");// '%%'는 %를 표기하고 싶을 경우 \"는 "를 표기하고싶을 경우에 사용한다 
		//("%%\"")의 경우 " "안의 %와 "를 표현하기 위해 "%%\""를 사용하였다 각각 "(%%)(\")" 인것 
		System.out.println(str);
		
		//%[-][0][전체 자리수].[정밀도][변환문자]
		
		str=String.format("%.2f%%",5.45);
		System.out.println(str);
		
		
	}

}
