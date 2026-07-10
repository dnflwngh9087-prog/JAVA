package ifexam;
/*
 * 문]
 *   임의의 정수를 입력받아 입력받은 정수가 짝수인지, 홀수인지, 0인지, 
 *   아니면 판독불가인지를 판정하는 프로그램을 작성하시오,
 * 
 *    결과
 *    40 ==> 짝수
 * 
 *    41 ==> 홀수
 *    
 *     0 ==> 영
 *     
 *     이거외의 숫자는 판독불가
 */



import java.util.*;
public class ifExam02 {

	public static void main(String[] args) {
		
		int n;
		
		Scanner sc = new Scanner(System.in);
        System.out.print("정수 입력: ");
        n = sc.nextInt();
               
       if(n % 2 == 0) {
    	  System.out.println(n+"==> 짝수");
      } else if(n % 2 !=0 ) {
    	  System.out.println(n+"==> 홀수");   	  
      }  else if (n == 0) {
    	  System.out.println(n+"==> 영");
      } else {
    	  System.out.println(n+"==> 판독불가");
      }
        
        
	}

}
