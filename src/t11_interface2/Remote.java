package t11_interface2;

public interface Remote {
	public static final int MAX_VOLUME = 10; 
	int MIN_VOLUME = 0; //생략한거
	
	public abstract void switchOn();
	void switchoff(); //생략한거
	
	void remoteName(String name);
	
	
}
