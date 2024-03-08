package t8_polymophism;

public class Cc extends Aa{
	public int su = 30;
	
	public Cc() {
		System.out.println("이곳은 Cc의 기본 생성자 입니다.");
	}
	
	@Override
	public void modCc() {
		System.out.println("이곳은 Cc클래스의 modCc메소드 입니다.");
	}
	
	@Override
	public void modHh(int a, int b) {
		System.out.println("두 수의 합? "+ (a+b));
	}
}
