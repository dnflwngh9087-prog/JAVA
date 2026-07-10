package ifexam;
/* 
 *  다중 if~ else
 *  - if~else 가 연속되는 것을 의미함
 *  조건이 참인경우 다른 조건일 경우 다 조건식을 만든다.
 *  
 *   
 *   형식
 *  if(조건식1) {
 *    실행 1
 *   }else if (조건식2){
 *    실행 2
 *   }else if (조건식3){
 *    실행 3
 *   }else {
 *   위의 조건식이 모두 거짓일 경우
 *   실행
 *   }
 * 
 *  성적을 입력받아 학점을 판정하는 프로그램을 작성하시오.
 *  A=> 90이상, B=> 80이상, C=> 70이상, D=>60이상, F => 60점 이하
 * 
 */

import java.util.*;

public class ifEx03 {

	public static void main(String[] args) {

		// 점수를 저장할 변수
		int score;
		// 학점을 저장할 변수(문자 하나면 되니깐 char)
		char grade;

		Scanner sc = new Scanner(System.in);
		System.out.print("점수 : ");
		score = sc.nextInt();

		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else if (score >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		System.out.println("당신의 점수는 " + score + "이며, 학점은" + grade + "입니다.");

	}

}
