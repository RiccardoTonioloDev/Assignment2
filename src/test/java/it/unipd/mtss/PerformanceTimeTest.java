package it.unipd.mtss;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class PerformanceTimeTest {
    @Rule
    public Timeout timer = new Timeout(2500);

    @Test
    public void performanceTimeTestIntegerToRoman()
            throws NumberUnderZeroException, NumberAEFiveThousand, NonRightCharacterException {
        int arabic_number = 1666;
        String roman_number = IntegerToRoman.convert(arabic_number);
        String expected = "MDCLXVI";
        assertEquals(expected, roman_number);
    }

    @Test()
    public void performanceTimeTestRomanPrinter()
            throws NumberUnderZeroException, NumberAEFiveThousand, NonRightCharacterException {
        String ascii_art_for_I = RomanPrinter.print(1666);
        assertEquals(ascii_art_for_I,
                new String(" __  __ " + " _____  " + "  _____ " + " _      " + "__   __" + "__      __" + " _____ \n" +
                        "|  \\/  |" + "|  __ \\ " + " / ____|" + "| |     " + "\\ \\ / /" + "\\ \\    / /" + "|_   _|\n"
                        +
                        "| \\  / |" + "| |  | |" + "| |     " + "| |     " + " \\ V / " + " \\ \\  / / " + "  | |  \n" +
                        "| |\\/| |" + "| |  | |" + "| |     " + "| |     " + "  > <  " + "  \\ \\/ /  " + "  | |  \n" +
                        "| |  | |" + "| |__| |" + "| |____ " + "| |____ " + " / . \\ " + "   \\  /   " + " _| |_ \n" +
                        "|_|  |_|" + "|_____/ " + " \\_____|" + "|______|" + "/_/ \\_\\" + "    \\/    "
                        + "|_____|\n"));

    }

}