package com.human.ex2;

public class JavaClass5 {

	public static void main(String[] args) {
		java.util.Scanner sc
		=new java.util.Scanner(System.in);
		System.out.println("첫번째수를 입력하세요");
		String str1=sc.nextLine();
		int i1=Integer.parseInt(str1);
		System.out.println("입력하신수는"+i1);
		System.out.println("다음수를 입력해주세요");
		//String str1=sc.nextLine(); 변수값의 이름은 중복될수없다 
		str1=sc.nextLine();//str의 경우 앞에서 사용된것이 유지될 필요가없어서 재사용 되었지만 
		int i2=Integer.parseInt(str1);//i1의 경우 그 수를 이용해서 계산을 해야하기 때문에 남겨 놓아야한다 
		System.out.println("결과는"+(i1+i2)+"입니다");
		
		sc.close();
	}

}
