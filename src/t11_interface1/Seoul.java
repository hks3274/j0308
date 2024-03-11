package t11_interface1;

public class Seoul implements Test1{
	int max;
	
	@Override
	public void data() {
		System.out.println("여기는 Seoul 클래스의 data메소드");
	}
	
	@Override
	public void data1(int su) {
		if(su > MAX) max = su;
		else max = MAX;
		System.out.println("최대값 : " + max);
	}
	
	@Override
	public void data2() {
		System.out.println("여기는 Seoul 클래스의 data2메소드");
	}

}
