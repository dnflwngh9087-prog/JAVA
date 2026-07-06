package com.oper;
// 산술연산자 : +,-,*,/,%(나머지)

public class operEx03 {

	public static void main(String[] args) {

   
		int a = 10, b=4;
		
		System.out.printf("%d + %d = %d%n", a,b,a+b);
		System.out.printf("%d - %d = %d%n", a,b,a-b);
		
		System.out.printf("%d * %d = %d%n", a,b,a*b);
		System.out.printf("%d / %d = %d%n", a,b,a/b);
		System.out.printf("%d / %.1f = %.1f%n", a,(float)b,a/(float)b);
		System.out.printf("%d %% %d = %d%n", a,b,a%b);
		
		
	}

}
