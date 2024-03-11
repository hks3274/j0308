package t11_interface2;

public class Audio implements Remote {

	@Override
	public void switchOn() {
		System.out.println("Audio 전원을 킵니다.");
	}

	@Override
	public void switchoff() {
		System.out.println("Audio 전원을 끕니다.");
	}

	@Override
	public void remoteName(String name) {
		System.out.println(name + "리모콘");
	}

}
