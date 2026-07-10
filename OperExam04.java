package com.operex;
/* 몬다이 니반]
 *           사용자로부터 임의의 정수를 입력받아
 *           입력받은 정수가 양수인지,음수인지,0인지를 판정하는 프로그램을 구현하시오. 
 *           단, 삼항 연산자를 활용하시오. 
 */
import java.util.*;
public class OperExam04 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
   //변수생성
	int a ;
	String s = "";
	
	//출력
	System.out.print("임의의 정수 : ");
	a = sc.nextInt(); //숫자 넣기
	
	//연산처리
    s = a >= 0 ? s= a ==0 ?" 0" : "양수" : "음수" ;
    // s = (a<0) ? "음수" : (a==0) ? "0" : "양수" ;
    
    System.out.println(a+"=>"+s);
	
	
	}

}
