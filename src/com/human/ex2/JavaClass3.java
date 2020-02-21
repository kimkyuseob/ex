package com.human.ex2;

public class JavaClass3 {

	public static void main(String[] args) {
		//자동 형변환
		byte b1=10;//기본적으로 자료형이 다르면 변수에 값을 넣을수 없다 
		short s1=10;
		char c1=10;
		int i1=10;//4byte
		long l1=10;//8byte
		
		//본디 10은 인트형 자료형이기 때문에 바이트등 다른 변수에는 들어갈수없으나 상기에는 별다른 문제없이 작동되고있음 
		//자동형 변환되어 들어간것임 
		//정수형 자료형은 int형 상수가 자동으로 형변환되어 들어간다
		//안되는 경우는 한가지 있는데 
		// int i2=l1; 작은 데이터를 큰 데이터에 넣으면 자동 형변환이 되지만 큰 데이터를 작은 데이터에 넣으려 하면 자동 형변환되지않는다 
		
		//b1=i1;
		//b1=s1;
		i1=i1+i1;//20
		//int크기보다 작은 자료형연산은 int로 자동 형변환된다 
		//byte+byte=int
		// 이전에 설명들은 것과 마찬가지의 이유로 int로 통일 되기 때문 //속도 향상
		//short+short=int
		//i1=l1+10;//error
		//long+int=long long이 int보다 크기 때문에 int가 long으로 형변환된것 
		
		l1=l1+i1;//
		
		c1='A'+1;//char+int = int -> char
		c1='가'+'B';
		
		//실수형 
		float f1=10.f;//4byte
		double d1=10.;//8byte
		
		d1=f1;//double = float 은 이상없음 
		//f1=d1;//상위의 내용과 마찬가지로 큰데이터를 작은 데이터에 넣으려  하니 에러가남 
		
		f1=i1;d1=i1;f1=l1;d1=l1;
		//실수는 정수형보다 표현의 범위가 넓기 때문에 실수형에는 자기 데이터보다 큰 정수형 자료형을 넣을수있다 
		//i1=f1; i1=d1; 정수형은 실수형보다 표현 범위가 작기 때문에 넣을수없다 
		
		String str1="10";
		
		//i1=str1;
		//str1=10;
		str1=str1+10+10;//101010
		str1=10+10+str1;//2010 
		
		//str은 문자형이기 때문에 앞에서 사용되면 먼저 사칙연산 적용되서 문자형으로 변환 
		
		//int+String=String
		//String+int=String
		//float+String=String
		
		//강제 형변환(casting)
		//사용법은 소괄호 안에 변경하고자 하는 자료형을 넣어준다  ex)(int)long , (byte)byte+byte등
		b1=(byte)(b1+b1);
		
		i1=(int)l1; //크기가 달라서 손실이 생길수 있다 . 본인이 원하는 값과 다른 값이 나올수있다
		//문제가 없을때 사용하는것이 좋다 
		
		f1=3.14f;
		i1=(int)f1;//3 //int는 정수형이기 때문에 소수점이 표시되지않는다 
		
		System.out.println(i1);
		
		f1=i1;
		System.out.println(f1);//위에 3.14f를 넣어주었지만 3.0만 들어가있다 소수점 아래는 손실됨 
		
		f1=(float)d1;//손실이 생길수있다
		//본디 더 큰 double의 자료형을 더 작은 float으로 강제변환했기 때문 
		System.out.println(d1);
				
		//숫자 자료형을 문자열로 변환 하는 방법 
		
		String str3=f1+"";
		str3="10";
		i1=Integer.parseInt(str3);//i1이 정수 10이된다 \
		System.out.println(i1);
		i1=Integer.valueOf(str3);//Integer.parseInt와 같은 의미,최근에는 이것을 권장하고있으나 보통 Integer.parseInt를 사용한다 
		System.out.println(i1);
		str3="1.14";
		d1=Double.parseDouble(str3);//d1이 실수 1.14가 된다 
		System.out.println(d1);
		str3="1.14hi";//잘못된 문자열을 사용하면 문제가 발생한다 
		System.out.println(str3);
		
 	}

}
