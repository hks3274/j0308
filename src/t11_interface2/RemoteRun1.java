package t11_interface2;

public class RemoteRun1 {
	public static void main(String[] args) {
		Audio audio = new Audio();
		Tv tv = new Tv();
		
		audio.switchOn();
		audio.remoteName("Audio ");
		audio.switchoff();
		System.out.println();
		
		tv.switchOn();
		tv.remoteName("TV ");
		tv.switchoff();
	}
}
