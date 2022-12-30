package constructors_Concept;

public class B extends A {
	public B() {
		super(10, 25);
		System.out.println("From Child class constructor");
	}

	public B(int i) {
		super(i);
	}

	public B(int i, int j) {
		super(i, j);
	}

	public static void main(String[] args) {
		B b = new B();

		B b1 = new B(1);

		B b2 = new B(1, 2);
	}
}
