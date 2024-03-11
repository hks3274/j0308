package t11_interface3;
	
public class RemoteRun {
	public static void main(String[] args) {
		product product = new product();
		
		product.remoteName("TV");
		product.switchOn("TV");
		product.setVolume(5);
		product.setVolume(15);
		product.setVolume(-10);
		product.switchoff("TV");
		System.out.println("==================================================");
		System.out.println();
		
		product.remoteName("Audio");
		product.switchOn("Audio");
		product.setVolume(5);
		product.setVolume(15);
		product.setVolume(-10);
		product.switchoff("Audio");
	}	
}
