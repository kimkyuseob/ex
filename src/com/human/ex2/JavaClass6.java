package com.human.ex2;

public class JavaClass6 {

	public static void main(String[] args) {
		java.util.Scanner sc
		=new java.util.Scanner(System.in);
		
		//문제1
		System.out.println("학점을 입력하세요");
		String str=sc.nextLine();
		System.out.println("이름을 입력하세요");
		String str1=sc.nextLine();
		System.out.println(str1+"님의 학점은"+(str)+"입니다");
		
		//문제2
		System.out.println("키를 입력하세요");
		String ss=sc.nextLine();
		double s1=Double.parseDouble(ss); 
		
		System.out.println("m로 변환 되는 값은"+ (s1*0.01)+"입니다");
		
		//문제3
		System.out.println("숫자 세자리를 차례대로 입력하여 상자의 부피를 구하시오");
		String s2=sc.nextLine();
		String s3=sc.nextLine();
		String s4=sc.nextLine();
		
		double c1=Double.parseDouble(s2);
		double c2=Double.parseDouble(s3);
		double c3=Double.parseDouble(s4);
		
		System.out.println("상자의 부피는 "+(c1*c2*c3)+"입니다");
		
		//문제4	
		System.out.println("평수를 구하는 프로그램입니다");
		
		String s5=sc.nextLine();
		
		double b1=Double.parseDouble(s5);
		b1=b1*3.3058;
		System.out.println("구하신 값은"+(b1)+"입니다");
		
		//문제5
		System.out.println("운동에너지를 구하는 프로그램입니다");
		System.out.println("질량을 입력하세요");
		String s6=sc.nextLine();
		System.out.println("속도를 입력하세요");
		String s7=sc.nextLine();
		
		double a1=Double.parseDouble(s6);
		double a2=Double.parseDouble(s7);
		double ab1=((a1*(a2*a2))/2.0);
		
		System.out.println("운동 에너지는"+(ab1)+"입니다");
		
		//문제 6
		System.out.println("당신의 이름은 무엇입니까?");
		String q1=sc.nextLine();
		
		System.out.println("당신의 나이는 몇살입니까?");
		String q2=sc.nextLine();
		
		System.out.println("당신의 키는 얼마입니까?");
		String q3=sc.nextLine();
		
		System.out.println("당신의 몸무계는 얼마입니까?");
		String q4=sc.nextLine();
		
		System.out.println("당신의 이름은"+(q1)+"이고,나이는"+(q2)+"키는,"+(q3)+"몸무계는"+(q4)+"입니다");
		
		sc.close();
		
	}

}
