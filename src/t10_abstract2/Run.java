package t10_abstract2;

public class Run {
	public static void main(String[] args) {
//		new Animal(); //추상 클래스는 new로 생성 할 수 없다. 
		// 1. 추상클래스는 일반메소드를 사용할 수 있다.
		// 2. 추상 클래스는 new를 통해 생성할 수 없다.
		// 3.추상클래스는 상속을 받아 사용해야 한다.
		
		Animal aniDog = new Dog();
		aniDog.cry();
		
		Animal aniCat = new Cat();
		aniCat.cry();
		
		//이런 목적으로 사용하는것이다. 생각보다 자연스럽게 사용한다.
		//이런 이론을 거의 다 사용하기 때문에 자연스럽게 나중에 사용하게 될 것이다.
	}
}
