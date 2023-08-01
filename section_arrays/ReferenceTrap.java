package section_arrays;

import java.util.Arrays;

public class ReferenceTrap {

	public static void main(String[] args) {
		String[] pat = {"Patricia", "Anne", "Valenzuela"};
		String[] patNew = Arrays.copyOf(pat, pat.length);
		patNew[2] = "O";
		System.out.println(Arrays.toString(pat));
		System.out.println(Arrays.toString(patNew));
	}

}
