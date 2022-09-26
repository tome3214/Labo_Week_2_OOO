package domain;

public class mirrorring {
    // a function that takes a string and returns a new string with the characters mirrored
    public static String mirrorring(String text) {
        String result = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            result += text.charAt(i);
        }
        return result;
    }
}
