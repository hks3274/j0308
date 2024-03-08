package t10_abstract3;

public class Run {
	public static void main(String[] args) {
		Phone samsung = new Samsung("홍길동");
		samsung.powerOn();
		samsung.sound();
		samsung.function();
		samsung.functionSamsung();
		samsung.powerOff();
		System.out.println();
		
		Phone lg = new Lg("김말숙");
		lg.powerOn();
		lg.sound();
		lg.function();
		lg.functionLg();
		lg.powerOff();
		System.out.println();
	}
}
