package com.human.ex2;

public class JavaClass {

	public static void main(String[] args) {
		//String.format() ���ο� ���ڿ��� ����� �Լ� 
		String str=String.format("�ȳ� ���̸���%s","ȫ�浿");//���ڿ��� ���� ����� ���� ������� %s �� , �ڿ� �ִ� ���ڿ��� �ٲ�
		System.out.println(str);
		//�������� ���ڿ� ó��
		str=String.format("�ȳ� ���̸���%s�̰��°��� %s"+"�ٴϴ� �б���%s�Դϴ�","ȫ�浿","����","�޸�");//������� �־����µ� �ϴ�
		System.out.println(str);
		
		str=String.format("���̴�%d",20);
		System.out.println(str);
		
		//%s�� ���ڿ� 
		//%d�� ����
		//%f�� �Ǽ� 
		
		str=String.format("���̴�%d,Ű�� %f",20,170.3);
		System.out.println(str);
		
		int i1=30;
		int i2=11205580;
		double d1=3.141592;
		String str1="�ȳ��ϼ��� ";
		//String.format�� ����ؼ� 3���� ����غ��� 
		
		str=String.format("i1��%d�̰�d1��%f�̸�str1�� %s�Դϴ�", i1,d1,str1);
		
		System.out.println(str);
		System.out.println(String.format("i1��%d�̰�d1��%f�̸�str1�� %s�Դϴ�", i1,d1,str1));
		
		str=String.format(":%d:%10d:%10d:",i1,i1,i2);
		System.out.println(str);
		

		str=String.format(":%f:%.3f:%3.3f:",d1,(d1-0.0005),d1);
		//(d1-0.0005) 
		//������������� ���� ���� ���ϴ� �ڸ����� -5�� �ϸ� �ȴ� 
		//�ø��� ��쿡�� �ݴ�� +�� �Ѵ� 
		System.out.println(str);
		
	
		str=String.format("%%\"");// '%%'�� %�� ǥ���ϰ� ���� ��� \"�� "�� ǥ���ϰ���� ��쿡 ����Ѵ� 
		//("%%\"")�� ��� " "���� %�� "�� ǥ���ϱ� ���� "%%\""�� ����Ͽ��� ���� "(%%)(\")" �ΰ� 
		System.out.println(str);
		
		//%[-][0][��ü �ڸ���].[���е�][��ȯ����]
		
		str=String.format("%.2f%%",5.45);
		System.out.println(str);
		
		
	}

}
