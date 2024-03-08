package t4_overwride;

//public final class Aa { //생성은 가능 상속은 불가능
public class Aa {
	private int item1 = 500;
	int item2 = 600;

	// 사각형의 면적을 계산 메소드
	public void areaRec(int x, int y) {
		int area = x * y;
		System.out.println("사각형의 면적(가로: "+x+", 세로: "+y+") : "+area);
	}
	
	//원 넓이 계산 메소드
//	public final void areaCircle(int r) {// final을 사용하면 메소드는 오버라이드(재정의)를 해서 사용할 수 없다.
	public  void areaCircle(int r) {
		double area = r*r*3.14;
		System.out.println("반지름 "+r+"인 원넓이 :"+ area);
	}
}
