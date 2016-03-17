package com.peng.test;

import java.util.Stack;

public class Calculator {
	private String expr = null;
	
	public Calculator(){
		
	}

	public String getExpr() {
		return expr;
	}

	public void setExpr(String expr) {
		this.expr = expr;
	}
	
	public int getCalResult(String s){
		int result = 0;
		expr = s;
		String temp = null;
		Stack<String> numAndBracket = new Stack<String>();//´æ·ÅÊý×ÖºÍÀ¨ºÅ
		Stack<String> symbol = new Stack<String>();//´æ·Å¼ÆËã·ûºÅ
		for(int i = 0;i < expr.length();i++){
			char c = s.charAt(i);
			if(Character.isDigit(c)){
				if(numAndBracket.empty()){
					numAndBracket.add(""+c);
					//System.out.println(c);
				}
				else{
					temp = (String)numAndBracket.peek();
					if(!temp.equals("(") && !temp.equals(")") && !symbol.empty()){
						int t = cal(symbol.pop(), numAndBracket.pop(), ""+c);
						numAndBracket.add(""+t);
						//System.out.println("he"+t);
					}
					else if(!temp.equals("(") && !temp.equals(")") && symbol.empty()){
						temp = numAndBracket.pop() + c;
						numAndBracket.add(temp);
						//System.out.println(temp);
					}
					else{
						numAndBracket.add(""+c);
						//System.out.println(c);
					}
				}
			}
			else if(c == '('){
				numAndBracket.add(""+c);
			}
			else if(c == ')'){
				temp = numAndBracket.pop();
				numAndBracket.pop();//µ¯³ö×óÀ¨ºÅ
				numAndBracket.add(temp);
				
			}
			else{
				symbol.add("" + c);
			}
		}
		while(!symbol.empty()){
			int t = cal(symbol.pop(), numAndBracket.pop(), numAndBracket.pop());
			numAndBracket.add(""+t);
		}
		result = Integer.valueOf(numAndBracket.pop());
		return result;
	}
	
	public int cal(String c, String a1, String a2){
		int b = 0;
		switch(c){
		case "+":
			return Integer.valueOf(a1) + Integer.valueOf(a2);
		case "-":
			return Integer.valueOf(a1) - Integer.valueOf(a2);
		case "*":
			return Integer.valueOf(a1) * Integer.valueOf(a2);
		case "/":
			return Integer.valueOf(a1) / Integer.valueOf(a2);
		default:
			break;
		}
		return b;
	}
}
