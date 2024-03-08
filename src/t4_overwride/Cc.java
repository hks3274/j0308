package t4_overwride;

public class Cc extends Aa{

	
////원 넓이 계산 메소드 
//	public void areaCircle(int r) { //이건 그냥 메소드이다.
//		double area = r*r*Math.PI;
//		System.out.println("반지름 "+r+"인 원넓이 :"+ String.format("%.2f",area));
//	}

	@Override
	public void areaCircle(int r) {
		double area = r*r*Math.PI;
		System.out.println("반지름 "+r+"인 원넓이 :"+ String.format("%.2f",area));
		
	}
	
	public void areaCirclr2(int r) {
		super.areaCircle(r);
	}
	
}
