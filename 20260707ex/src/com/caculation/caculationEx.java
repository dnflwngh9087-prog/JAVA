package com.caculation;

import java.util.Scanner;

public class caculationEx {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); // Scanner<- 더하기 전용계산기 ,, sc는 그냥 이름
	System.out.println(); //빈칸추가
	
	System.out.print("첫 번째 숫자를 입력하세요"); // 글자를 띄운거임 
	
	int num1 = sc.nextInt();/* 내가 숫자를 타이핑하고 enter누를 때 까지 기달리고, 
	                           숫자를 입력하면,그 숫자를 정수 형태(int)로 읽어서 num이라는 변수에 넣음 */
	
    System.out.print("두번째 숫자를 입력하세요"); //두번째 숫자 입력받기  
    int num2 = sc.nextInt();
	
    int result = num1 + num2; // 더하기 연산 수행해서 num1상자+num2상자를 더해 result상자에 저장
   
   System.out.println(""); //가독성을 위해 한 칸씩 띄운거임
   
   System.out.println("입력한 두수의 합:" + result); /*이때 +는 숫자를 더하는게 아니라 문자열 뒤에 결과숫자를
                                                                    이어 붙여서 화면에 보여주는 의미임 */
   System.out.println("");
   
   sc.close(); //빌려온거 다썼으니 돌려줘야함
	}

}
