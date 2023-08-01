package section_arrays;

import java.util.Arrays;

public class CelsiusFahrenheit {

	public static void main(String[] args) {
		double[] celsius = {12.5, 14.5, 17.0, 21.0, 23.0, 18.5, 20.0};
		double[] fahrenheit = celciousToFahrenheit(Arrays.copyOf(celsius, celsius.length));
		System.out.println(Arrays.toString(celsius));
		System.out.println(Arrays.toString(fahrenheit));

	}
	
	
	public static double[] celciousToFahrenheit(double[] fahrenheit) {
		for(int i = 0; i < fahrenheit.length; i++) {
			fahrenheit[i] = (fahrenheit[i]/5 * 9) + 32;
		}
		return fahrenheit;
	}

}
