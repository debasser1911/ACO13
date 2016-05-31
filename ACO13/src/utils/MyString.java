package utils;

/**
 * Created by istomina on 31.05.2016.
 */
public class MyString {
    private char[] characters;

    public MyString(String string) {

        characters = string == null ? null : string.toCharArray();
    }

    public MyString(char[] chars) {
        characters = chars == null ? null : chars;
    }

    @Override
    public String toString() {
        return String.valueOf(characters);
    }

    public int length() {
        return characters.length;
    }

    public MyString concat(MyString strTwo) {
        if (strTwo == null) {
            char[] chars = new char[this.length()];
            System.arraycopy(characters, 0, chars, 0, characters.length);
            return new MyString(chars);
        }
        int lengths = this.length() + strTwo.length();
        MyString result = new MyString(new char[lengths]);
        System.arraycopy(this.characters, 0, result.characters, 0, this.length());
        System.arraycopy(strTwo.characters, 0, result.characters, this.length(), strTwo.length());
        return result;
    }

    public MyString toLowerCase() {
        char[] ch = new char[characters.length];
        System.arraycopy(characters, 0, ch, 0, characters.length);
        MyString result = new MyString(ch);
        for (int i = 0; i < result.length(); i++) {
            result.characters[i] = Character.toLowerCase(result.characters[i]);
        }
        return result;
    }

    public MyString toUpperCase() {
        char[] ch = new char[characters.length];
        System.arraycopy(characters, 0, ch, 0, characters.length);
        MyString result = new MyString(ch);
        for (int i = 0; i < result.length(); i++) {
            result.characters[i] = Character.toUpperCase(result.characters[i]);
        }
        return result;
    }
    public boolean
}
