package miniproject;
import java.util.Random;
import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		/*
		 * System.out.println("가위 바위 보 게임에 오신것을 환영합니다.");
		 * System.out.println("가위 바위 보를 입력 해주세요.");
		 * 
		 * Random random = new Random(); //컴퓨터가 고를 가위(0) 바위(1) 보(2) 를 넣어줘야함 int
		 * comChoice = random.nextInt(3); // 사용자 입력을 위한 Scanner 객체 생성 Scanner scanner =
		 * new Scanner(System.in); String userChoice = scanner.next();
		 * 
		 * int userNum = userChoice.equals("가위") ? 0 : userChoice.equals("바위") ? 1 :
		 * userChoice.equals("보") ? 2 : -1; System.out.println("당신의 손: " + userChoice);
		 * 
		 * //컴퓨터의 선택을 문자열로 변환 String comStr = (comChoice == 0) ? "가위" : (comChoice == 1)
		 * ? "바위" : "보"; System.out.println("컴퓨터의 손: " + comStr);
		 * 
		 * String result = (userNum == comChoice) ? "비겼습니다!" : ((userNum == 0 &&
		 * comChoice == 2) || // 내가 가위(0)인데 컴퓨터가 보(2)인 경우 (이김) (userNum == 1 &&
		 * comChoice == 0) || // 내가 바위(1)인데 컴퓨터가 가위(0)인 경우 (이김) (userNum == 2 &&
		 * comChoice == 1)) // 내가 보(2)인데 컴퓨터가 바위(1)인 경우 (이김) ? "컴퓨터가 이겼습니다!" :
		 * "컴퓨터가 겼습니다!";
		 * 
		 * System.out.println(result);
		 * 
		 * scanner.close();
		 */
		
		//사용자의 입력을 받기위한 스캐너 함수
				Scanner sc = new Scanner(System.in);
				
				//숫자를 무작위로 생성하기 위한 코드
				Random random = new Random();
				
				//컴퓨터의 선택
				int comChoice = random.nextInt(3);
							
				//사용자의 손
				String userHand = "";
				//컴퓨터의 손
				String comHand = "";
				
				//컴퓨터의 손을 글자로 만들기		
				if(comChoice == 0)
				{
					comHand = "가위";
				}
				
				if(comChoice == 1)
				{
					comHand = "바위";
				}

				if(comChoice == 2)
				{
					comHand = "보";
				}
				
				//콘솔창에 메시지 출력
				System.out.println("가위 바위 보 게임에 오신것을 환영합니다.");
				System.out.println("가위, 바위, 보를 입력 해주세요.");
				//유저의 입력 처리
				userHand = sc.next();
				
				//결과 출력 처리
				System.out.println("당신의 손 : " + userHand);
				System.out.println("컴퓨터의 손 : " + comHand);
				
				//비긴 경우
				if(userHand.equals(comHand))
				{
					System.out.println("비겼습니다!");
				}

				//사람이 이기는 경우
				if(userHand.equals("가위")&&comHand.equals("보") ||
				   userHand.equals("바위")&&comHand.equals("가위") ||
				   userHand.equals("보")&&comHand.equals("바위"))
				{
					System.out.println("당신이 이겼습니다!");
				}
				
				//컴퓨터가 이기는 경우
				if(comHand.equals("가위")&&userHand.equals("보") ||
				   comHand.equals("바위")&&userHand.equals("가위") ||
				   comHand.equals("보")&&userHand.equals("바위"))
				{
					System.out.println("컴퓨터가 이겼습니다!");
				}
				
				//스캐너 닫기
				sc.close();
		
		
		
	}

}
