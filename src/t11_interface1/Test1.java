package t11_interface1;

public interface Test1 {
	public static final int MAX = 1000000; //상수개념
	int MIN = 0; //생략가능
	//전부 다 대문자로 사용하는것으로 한다. 
	
	void data(); //추상메소드 -> 중괄호 블럭 없음
	void data1(int su);
	public abstract void data2(); //생략가능
	
	default void data3() {
		//실행할 내용을 포함/생략
		System.out.println("이곳은 data3메소드(default)");
	}; //얘는 실행블럭이 있어야 함 ==> 얘는 가져다 사용해야 의미가 있음 --> 이럴경우 오버라이드해서 사용하면 좋음
	
	static void data4() {
		// 실행할 내용을 포함 ==> 메소드영역에 올리니 내용이 있어야 한다.
		System.out.println("이곳은 data4메소드(static)");
	};
	
}
