package ifexam;
/* 문제]
 *      사용자로부터 이름, 국어, 영어, 수학 점수를 입력받아
 *      총점과 평균을 구한후 학점을 판정하는 프로그램을 작성하시오.
 *      
 *       결과
 *       이름 : 홍길동
 *       국어 : 10
 *       영어 : 10
 *       수학 : 10
 *       당신의 이름은 홍길동이며, 총점은 30점이고, 평균은 10점입니다.
 *       학점은 F 입니다.
 *      A : 90이상, B:80이상, C: 70이상, D:60이상 F:그외... 
 *      
 */
import java.util.*;
public class ifExam01 {

	public static void main(String[] args) {
	
     // 변수생성
	String name;
	int kor,eng,mat,hap; // =0; 해주면 더 깔끔
	char grade; // 학점 저장
	
	
	Scanner sc = new Scanner(System.in);	
	System.out.print("이름  : ");
	name = sc.next();
	
	System.out.print("국어 : ");
	kor = sc.nextInt();

	System.out.print("영어 : ");
	eng = sc.nextInt();
	
	System.out.print("수학 : ");
	mat = sc.nextInt();
	
	hap = kor+eng+mat; //총점
	int P = hap/3; //평균
	
    // hap = kor+eng+mat; 을 정의하고싶어! 근데 무슨 class로 해야하지??? >>숫자니깐 int
	// 평균(P)은 hap/int.length 으로 해면 안되나?>배열써야함 // 간단하게 할거면 3으로? 
	
	// if문으로 학점을 받는거도 만들어야함 "평균"이 90~60을 기준으로 학점 프로그램
	
	if (P >= 90  ) {
	    grade = 'A'; // > ;빼먹지 말기!!!!!!!!!!!!!!!!!!!!
	} else if (P >= 80) {
		grade = 'B';
	}else if (P >= 70) {
		grade = 'C';
	}else if (P >= 60) {
		grade = 'D';
	}else {
		grade ='F';
	}
	
	System.out.print("당신의 이름은 "+ name +"이며, 총점은 "+hap+"점이고, 평균은 "+P+"점입니다.학점은"+grade+"입니다.");
	
	}

}
