package t11_interface5;

public interface Action {
	//경찰관(범인잡기, 물건찾기)
	void catching();
	void serch();
	
	//소방관(불끄기, 인명구조)
	void fire();
	void save();
	
	//요리사(피자만들기, 스파게티만들기)
	void pizza();
	void spagetti();
	
	//역할명
	default void action(String action) {
		System.out.println(action +" 역할? ");
	}
	
}
