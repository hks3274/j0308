package t3_overwride;

public class Cc extends Aa{
	
////원 넓이 계산 메소드
//	public void areaCircle(int r) { //오버라이드
//		double area = r*r*Math.PI;
//		System.out.println("반지름 "+r+"인 원넓이 :"+ String.format("%.2f",area ));
//	}
//	
	
////원 넓이 계산 메소드 
//	public void areaCircle(int r) { //오버라이드
//		double area = r*r*3.14;
//		System.out.println("반지름 "+r+"인 원넓이 :"+ area);
//	}
//	
	
//원 넓이 계산 메소드 
	public void areaCircle2(int r) { //이건 그냥 메소드이다.
		double area = r*r*3.14;
		System.out.println("반지름 "+r+"인 원넓이 :"+ area);
	}
}
