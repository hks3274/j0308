package t11_interface2;

public class RemoteRun2 {
	public static void main(String[] args) {
//		Remote audio = new Audio(); //upcasting 
//		Remote tv = new Tv();
		
		Remote[] remotes = {new Audio(),new Tv()};
		String[] titles = {"Audio", "TV"};
		
		for (int i = 0; i < remotes.length; i++) {
			remotes[i].switchOn();
			remotes[i].remoteName(titles[i]);
			remotes[i].switchoff();
			System.out.println();
		}
		
//		audio.switchOn();
//		audio.remoteName("Audio ");
//		audio.switchoff();
//		System.out.println();
//		
//		tv.switchOn();
//		tv.remoteName("TV ");
//		tv.switchoff();
	}
}
