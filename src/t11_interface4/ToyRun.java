package t11_interface4;

import java.util.Scanner;

/*
		기능		곰돌이 		로보트 		비행기 		탱크
		움직임		O				O				X			O
		레이져 		X				X				O 		O
		미사일		X				O				O			O
		연령 	전연령		 4~		   8~    13세 이상
		
		구매 어린이의 나이를 입력하여 구매 가능한 장난감을 표시해 주세요
 */
public class ToyRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Toy[] toys = { new Bear(), new Robot(), new AirPlane(), new Tank() };
		String[] titles = { "곰돌이", "로봇", "비행기", "탱크" };

		while (true) {
			System.out.println("\n어떤 장난감 구매를 희망하십니까?");
			System.out.print("1. 곰돌이 2. 로봇 3. 비행기 4.탱크 0. 종료 ==>");
			int choice = sc.nextInt();

			if (choice == 0)
				break;

			System.out.println("* 장난감 이름 : " + titles[choice - 1] + " *");
			toys[choice - 1].moving();
			toys[choice - 1].fire();
			toys[choice - 1].misaile();
			toys[choice - 1].age();
			System.out.print("구매를 희망하십니까?(Y/N) ==>");
			String ans = sc.next().toUpperCase(); 
			
			if(ans.equals("N")) {
				System.out.print("다음에 또 이용해 주세요 ");
				break;
			} else System.out.println(titles[choice-1]+" 구매가 확정되었습니다 ");
		}

		System.out.println("감사합니다");

		sc.close();
	}
}
