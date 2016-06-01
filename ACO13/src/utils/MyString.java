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
//todo implement concat with string
/*    public MyString concat(String string) {
        int lastIndex = characters.length;
        char[] temp = string.toCharArray();
        System.arraycopy(temp, 0, this.characters, characters.length, temp.length);
        MyString str = new MyString(this.characters);
        return str;
    }*/

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

    public boolean contains(MyString subString) {
        if (subString == null || this.length() < subString.length()) {
            return false;
        }
        boolean result = false;
        for (int i = 0; i < this.length(); i++) {
            if (this.characters[i] == subString.characters[0]) {
                if ((this.length() - i) < subString.length()) {
                    return false;
                }
                for (int k = 0; k < subString.length() - 1; k++) {
                    if (this.characters[i + k] == subString.characters[k]) {
                        result = true;
                    } else {
                        result = false;
                        break;
                    }
                }
            }
        }
        return result;
    }

    public boolean contains(char[] chars) {
        return chars != null && contains(new MyString(chars));
    }

    public MyString substring(int beginIndex) {
        int len = this.length() - beginIndex;
        char[] chars = new char[len];
        for (int i = 0; i < len || beginIndex <= len; i++, beginIndex++) {
            chars[i] = this.characters[beginIndex];
        }
        return new MyString(chars);
    }
//ololo
    public MyString substring(int beginIndex, int endIndex) {
        if(beginIndex < 0 || endIndex < 0 || endIndex > this.length() || beginIndex > this.length()){
            return null;
        }
        int subLenght = endIndex - beginIndex + 1;
        char[] chars = new char[subLenght];
        System.arraycopy(this.characters, beginIndex, chars, 0, subLenght);
        return new MyString(chars);
    }

    public MyString trim() {
        int beginIndex = 0, endIndex = this.characters.length - 1;
        while (this.characters[beginIndex] == ' ') {
            beginIndex++;
        }
        while (this.characters[endIndex] == ' ') {
            endIndex--;
        }
        return this.substring(beginIndex, endIndex);
    }

    public boolean equals(MyString string) {
        if (this == string) {
            return true;
        }
        if (string == null || this.length() != string.length()) {
            return false;
        }
        for (int i = 0; i < this.length(); i++) {
            if (this.characters[i] != string.characters[i]) {
                return false;
            }
        }
        return true;
    }

    public int indexOf(char ch) {
        for (int i = 0; i < this.length(); i++) {
            if (this.characters[i] == ch) {
                return i;
            }
        }
        return -1;
    }
}
