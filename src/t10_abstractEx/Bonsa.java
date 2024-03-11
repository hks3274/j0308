package t10_abstractEx;
@SuppressWarnings("unused")
public abstract class Bonsa { //추상클래스
	public String shopName;
	public int kimchi;
	public int budae;
	public int bibim;
	public int sundae;
	public int konggi;
	

	public Bonsa(String shopName, int kimchi, int budae, int bibim, int sundae, int konggi) { //생성자
//		super(); -> object를 부르는 것과 같음 
		this.shopName = shopName;
		this.kimchi = kimchi;
		this.budae = budae;
		this.bibim = bibim;
		this.sundae = sundae;
		this.konggi = konggi;
	}
	
	
	public abstract void kimchi(); //추상메소드
	public abstract void budae();
	public abstract void bibim();
	public abstract void sundae();
	public abstract void konggi();
	
	
	
	public void getShopName() {
		System.out.println("점포명 : "+ shopName);
	}
	
}
