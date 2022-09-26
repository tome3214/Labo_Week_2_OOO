package ui;

import domain.Caesar;
import domain.mirrorring;

public class main {
    public static void main(String[] args) {
        // use caesar class
String text = "Hello World";
int shift = 3;
String encrypted = Caesar.encrypt(text, shift);
String decrypted = Caesar.decrypt(encrypted, shift);
System.out.println("Text: " + text);
System.out.println("Shift: " + shift);
System.out.println("Encrypted: " + encrypted);
System.out.println("Decrypted: " + decrypted);

// mirroring now
String text2 = "Hello World";
String mirrored = mirrorring.mirrorring(text2);
System.out.println("Text: " + text2);
System.out.println("Mirrored: " + mirrored);







    }
}

