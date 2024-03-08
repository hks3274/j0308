package t6_polymophism;
//upcasting
public class Run {
	public static void main(String[] args) {
		Aa aa = new Aa();
		
		Bb bb = new Bb();
		Aa ba = bb;
		System.out.println();
		
		Aa ba2 = new Bb();
		System.out.println();
		
		
		Cc cc = new Cc();
		Cc ca = new Cc();
		Aa ca2 = ca;
		System.out.println();
		
		Aa c = new Cc();
		System.out.println();
		
		Dd dd = new Dd();
		Bb db = new Dd();
		System.out.println();
		
		Aa da = new Dd();
		System.out.println();
		
		Ee ee = new Ee();
		Cc ec = new Ee();
		System.out.println();
		
		Aa ea = new Ee();
		System.out.println();
		
		/*
		 * 어떻게 변화하는 걸까? 이것을 객체타입변화라고한다.
		 *  객체에서는 upcasting 이라고 한다. 
		 *  부모위로 올라간다고 해서 그렇게 말한다. 
		 *  그럼 자식으로변할 수 있는가? --> 나중에 설명
		 */
	}
}
