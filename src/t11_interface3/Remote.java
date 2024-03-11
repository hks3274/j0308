package t11_interface3;

public interface Remote {
	public static final int MAX_VOLUME = 10; 
	int MIN_VOLUME = 0; //생략한거
	
	public abstract void switchOn(String name);
	
	void switchoff(String name); //생략한거
	
	void remoteName(String name);
	void setVolume (int volume);
}
