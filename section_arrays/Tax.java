package section_arrays;

import java.util.Arrays;

public class Tax {

	public static void main(String[] args) {
		double[] price = {1.99, 2.99, 3.99, 4.99};
		System.out.println(Arrays.toString(price));
		
		for(int i = 0; i < price.length; i++) {
			price[i] = price[i] + (0.13 * price[i]);
		}
		System.out.println(Arrays.toString(price));
	}

}
