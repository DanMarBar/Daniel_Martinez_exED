package entornos1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class RomanNumeralConverterTest {
    
    @Test
    public void testRomanToDecimal() {
        assertEquals(21, RomanNumeralConverter.Romanos.romanToDecimal("XXI"));
        assertEquals(2016, RomanNumeralConverter.Romanos.romanToDecimal("MMXVI"));
    }
    
    @Test
    public void testDecimalToRoman() {
        assertEquals("XXI", RomanNumeralConverter.Romanos.decimalToRoman(21));
        assertEquals("MMXVI", RomanNumeralConverter.Romanos.decimalToRoman(2016));
    }
}


