package com.human.ex2;

public class JavaClass4 {

	public static void main(String[] args) {
		//����� �Է��� �޾ƺ��� 
		//����ڰ� Ű����� �Է��� �����͸� ���α׷����� �޾Ƽ� ó���ϴ°� 
		//int a 
		
		java.util.Scanner scanner
			=new java.util.Scanner(System.in);
		System.out.println("���ڿ��� �Է����ּ��� >>");
		String str1=scanner.nextLine();//������Է��� �޾� ���ڿ��� �������ִ� �Լ�, �̺κ��� ����ڰ� �Է��ϴ� �κ����� �ٲ�� 
		System.out.println(str1+"�� �Է��ϼ̽��ϴ�");
		
		//scanner.nextLine(); �� ����ص� ��� 
		
		//������Է��� ��� ���ڿ��̴�. 
		//���ڸ� ����ڷκ��� �������� ���ڿ��� ���ڷ� �����ϴ� �Լ��� ����Ѵ� 
		
		
		System.out.println("������ �Է����ּ���>>");
		str1=scanner.nextLine();		
		int i1=Integer.parseInt(str1);
		System.out.println("�Է��� ������ :"+i1);
		//����ڿ��� 2���� �Է¹޾� ���ؼ� ����غ���.
		System.out.println("���� ������ �Է����ּ���>>");
		String str2=scanner.nextLine();
		int i2=Integer.parseInt(str2);
		System.out.println("�Է��� ������ :"+i2);
		
		System.out.println("����� :"+(i1+i2));
		
		
		
		
		
		System.out.println("���α׷�����");
		scanner.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
 	}

}
