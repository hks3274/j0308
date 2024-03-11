package t10_abstractEx;

public class BunsikRun2 {
	public static void main(String[] args) {
//		Bonsa seoulBunsik = new SeoulBunsik();
//		Bonsa woojuBunsik = new WoojuBunsik();
//		Bonsa wangjaBunsik = new WangjaBunsik();
		
		Bonsa[] bonsas = {new WangjaBunsik(), new SeoulBunsik(), new WangjaBunsik()};
		
		for (int i = 0; i < bonsas.length; i++) {
			bonsas[i].getShopName();
			bonsas[i].kimchi();
			bonsas[i].budae();
			bonsas[i].bibim();
			bonsas[i].sundae();
			bonsas[i].konggi();
			System.out.println();
			System.out.println("=================================");
		}
		
//		WangjaBunsik wangjaBunsik = new WangjaBunsik();
//		wangjaBunsik.getShopName();
//		wangjaBunsik.kimchi();
//		wangjaBunsik.budae();
//		wangjaBunsik.bibim();
//		wangjaBunsik.sundae();
//		wangjaBunsik.konggi();
//		System.out.println("==================================");
//		
//		SeoulBunsik seoulBunsik = new SeoulBunsik();
//		seoulBunsik.getShopName();
//		seoulBunsik.kimchi();
//		seoulBunsik.budae();
//		seoulBunsik.bibim();
//		seoulBunsik.sundae();
//		seoulBunsik.konggi();
//		System.out.println("==================================");
//		
//		WoojuBunsik woojuBunsik = new WoojuBunsik();
//		woojuBunsik.getShopName();
//		woojuBunsik.kimchi();
//		woojuBunsik.budae();
//		woojuBunsik.bibim();
//		woojuBunsik.sundae();
//		woojuBunsik.konggi();
		
	}
}
