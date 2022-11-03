
public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog("Dog");
		dog.eat();
		dog.bark();
		System.out.println(dog.getName());

		BabyDog bbDog = new BabyDog("Baby Dog");
		bbDog.eat();
		bbDog.bark();
		bbDog.weep();
		System.out.println(bbDog.getName());
		bbDog.setName("Ki Ki");
		System.out.println(bbDog.getName());
	}
}
