package t8_polymophism;

public class Run {
	public static void main(String[] args) {
		
		Bb bb = new Bb();
		System.out.println();
		
		System.out.println("bb.su: " + bb.su);
		bb.modBb();
		bb.modAa();
		System.out.println();
		
	//upcasting downcasting을 왜 하느냐?? 			
		/*------------up casting-------------------------*/
		Aa ba = new Bb();
		
		ba.modAa(); 
		//upcasting을 하게 되면 자신의 존재를 망각하고 부모가 되었다.
		//그래서 다운 캐스팅이 필요한 이유는 다운캐스팅이 있어야
		// 같은 객체로 여러 메소드를 불러올 수 있기때문에
		
		System.out.println();
		/*------------down casting-------------------------*/
		//부모로 up casting이 되어 있을 경우에만 자신으로 downcasting할 수 있다.
		
		Bb bab = (Bb)ba;
		bab.modAa();
		System.out.println();
		
		/*--------------------------------------*/
		
		Aa ca = new Cc();
		ca.modCc();
		ca.modHh(12, 20);
		
		
	}
}
