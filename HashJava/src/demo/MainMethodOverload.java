package demo;

public class MainMethodOverload {

	public static void main(String[] args) {
		System.out.println("main method invoked");
		main(9);
		main("hello");
	}

	public static void main(String str) {
		System.out.println(str);
	}

	public static void main(int x) {
		System.out.println(x);
	}

	public void x() {
		main(9);
	}
}