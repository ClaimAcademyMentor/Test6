package loops;

public class ArraysAndLoops {

	public static void main(String[] args) {
		// Index begins at: | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 |
		boolean[] isFired = { true, false, false, true, true, true, false, false };
//		System.out.println(isFired[0]);
//		System.out.println(isFired[1]);
//		System.out.println(isFired[2]);
//		System.out.println(isFired[3]);
//		System.out.println(isFired[4]);
//		System.out.println(isFired[5]);
//		System.out.println(isFired[6]);
//		System.out.println(isFired[7]);

		// find out how long an array is
		int len = isFired.length;
		System.out.println(len);

		for (int i = 0; i < len; i++) {
			System.out.println("The loop is at " + i + " the value is this " + isFired[i]);
		}
	}

}
