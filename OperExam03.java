package com.operex;
/* 몬다이 이치 
 *    사용자로부터 임의의 정수를 입력받아 짝수인지 홀수인지를 판정하는
 *    프로그램을 작성하시오.  (짝수는 2로나누면 나머지가 0임 홀수는 1)
 *    단, 삼항 연산자를 이용하여 구현하시오.
 *    
 *    출력
 *    임의의 정수 : 17
 *    17 => 홀수
 */

import java.util.*;
public class OperExam03 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int num1;
	String s="";  //(아 짝수 홀수를 넣어야해서+오른항은 초기화 할려고 넣은거임)
	
	System.out.print("임의의 정수 : ");
	num1 = sc.nextInt();
	
	s= num1 % 2 == 0 ? "짝수" : "홀수";  //참이면 짝수 아니면 홀수 나온결과값은 s에 저장 why? String이라서 문자 ㅇㅇ
	
	
    System.out.println(num1+"=>"+s);
	
	// 2로나누면 짝수는 0 홀수는 1
	
	
	
	
	//result변수를 만들고 홀수인지 짝수인지 확인?
	
	

	}

}
