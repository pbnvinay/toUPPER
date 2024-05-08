package org.example;

public class Uppercase {
    public static String toUpper(String str) {
        char[] str_array = str.toCharArray();
        for (int i = 0, e = str_array.length; i < e; ++i) {
            if (Character.isLowerCase(str_array[i]) && Character.isLetter(str_array[i])) {
                str_array[i] = (char) (str_array[i] - 32);
            }
        }
        String result = String.valueOf(str_array);
        return result;
    }
//testing for normal flow
    public static boolean TCnormal() {
        String expected = "PHENOM";
        String input = "phenom";
       String result = toUpper(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }

    //testing for null value
    public static boolean TCnegative() {
        String expected = null;
        String input = null;
        String result = toUpper(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }

    //testing empty value
    public static boolean TCempty() {
        String expected = "";
        String input = "";
        String result = toUpper(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }

    //testing numbers only
    public static boolean TCnumber() {
        String expected = "12345";
        String input = "12345";
        String result = toUpper(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }

    //testing method for mixed values like numbers and char's
    public static boolean TCmixed() {
        String expected = "P12B3N";
        String input = "p12b3n";
        String result = toUpper(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }
}
