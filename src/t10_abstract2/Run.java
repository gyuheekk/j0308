package t10_abstract2;

public class Run {
	public static void main(String[] args) {
		// Animal animal = new Animal(); //추상클래스는 new로 생성 불가
		
		Animal aniDog = new Dog();
		aniDog.cry();
		
		Animal aniCat = new Cat();
		aniCat.cry();
	}
}
