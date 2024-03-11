package t11_interface2;

public class TvRun {
	public static void main(String[] args) {
		//추상클래스 인터페이스는 생성이 불가능
		//그래서 구현객체(구현 클래스)를 사용하여 생성해야함
		Tv tv = new Tv();
		
		System.out.println("Adio 최대볼륨 :"+ tv.MAX_VOLUME);
		System.out.println("Adio 최대볼륨 :"+ tv.MIN_VOLUME);
		System.out.println();
		
		tv.switchOn();
		tv.remoteName("TV");
		tv.switchoff();
		
	}
}
