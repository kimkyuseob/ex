package com.human.ex2;

public class JavaClass6 {

	public static void main(String[] args) {
		java.util.Scanner sc
		=new java.util.Scanner(System.in);
		
		//����1
		System.out.println("������ �Է��ϼ���");
		String str=sc.nextLine();
		System.out.println("�̸��� �Է��ϼ���");
		String str1=sc.nextLine();
		System.out.println(str1+"���� ������"+(str)+"�Դϴ�");
		
		//����2
		System.out.println("Ű�� �Է��ϼ���");
		String ss=sc.nextLine();
		double s1=Double.parseDouble(ss); 
		
		System.out.println("m�� ��ȯ �Ǵ� ����"+ (s1*0.01)+"�Դϴ�");
		
		//����3
		System.out.println("���� ���ڸ��� ���ʴ�� �Է��Ͽ� ������ ���Ǹ� ���Ͻÿ�");
		String s2=sc.nextLine();
		String s3=sc.nextLine();
		String s4=sc.nextLine();
		
		double c1=Double.parseDouble(s2);
		double c2=Double.parseDouble(s3);
		double c3=Double.parseDouble(s4);
		
		System.out.println("������ ���Ǵ� "+(c1*c2*c3)+"�Դϴ�");
		
		//����4	
		System.out.println("����� ���ϴ� ���α׷��Դϴ�");
		
		String s5=sc.nextLine();
		
		double b1=Double.parseDouble(s5);
		b1=b1*3.3058;
		System.out.println("���Ͻ� ����"+(b1)+"�Դϴ�");
		
		//����5
		System.out.println("��������� ���ϴ� ���α׷��Դϴ�");
		System.out.println("������ �Է��ϼ���");
		String s6=sc.nextLine();
		System.out.println("�ӵ��� �Է��ϼ���");
		String s7=sc.nextLine();
		
		double a1=Double.parseDouble(s6);
		double a2=Double.parseDouble(s7);
		double ab1=((a1*(a2*a2))/2.0);
		
		System.out.println("� ��������"+(ab1)+"�Դϴ�");
		
		//���� 6
		System.out.println("����� �̸��� �����Դϱ�?");
		String q1=sc.nextLine();
		
		System.out.println("����� ���̴� ����Դϱ�?");
		String q2=sc.nextLine();
		
		System.out.println("����� Ű�� ���Դϱ�?");
		String q3=sc.nextLine();
		
		System.out.println("����� ������� ���Դϱ�?");
		String q4=sc.nextLine();
		
		System.out.println("����� �̸���"+(q1)+"�̰�,���̴�"+(q2)+"Ű��,"+(q3)+"�������"+(q4)+"�Դϴ�");
		
		sc.close();
		
	}

}
