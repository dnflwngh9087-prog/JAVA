package com.typeex;

/*
 *  byte : 1byte인 정수형, 범위는 -128~127
 * 
 *       byte bb = -129;
 *       기본 값 -> 0 
 */



public class ByteEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte bb = 127;
		bb++;
		// Java에서는 컴파일 시 error 발생
		// 안정성 때문에 에러가 발생함
		System.out.println(bb);
		
	}

}
