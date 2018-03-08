
public class Conditional {
	public static void main(String[] args) {

		Conditional add = new Conditional();

		System.out.println(add.two(3, 9, false));

	}

	public int two(int a, int b, boolean doThis) {

		int c = a + b;

		int d = a * b;

		if (doThis) {

			return c;

		}

		else {

			return d;

		}

	}

}
