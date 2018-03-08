
public class Conditional2 {
	public static void main(String[] args) {

		Conditional2 add = new Conditional2 ();

		System.out.println(add.two(3,9,false));

		}

		public int two(int a, int b, boolean doThis) {

		int c = a + b;

		int d = a * b;

		if (a==0 & b!=0) {

		return b;

		}

		if(doThis) {

		return c;

		}

		else {

		return d;

		}

		}
}
