package t5_protected.mbc;
import t5_protected.kbs.Aa;

public class Bb  extends Aa{
	public int a2 = 10;
	protected int b2 = 20;
	int c2 = 30;
	private int d2 = 40;
	
	public void modA2() {
		System.out.println("이곳은 Bb클래스의 modA메소드 입니다");
	}
	
	protected void modB2() {
		System.out.println("이곳은 Bb클래스의 modB메소드 입니다");
	}
	
	void modC2() {
		System.out.println("이곳은 Bb클래스의 modC메소드 입니다");
	}
	
	private void modD2() {
		System.out.println("이곳은 Bb클래스의 modD메소드 입니다");
	}
	
	@Override
	public void test() {
		modC2();
		a = 100; //public이라 됨
		b = 200; //defalut는 안됨 , but, protected는 됨
//		c = 300; //defalut는 패키지 안에서만 허용하기 불가능
//		d = 400; //얘는 자신의 객체외 불가능 -private
		int d = getD();
		System.out.println("d: "+d);
	}
	
}
