package ifexam;
/* 문]
 *    사용자로부터 임의의 두정수와 연산자를 입력받아
 *    해당 연산자를 처리하는 프로그램을 작성하시오.
 *    단,입력은 BufferedReader로하고 모든 수는 정수 처리하시오.
 *    
 *    출력
 *    첫번째 수 : 10 
 *    연산자[+_* / %]: +
 *    두번째 수 : 14
 *    
 *    10 + 14 = 24
 */
import java.io.*;
public class ifExam04 {

	public static void main(String[] args) throws IOException {
	BufferedReader br = 
	new BufferedReader(new InputStreamReader(System.in));
    //변수 입력
	int n1,n2,result;
	char op;  // 연산자를 받는 변수 
   
	System.out.print("첫번째 수: ");
	n1 = Integer.parseInt(br.readLine());
	System.out.print("연산자[+_* / %]: ");
	op = (char)System.in.read();
	//엔터를 처리하는놈을 반드시 처리해야함
	System.in.skip(2);
	System.out.print("두번째 수: ");
	n2 = Integer.parseInt(br.readLine());
	
	// %c가 연산자를 가져옴
	if(op =='+') {
		result = n1 + n2;
		System.out.println(n1+" "+op+" "+n2+"=" +result);
	//	System.out.printf("%d %c %d = %d" , n1,op,n2,result);
		
	}else if(op =='-') {
		result = n1 - n2;
		System.out.println(n1+" "+op+" "+n2+"=" +result);
	//	System.out.printf("%d %c %d = %d" , n1,op,n2,result);
	}else if(op =='*') {
		result = n1 * n2;
		System.out.println(n1+" "+op+" "+n2+"=" +result);
	//	System.out.printf("%d %c %d = %d" , n1,op,n2,result);
	}else if(op =='/') {
		result = n1 / n2;
		System.out.println(n1+" "+op+" "+n2+"=" +result);
	//	System.out.printf("%d %c %d = %d" , n1,op,n2,result);
	}else if(op =='%') {
		result = n1 % n2;
		System.out.println(n1+" "+op+" "+n2+"=" +result);
	//	System.out.printf("%d %c %d = %d" , n1,op,n2,result);
	} else {
		System.out.println("연산자를 잘못 입력 하셨습니다.");
	}
	
	
	
	
	
	
	
	}

}
