package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.MockedStatic;
import org.mockito.Mockito;

public class RomanPrinterTest {
    static RomanPrinter printer;

    @BeforeClass
    public static void initializePrinter() {
        printer = new RomanPrinter();
    }

    @Test
    public void testPrintI() throws NumberUnderZeroException, NumberAEFiveThousand, NonRightCharacterException {
        int arabic_number = 1;
        String ascii_art_for_I = printer.print(arabic_number);
        assertEquals(ascii_art_for_I, new String(" _____ \n" +
                "|_   _|\n" +
                "  | |  \n" +
                "  | |  \n" +
                " _| |_ \n" +
                "|_____|\n"));
    }

    @Test
    public void testPrintV() throws NumberUnderZeroException, NumberAEFiveThousand, NonRightCharacterException {
        int arabic_number = 5;
        String ascii_art_for_V = printer.print(arabic_number);
        assertEquals(ascii_art_for_V, new String("__      __\n" +
                "\\ \\    / /\n" +
                " \\ \\  / / \n" +
                "  \\ \\/ /  \n" +
                "   \\  /   \n" +
                "    \\/    \n"));

    }

    @Test
    public void testPrintX() throws NumberUnderZeroException, NumberAEFiveThousand, NonRightCharacterException {
        int arabic_number = 10;
        String ascii_art_for_X = printer.print(arabic_number);
        assertEquals(ascii_art_for_X, new String("__   __\n" +
                "\\ \\ / /\n" +
                " \\ V / \n" +
                "  > <  \n" +
                " / . \\ \n" +
                "/_/ \\_\\\n"));

    }

    @Test
    public void testPrintL() throws NumberUnderZeroException, NumberAEFiveThousand, NonRightCharacterException {
        int arabic_number = 50;
        String ascii_art_for_L = printer.print(arabic_number);
        assertEquals(ascii_art_for_L, new String(" _      \n" +
                "| |     \n" +
                "| |     \n" +
                "| |     \n" +
                "| |____ \n" +
                "|______|\n"));

    }

    @Test
    public void testPrintC() throws NumberUnderZeroException, NumberAEFiveThousand, NonRightCharacterException {
        int arabic_number = 100;
        String ascii_art_for_C = printer.print(arabic_number);
        assertEquals(ascii_art_for_C, new String("  _____ \n" +
                " / ____|\n" +
                "| |     \n" +
                "| |     \n" +
                "| |____ \n" +
                " \\_____|\n"));

    }

    @Test
    public void testPrintD() throws NumberUnderZeroException, NumberAEFiveThousand, NonRightCharacterException {
        int arabic_number = 500;
        String ascii_art_for_D = printer.print(arabic_number);
        assertEquals(ascii_art_for_D, new String(" _____  \n" +
                "|  __ \\ \n" +
                "| |  | |\n" +
                "| |  | |\n" +
                "| |__| |\n" +
                "|_____/ \n"));

    }

    @Test
    public void testPrintM() throws NumberUnderZeroException, NumberAEFiveThousand, NonRightCharacterException {
        int arabic_number = 1000;
        String ascii_art_for_M = printer.print(arabic_number);
        assertEquals(ascii_art_for_M, new String(" __  __ \n" +
                "|  \\/  |\n" +
                "| \\  / |\n" +
                "| |\\/| |\n" +
                "| |  | |\n" +
                "|_|  |_|\n"));

    }

    @Test
    public void testNumberZeroAsciiArt()
            throws NumberUnderZeroException, NumberAEFiveThousand, NonRightCharacterException {
        int arabic_number = 0;
        String ascii_art_for_zero = printer.print(arabic_number);
        assertEquals(ascii_art_for_zero, new String(""));
    }

    @Test
    public void testLettersCombination1666()
            throws NumberUnderZeroException, NumberAEFiveThousand, NonRightCharacterException {
        int arabic_number = 1666;
        String ascii_art_for_1666 = printer.print(arabic_number);
        assertEquals(ascii_art_for_1666,
                new String(" __  __ " + " _____  " + "  _____ " + " _      " + "__   __" + "__      __" + " _____ \n" +
                        "|  \\/  |" + "|  __ \\ " + " / ____|" + "| |     " + "\\ \\ / /" + "\\ \\    / /" + "|_   _|\n"
                        +
                        "| \\  / |" + "| |  | |" + "| |     " + "| |     " + " \\ V / " + " \\ \\  / / " + "  | |  \n" +
                        "| |\\/| |" + "| |  | |" + "| |     " + "| |     " + "  > <  " + "  \\ \\/ /  " + "  | |  \n" +
                        "| |  | |" + "| |__| |" + "| |____ " + "| |____ " + " / . \\ " + "   \\  /   " + " _| |_ \n" +
                        "|_|  |_|" + "|_____/ " + " \\_____|" + "|______|" + "/_/ \\_\\" + "    \\/    "
                        + "|_____|\n"));
    }

    @Test
    public void testLettersCombination511()
            throws NumberUnderZeroException, NumberAEFiveThousand, NonRightCharacterException {
        int arabic_number = 511;
        String ascii_art_for_511 = printer.print(arabic_number);
        assertEquals(ascii_art_for_511,
                new String(" _____  " + "__   __" + " _____ \n" +
                        "|  __ \\ " + "\\ \\ / /" + "|_   _|\n"
                        + "| |  | |" + " \\ V / " + "  | |  \n" +
                        "| |  | |" + "  > <  " + "  | |  \n" +
                        "| |__| |" + " / . \\ " + " _| |_ \n" +
                        "|_____/ " + "/_/ \\_\\"
                        + "|_____|\n"));
    }

    @Test
    public void testLettersCombination56()
            throws NumberUnderZeroException, NumberAEFiveThousand, NonRightCharacterException {
        int arabic_number = 65;
        String ascii_art_for_65 = printer.print(arabic_number);
        assertEquals(ascii_art_for_65,
                new String(" _      " + "__   __" + "__      __\n" +
                        "| |     " + "\\ \\ / /" + "\\ \\    / /\n" +
                        "| |     " + " \\ V / " + " \\ \\  / / \n" +
                        "| |     " + "  > <  " + "  \\ \\/ /  \n" +
                        "| |____ " + " / . \\ " + "   \\  /   \n" +
                        "|______|" + "/_/ \\_\\" + "    \\/    \n"));
    }

    @Test(expected = NullPointerException.class)
    public void testNullInsertion() throws NumberUnderZeroException, NumberAEFiveThousand, NonRightCharacterException {
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            utilities.when(() -> IntegerToRoman.convert(0)).thenReturn(null);
            printer.print(0);
        }
    }

    @Test(expected = NonRightCharacterException.class)
    public void testNonRightCharacters()
            throws NumberUnderZeroException, NumberAEFiveThousand, NonRightCharacterException {
        try (MockedStatic<IntegerToRoman> utilities = Mockito.mockStatic(IntegerToRoman.class)) {
            utilities.when(() -> IntegerToRoman.convert(0)).thenReturn("CIAO");
            printer.print(0);
        }
    }
}
