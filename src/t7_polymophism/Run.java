package t7_polymophism;

//Down Casting
/*
 * 규칙이 존재한다. -> 부모가 부모인지를 모른다. 
 * 상속을 받는 아이에게 부모로 올라온 뒤 그 자식이 내려가야한다.
 * upcasting이 되어야 downcasting이 된다.
 */
public class Run {
	public static void main(String[] args) {
//		Aa aa = new Aa();
		
		// Bb ab = (Bb)aa; //실행오류가 있음 -> 부모객체를 자식객체로 바로 down Casting할수는 없다.
		
		// downcasting은 ㅈ식객체가 부모객체로로 up casting하였을 경우에만 다시 downcasting 할 수 있다.
		
		Aa ba = new Bb(); 
		Bb bb = (Bb) ba; 
		System.out.println();
		
		Bb db = new Dd();
		Dd dd = (Dd)db;
		System.out.println();
		
		
//		Cc ec = new Ee();
//		Ee ee = (Ee) ec;
//		System.out.println();
//		
//		Aa eca = ec;
//		Cc ecac = (Cc)eca;
		
		Aa ea = new Ee();
		Ee eae = (Ee)ea;
		Cc eac = (Cc)ea;
	}
}
