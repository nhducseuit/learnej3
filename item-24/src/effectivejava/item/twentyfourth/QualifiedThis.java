package effectivejava.item.twentyfourth;

public class QualifiedThis {
	private String name = "outer";

	public QualifiedThis() {
		System.out.println("My name is " + this.name);
		new NonstaticMemberClass();
	}

	/**
	 * Each instance of a nonstatic member class is implicitly associated with an
	 * enclosing instance of its containing class. Within instance methods of a
	 * nonstatic member class, you can invoke methods on the enclosing instance or
	 * obtain a refer- ence to the enclosing instance using the qualified this
	 * construct [JLS, 15.8.4]
	 *
	 */
	public class NonstaticMemberClass {
		private String name = "inner";

		public NonstaticMemberClass() {
			System.out.println("My name is " + this.name);
			System.out.println("My enclosing class name is " + QualifiedThis.this.name);
		}
	}
}
