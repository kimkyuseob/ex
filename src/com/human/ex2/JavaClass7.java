package com.human.ex2;

public class JavaClass7 {

	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("당신의 이름은 무엇입니까?");
		String s1=sc.nextLine();
		
		System.out.println("당신의 나이는 몇살입니까?");
		String s2=sc.nextLine();
		
		System.out.println("당신의 키는 얼마입니까?");
		String s3=sc.nextLine();
		
		System.out.println("당신의 몸무계는 얼마입니까?");
		String s4=sc.nextLine();
		
		System.out.println("당신의 이름은"+(s1)+"이고,나이는"+(s2)+"키는,"+(s3)+"몸무계는"+(s4)+"입니다");
		
		sc.close();
		
		
	}

}
