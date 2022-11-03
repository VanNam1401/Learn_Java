
public class Main {
	public static void main(String[] args) {
		System.out.println("Con cho: ");
		Dog dog = new Dog("Ki Ki");
		dog.eat();
		dog.makeSound();
		dog.sleep();
		System.out.println("Con Meo");
		Cat cat = new Cat("Soc");
		cat.eat();
		cat.makeSound();
		cat.sleep();
		System.out.println("Con chim");
		Bird bird = new Bird("Chich choe");
		bird.eat();
		bird.makeSound();
		bird.sleep();
	}

}
