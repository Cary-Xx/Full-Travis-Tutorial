public class SUT {

    public int stringConcatenation(String s1, String s2) throws IllegalArgumentException {
        String res = s1.concat(s2);

        if (res.length() < 3) {
            return 1;
        }
        else if (res.length() < 6) {
            return 2;
        }
        else if (res.length() < 10) {
            return 3;
        }
        else if (res.length() < 20) {
            return 4;
        }
        else if (res.length() < 40) {
            return 5;
        }
        throw new IllegalArgumentException("Result format is wrong");
    }
}
