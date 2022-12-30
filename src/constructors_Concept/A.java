package constructors_Concept;

public class A {
	public A() {
		System.out.println("From Parent class constructor");
	}

	public A(int i) {
		System.out.println("Parent class constructor consists of= " + i);
	}

	public A(int i, int j) {
		System.out.println("The value of i= " + i + " " + "The value of j= " + j);
	}

}
