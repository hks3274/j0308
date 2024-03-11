package t11_interface2;

public class AudioRun {
	public static void main(String[] args) {
		//추상클래스 인터페이스는 생성이 불가능
		//그래서 구현객체(구현 클래스)를 사용하여 생성해야함
		Audio audio = new Audio();
		
		System.out.println("Adio 최대볼륨 :"+ audio.MAX_VOLUME);
		System.out.println("Adio 최대볼륨 :"+ audio.MIN_VOLUME);
		System.out.println();
		
		audio.switchOn();
		audio.remoteName("Audio");
		audio.switchoff();
		
		
	}
}
