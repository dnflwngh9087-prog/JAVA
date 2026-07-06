package com.typeex;

/* char : 2byte -> 주로 unicode 사용
 *                       아스키 코드,
 * 아스키 코드 : 1바이트 문자를 표현, 0~  255까지 문자 표현                    
 * 유니코드 : (세계 표준 문자) : 2바이트 문자를 표현, 
 *                                 0 ~ 65535 까지의 문자
 *   - 세계 여러 국가의 문자들(한자,한글같은 비 영어권 문자 2 바이트)
 *     까지 표현 하기에 부족해서 1바이트를 추가 할당해서 표현한 방식
 *     
 *     기본값 표현은 
 *    char a = ' ', 
 *    char a = ' \u0000' 
 */



public class CharEx {

	public static void main(String[] args) {
		
      char ch1 ='A';
      char ch2 ='\u0041';
      char a = ' '; 
      char c = '\u0000'; 		  
      System.out.println(ch1);
      System.out.println(ch2);
      System.out.println(a);
      System.out.println(c);
      System.out.println("ch1 + ch2 : "+ch1+ch2);
      System.out.println("ch1 + ch2 : "+(ch1+ch2));
		
	}

}
