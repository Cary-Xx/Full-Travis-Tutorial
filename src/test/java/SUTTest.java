import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.Test;

public class SUTTest {

    @Test
    public void testStringConcatenation_twoEmptyStrings_typeI() {
        String s1 = "";
        String s2 = "";
        SUT sut = new SUT();
        int result = sut.stringConcatenation(s1, s2);
        assertEquals(result, 1);
    }

    @Test(expected = NullPointerException.class)
    public void testStringConcatenation_nullStringS1_throwsNullPointerException() {
        String s1 = null;
        String s2 = "";
        SUT sut = new SUT();
        sut.stringConcatenation(s1, s2);
    }

    @Test
    public void testStringConcatenation_nullStringS1_throwsNullPointerException2() {
        String s1 = null;
        String s2 = "";
        SUT sut = new SUT();
        assertThrows(NullPointerException.class, () -> sut.stringConcatenation(s1, s2));
    }

    @Test
    public void testStringConcatenation_length2_typeI() {
        String s1 = "a";
        String s2 = "b";
        SUT sut = new SUT();
        int result = sut.stringConcatenation(s1, s2);
        assertEquals(result, 1);
    }

    @Test
    public void testStringConcatenation_length5_typeII() {
        String s1 = "abc";
        String s2 = "de";
        SUT sut = new SUT();
        int result = sut.stringConcatenation(s1, s2);
        assertEquals(result, 2);
    }

    @Test
    public void testStringConcatenation_length9_typeIII() {
        String s1 = "abcde";
        String s2 = "fghi";
        SUT sut = new SUT();
        int result = sut.stringConcatenation(s1, s2);
        assertEquals(result, 3);
    }

    @Test
    public void testStringConcatenation_length18_typeIV() {
        String s1 = "abcdefghi";
        String s2 = "jklmnopqr";
        SUT sut = new SUT();
        int result = sut.stringConcatenation(s1, s2);
        assertEquals(result, 4);
    }

    @Test
    public void testStringConcatenation_length26_typeV() {
        String s1 = "abcdefghijklmn";
        String s2 = "opqrstuvwxyz";
        SUT sut = new SUT();
        int result = sut.stringConcatenation(s1, s2);
        assertEquals(result, 5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testStringConcatenation_length49_throwsIllegalArgumentException() {
        String s1 = "Greetings from Intellij. ";
        String s2 = "Greetings from Eclipse. ";
        SUT sut = new SUT();
        sut.stringConcatenation(s1, s2);
    }

    @Test
    public void testStringConcatenation_twoSpecialChar_typeI() {
        String s1 = "\n";
        String s2 = "\r";
        SUT sut = new SUT();
        int result = sut.stringConcatenation(s1, s2);
        assertEquals(result, 1);
    }
}
