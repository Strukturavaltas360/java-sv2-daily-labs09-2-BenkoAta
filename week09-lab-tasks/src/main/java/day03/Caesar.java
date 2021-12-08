package day03;

public class Caesar extends Encryption {
    private int offset;

    public Caesar(int offset) {
        this.offset = offset;
    }

    @Override
    public String encrypts(String input) {
        StringBuilder sb = new StringBuilder();
        for (Character ch: input.toCharArray()) {
            sb.append(encrypt(ch));
        }
        return sb.toString();
    }

    private char encrypt(char ch) {
        if (ch >= 'a' & ch <= 'z') {
            return encrypt(ch, 'a', 'z');
        } else if (ch >= 'A' & ch <= 'Z') {
            return encrypt(ch, 'A', 'Z');
        } else if (ch >= '0' & ch <= '9') {
            return encrypt(ch, '0', '9');
        }
        return ch;
    }

    private char encrypt(char ch, char lowerLimit, char upperLimit) {
        char encrypted = (char) (ch + offset);
        byte difference = (byte) (upperLimit + 1 - lowerLimit);
        while (encrypted > upperLimit) {
            encrypted = (char) (encrypted - difference);
        }
        while (encrypted < lowerLimit) {
            encrypted = (char) (encrypted + difference);
        }
        return encrypted;
    }
}
