package org.example;

public class toUppercase {
    public toUppercase(char[] str) {
        for (int i = 0, e = str.length; i < e; ++i) {
            if (Character.isLetter(str[i]) && Character.isLowerCase(str[i])) {
                str[i] = (char) (str[i] - 32);
            }
        }
        System.out.println(str);
    }
}
