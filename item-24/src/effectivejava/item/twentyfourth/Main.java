package effectivejava.item.twentyfourth;

public class Main {
	public static void main(String[] args) {
		QualifiedThis qt = new QualifiedThis();
		qt.new NonstaticMemberClass();
		
		/////
		
		new LocalClass().declareLocalClass();
		
		System.exit(0);
	}
}
