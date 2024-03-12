package t11_interfaceEx;

public interface Menu {
	String[] FOOD = {"두부조림", "미역국", "요플레", "바나나", "우유", "아몬드"};
	int[] PRICE = {1000,1000,800,500,500,700};
	String[] CHOICE_FOOD = new String[FOOD.length];
	int BASIC_PRICE = 2500;	// 쌀밥 + 불고기
	
	void foodCalcPrint();
	
	void foodCalc(int i);
		//TOTAl_PRICE += PRICE[i];
	
	//현재의 프로그램에서 아래의 default 메소드는 생략처리해도 됨...
  default void lunchCalc(int i) {
  	foodCalc(i);
  };
}
