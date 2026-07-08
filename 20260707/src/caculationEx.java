import java.util.Scanner;
public class caculationEx {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println(); // 더하기 전용 계산기
	
	System.out.print("1"); // 첫 번째 숫자 입력받기
	int num1 = sc.nextInt();
	
   System.out.print("2"); //두번째 숫자 입력받기  println 하고 그냥 print차이?
    int num2 = sc.nextInt();
	
    int result = num1 + num2; // 더하기 연산 수행
   
   System.out.println("");
   System.out.println("입력한 두수의 합:" + result);
   System.out.println("");
   sc.close();
	}

}
