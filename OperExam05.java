package com.operex;

public class OperExam05 {

	public static void main(String[] args) {
	 int a = 7 , b = 3, imsi;
	 
	 System.out.println("바꾸기 전 => a="+a+",b="+b);
	 // swap 연산 처리
	/*
	 * imsi = a; a = b; b = imsi;
	 */
	 
	 // xor 연산처리 공간을 추가로 차지안해서 좋음  ((같으면0 다르면1))
	 a = a ^ b;
	 b=  b ^ a;
	 a = a ^ b;
	 
	 
	 
	 
	 System.out.println("바꾸기 후 => a="+a+",b="+b);
	 
	 
	}

}
