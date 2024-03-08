package t2_inheritance;

public class Bb extends Aa{ 
//	item1 = 100;//field는 정의만 하는 구간 동작은 되지 않는다.
	int su = item1; //가져와서 사용은 가능, 선언을 하지 않으면 부모에게서 가져온 것이다.
	
	public Bb() {
		System.out.println("이곳은 Bb 클래스의 기본생성자");
	}
	
	
	public Bb(int su) {
		super(20);
		System.out.println("이곳은 Bb 클래스의 사용자정의 생성자, su = "+ su);
	}
	
	public Bb(int item1, int x, int y) {
		super(item1, x, y);
	}

	public void areaPoly(int x, int y, int h) {
		int area = ( x + y ) * h / 2;
		System.out.println("사다리꼴의 면적(윗변: "+x+", 아랫변: "+y+", 높이: "+h+") : "+area);
	}
}
