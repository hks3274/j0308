package t4_overwride;

public class Bb extends Aa{
	//사디리꼴 면적
	public void areaPoly(int x, int y, int h) {
		int area = ( x + y ) * h / 2;
		System.out.println("사다리꼴의 면적(윗변: "+x+", 아랫변: "+y+", 높이: "+h+") : "+area);
	}
}
