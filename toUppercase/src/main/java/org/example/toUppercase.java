package org.example;

public class toUppercase {
    public void toUpper(char[] str) {
        for (int i = 0, e = str.length; i < e; ++i) {
            if (Character.isLowerCase(str[i]) && Character.isLetter(str[i])) {
                str[i] = (char) (str[i] - 32);
            }
        }
        System.out.println(str);
    }
}
