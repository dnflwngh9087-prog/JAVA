package ifexam;

/* 중첩 if
 *  - if 문안에 if문을 포함하고 있는 문장을 의미함 
 * 
 *  형식
 *  if(조건이 참이면){
 *  조건이 참일때 안쪽 if문 수행
 *      if(조건식 ){
 *        조건이 참일때
 *       }else{
 *         조건이 거짓일때
 *  
 *      }
 *  }else{
 *     거짓일때 
 *  }
 */

/* 문제]
 *       점수와 학년을 입력받아 60점 이상이면 합격,미만이면 불합격
 *       단 학년이 4학년일 경우 70점 이상이어야 합격 
 */
import java.util.*;
public class ifEx04 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int score, year;
	System.out.print("점수 : ");
	score= sc.nextInt();
	System.out.print("학년 : ");
    year = sc.nextInt();
    
    if(score >= 60) {// 점수가 60점 이상인 사람만 판정한다.
       if(year != 4) {// 4학년이 아니면서 60점 이상인 경우
    	   System.out.println("합격");
       }else if(score >= 70) {//4학년 이면서 점수가 70점 이상이면 합격
    	   System.out.println("합격");
       }else {//4학년이면서 70점 미만이면 불합격
         System.out.println("불합격");    	
       }
    		
    }else {
    System.out.println("불합격");
	
    }
	
	
	
	
	
	
	
	
	}

}
