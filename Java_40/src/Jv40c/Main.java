package Jv40c;

public class Main {
public static void main(String[] args) {
	Dog dog = new Dog("Dog");
	dog.eat();
	dog.bark();
	System.out.println("\n");
	Cat cat = new Cat("Meo");
	cat.eat();
	cat.meow();
	System.out.println("\n");
	Bird bird = new Bird("Chip");
	bird.eat();
	bird.flying();
}
}
