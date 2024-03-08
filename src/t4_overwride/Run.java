package t4_overwride;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
	Cc cc = new Cc();
	
	//cc.areaCircle(50);

	Scanner sc = new Scanner(System.in);
	System.out.print("1.신라, 2.백제 ?");
	int ans = sc.nextInt();
	System.out.print("반지름? ");
	int r = sc.nextInt();
	
	if(ans == 1) cc.areaCircle(r); //재정의
	else if (ans == 2) cc.areaCirclr2(r); //부모것을 가져온 것
	else System.out.println("코드를 확인 후 다시 처리해주세요");
	
	sc.close();
	}
}
