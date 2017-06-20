package exercise2;

public class ArithmeticSample {
	public static void main(String[] args) {
		boolean keepgoing = true;
		int result = 15, i = 10;
		do {
			i--;
			if (i == 8)
				keepgoing = false;
			result -= 2;
		} while (keepgoing);
		System.out.println(result);
	}
}
