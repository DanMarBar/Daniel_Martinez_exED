package entornos1;

public class RomanNumeralConverter {
    
	public static class Romanos {
		private static final int[] VALUES = { 1000, 900, 500, 400, 100,
				90, 50, 40, 10, 9, 5, 4, 1 };
		private static final String[] SYMBOLS = { "M", "CM", "D", "CD", "C",
				"XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		public static int romanToDecimal(String roman) {
			int decimal = 0;
			int prevValue = 0;
			for (int i = roman.length() - 1; i >= 0; i--) {
				char symbol = roman.charAt(i);
				int value = getValue(symbol);

				if (value < prevValue) {
					decimal -= value;
				} else {
					decimal += value;
				}
				prevValue = value;
			}

			return decimal;
		}

		private static int getValue(char symbol) {
			switch (symbol) {
			case 'I':
				return 1;
			case 'V':
				return 5;
			case 'X':
				return 10;
			case 'L':
				return 50;
			case 'C':
				return 100;
			case 'D':
				return 500;
			case 'M':
				return 1000;
			default:
				throw new IllegalArgumentException("Error de caracter: " + symbol);
			}
		}

		public static String decimalToRoman(int decimal) {
			if (decimal < 1 || decimal > 3999) {
				throw new IllegalArgumentException("El número decimal "
						+ "debe estar entre 1 y 3999");
			}

			StringBuilder roman = new StringBuilder();
			for (int i = 0; i < VALUES.length; i++) {
				while (decimal >= VALUES[i]) {
					decimal -= VALUES[i];
					roman.append(SYMBOLS[i]);
				}
			}

			return roman.toString();
		}
	}
}