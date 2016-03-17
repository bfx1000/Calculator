/**
 * 整数计算器，支持加减乘除，不考虑运算符号间的优先级，只用括号表示优先级，如“1+（2*5）”，
 * 输入为字符串形式的表达式
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
