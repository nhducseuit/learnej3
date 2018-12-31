package effectivejava.item.twentyfourth;

public class LocalClass {
	public void declareLocalClass() {
		class Dog {
			private String name = "dog";
			private int legs = 4;
			public String toString() {
				return "Hello, I'm a " + name + " and I have " + legs + " legs";
			}
		}
		System.out.println(new Dog());
	}
}
