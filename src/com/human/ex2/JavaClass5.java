package com.human.ex2;

public class JavaClass5 {

	public static void main(String[] args) {
		java.util.Scanner sc
		=new java.util.Scanner(System.in);
		System.out.println("ù��°���� �Է��ϼ���");
		String str1=sc.nextLine();
		int i1=Integer.parseInt(str1);
		System.out.println("�Է��Ͻż���"+i1);
		System.out.println("�������� �Է����ּ���");
		//String str1=sc.nextLine(); �������� �̸��� �ߺ��ɼ����� 
		str1=sc.nextLine();//str�� ��� �տ��� ���Ȱ��� ������ �ʿ䰡��� ���� �Ǿ����� 
		int i2=Integer.parseInt(str1);//i1�� ��� �� ���� �̿��ؼ� ����� �ؾ��ϱ� ������ ���� ���ƾ��Ѵ� 
		System.out.println("�����"+(i1+i2)+"�Դϴ�");
		
		sc.close();
	}

}
