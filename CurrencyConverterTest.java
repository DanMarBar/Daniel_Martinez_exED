package entornos1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CurrencyConverterTest {

    @Test
    public void testDollarToEuro() {
        assertEquals(8.61, CurrencyConverter.dollarToEuro(10.5), 0.00001);
    }

    @Test
    public void testEuroToDollar() {
        assertEquals(24.76, CurrencyConverter.euroToDollar(20.30), 0.1);
    }
}
