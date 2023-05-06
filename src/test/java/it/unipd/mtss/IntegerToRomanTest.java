package it.unipd.mtss;

import org.junit.BeforeClass;
import org.junit.Test;

public class IntegerToRomanTest {
    static IntegerToRoman converter = null;

    @BeforeClass
    public static void initializeConverter() {
        converter = new IntegerToRoman();
    }

    @Test(expected = NumberUnderZeroException.class)
    public void testNumberUnderZero() throws NumberUnderZeroException, NumberAEFiveThousand {
        int arabic_number = -5;
        converter.convert(arabic_number);
    }

    @Test(expected = NumberAEFiveThousand.class)
    public void testNumberAbove4999() throws NumberUnderZeroException, NumberAEFiveThousand {
        int arabic_number = 5000;
        converter.convert(arabic_number);
    }
}
