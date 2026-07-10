package ifexam;
/*  문제]
 *       사용자로부터 임의의 년도를 입력받아 윤년인지,평년인지를 판별하는
 *       프로그램을 구현하시오.
 *       
 *       윤년의 판별 조건
 *       1. 년도가 4로나누어 떨어지면 윤년
 *       2. 년도가 100으로 나누어 떨어지면 평년
 *       3. 년도를 400으로 나누어 떨어지면 윤년       
 *       
 *        if 대신 삼항연산자로 만들어보시오
 */
import java.util.*;
public class ifExam03 {

	public static void main(String[] args) {
	int year ; //입력받은 년도 변수
	String str; // 삼항연산자를 위한 변수
	
	
	Scanner sc = new Scanner(System.in);
	System.out.print("년도 입력 : ");
	year = sc.nextInt();
	//아니 두개필요하면 ()를 하나 더 써서 안에 쓰면되네 &&<이게 and ||<or
   /*  	if( (year % 4 ==0 )&& (year %100 !=0) || (year % 400 ==0 )){
		//윤년의 조건 4로 나눴을때 나머지가 0 , 100으로 나눴을때 0으로 떨어지지않음 , 혹은 400으로 나누었을때 0 
	    System.out.println(year+"년은 윤년");
	} else { 
	    System.out.println(year+"년은 평년");
	}	
     */
	
	str = ((year % 4 ==0 )&& (year %100 !=0) || (year % 400 ==0 )) ? "윤년":"평년";
	 System.out.println(year+"년은"+str);
	
	
	}

}
