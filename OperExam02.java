package com.operex;
/* 문제]
 *  이름,국어,영어,수학 점수를 입력받아 
 *  총점을 구하여 이름과 총점을 출력하는 프로그램을 구현하시오.
 *  단, Scanner 클래스로 처리하시오.  
 */
import java.util.*;
public class OperExam02 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	// 변수 선언
	int kor,eng,mat,hap = 0;
	String name;
	
	
	 /* next()와 nextLine()의 차이
     * "Seoul Korea" 와 같이 공백이 들어간 문자열을 입력받을 때는
     * nextLine()의 이용하고, next()메소드로는 공백이 낀 문자열을
     * 읽어 들일수 없다. 
     */
	 System.out.print("이름 :");
     name = sc.next();
     // name = sc.nextLine();
	  System.out.print("국어 : ");
	  kor = sc.nextInt(); 
	  System.out.print("영어 : ");
	  eng = sc.nextInt();
	  System.out.print("수학 : ");
	  mat = sc.nextInt();
	  
	  hap = kor + eng + mat;
	  
      System.out.println("이름은 "+name+"이며, 총점은 " +hap+"점 입니다.");
    
    sc.close();
    
    
	}

}
