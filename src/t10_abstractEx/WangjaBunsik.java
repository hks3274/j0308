package t10_abstractEx;

public class WangjaBunsik extends Bonsa {
	
//	public SeoulBunsik(String shopName, int kimchi, int budae, int bibim, int sundae, int konggi) {
//		super(shopName, kimchi, budae, bibim, sundae, konggi);
//	} //데이터 베이스가 있으면 가능한 것 
	
	public WangjaBunsik() {
		super("왕자분식", 4000, 5000, 6000, 0, 1000);
	}
	
	@Override
	public void kimchi() {
		System.out.println("김치찌개 : "+ kimchi);
	}

	@Override
	public void budae() {
		System.out.println("부대찌개 : "+ budae);
	}

	@Override
	public void bibim() {
		System.out.println("비빔밥 : "+ bibim);
	}

	@Override
	public void sundae() {
		System.out.println("순대국 : "+ sundae);
	}

	@Override
	public void konggi() {
		System.out.println("공기밥 : "+ konggi);
	}
	
	

}
