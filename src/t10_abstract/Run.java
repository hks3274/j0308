package t10_abstract;

public class Run {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();
		System.out.println(); //별도의 객체
		
		Cat cat = new Cat();
		cat.sori();
		System.out.println(); //별도의 객체
		
		//그래서 하나의 객체를 써서 사용하려 함
		
		Animal animalDog = new Dog();
		Animal animalCat = new Cat();
		// 타입이 일치됨
		
		animalDog.sound();
		animalCat.sori();
		//이런 경우 업 캐스팅을 하면 좋다 여러시선을 통래 코딩을 하자!
		
	}
}
