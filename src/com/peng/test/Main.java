/**
 * ������������֧�ּӼ��˳���������������ż�����ȼ���ֻ�����ű�ʾ���ȼ����硰1+��2*5������
 * ����Ϊ�ַ�����ʽ�ı��ʽ
 */

package com.peng.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator ca = new Calculator();
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		int a = ca.getCalResult(s);
		System.out.print(a);
	}

}
