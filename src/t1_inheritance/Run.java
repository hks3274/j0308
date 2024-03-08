package t1_inheritance;

public class Run {
	public static void main(String[] args) {
	 A a = new A();
	 System.out.print("1. ");
	 a.areaRec(10, 20); 
	 
	 B b = new B();
	 System.out.print("2. ");
	 b.areaRec(10, 20);
	 
	 C c = new C();
	 System.out.print("3. ");
	 c.areaRec(10, 20);
	 
	 D d = new D();
	 System.out.print("4. ");
	 d.areaRec(10, 20);
	 
	 E e = new E();
	 System.out.print("5. ");
	 e.areaRec(10, 20);
	 
	 System.out.println("=======================================\n");
	 
	 b.areaPoly(10,20,5);
	 d.areaPoly(10,20,5);
	 
	 
	}
}
