package t2_inheritance;

public class Run {
	public static void main(String[] args) { //메인스레드에서 움직이는 작업은 순차적이다.
		System.out.println("1. 이곳은 Run 구간입니다.");
		
		Bb bb1 = new Bb();
		bb1.areaRec(10, 20);
		bb1.areaPoly(1, 2, 3);
		System.out.println();
		
		Bb bb2 = new Bb(10); //어떤 생성자를 가져와도 상관없다.
		bb2.areaPoly(2, 3, 4);
		System.out.println();
		
		Bb bb3 = new Bb(10,2,3); 
		System.out.println();
		
		
		System.out.println("2. 이곳은 Run 클래스입니다.");
	}
}
