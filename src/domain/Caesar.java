package domain;

public class Caesar {
    public static void main(String[] args) {
        String text = "Hello World";
        int shift = 3;
        String encrypted = encrypt(text, shift);
        String decrypted = decrypt(encrypted, shift);
        System.out.println("Text: " + text);
        System.out.println("Shift: " + shift);
        System.out.println("Encrypted: " + encrypted);
        System.out.println("Decrypted: " + decrypted);
    }

    public static String encrypt(String text, int shift) {
        String encrypted = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isUpperCase(c)) {
                char c1 = (char) (c + shift);
                if (c1 > 'Z')
                    encrypted += (char) (c - (26 - shift));
                else
                    encrypted += c1;
            } else if (Character.isLowerCase(c)) {
                char c1 = (char) (c + shift);
                if (c1 > 'z')
                    encrypted += (char) (c - (26 - shift));
                else
                    encrypted += c1;
            } else {
                encrypted += c;
            }
        }
        return encrypted;
    }

    public static String decrypt(String text, int shift) {
        String decrypted = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isUpperCase(c)) {
                char c1 = (char) (c - shift);
                if (c1 < 'A')
                    decrypted += (char) (c + (26 - shift));
                else
                    decrypted += c1;
            } else if (Character.isLowerCase(c)) {
                char c1 = (char) (c - shift);
                if (c1 < 'a')
                    decrypted += (char) (c + (26 - shift));
                else
                    decrypted += c1;
            } else {
                decrypted += c;
            }
        }
        return decrypted;
    }
}
