package org.example;

public class Uppercase {
    public void toUpper(String str) {
        char[] result = str.toCharArray();
        for (int i = 0, e = result.length; i < e; ++i) {
            if (Character.isLowerCase(result[i]) && Character.isLetter(result[i])) {
                result[i] = (char) (result[i] - 32);
            }
        }
        System.out.println(result);
    }
}
