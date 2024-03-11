package t11_interface6;

import java.util.Scanner;

public class ActorRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Actor actor = new Actor();
		boolean run = true;

		actor.catching();
		actor.serch();
		actor.fire();
		actor.save();
		actor.pizza();
		actor.spagetti();
		System.out.println("===============================");

		String[] title = { "경찰관", "소방관", "요리사" };

		while (run) {
			System.out.println("어떤 역할을 하시겠습니까?");
			System.out.print("1.경찰관 2.소방관 3.요리사 0.종료 ==>");
			int action = sc.nextInt();

			if (action < 1 || action > 3) {
				if (action == 0)  break;
				System.out.println("1,2,3번의 배역만 역할 조회가 가능합니다\n");
				continue;
			}

			switch (action) {
				case 1:
					actor.catching();
					actor.serch();
					break;
				case 2:
					actor.fire();
					actor.save();
					break;
				case 3:
					actor.pizza();
					actor.spagetti();
					break;
			}
			System.out.println("-----------------------------");
		}
		System.out.println("-----------------------------");
		System.out.println("각 역할을 충분히 연습해 오세요\n");
	
		sc.close();
	}
}
