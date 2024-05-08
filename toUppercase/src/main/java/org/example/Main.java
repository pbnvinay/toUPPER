package org.example;

public class Main {
    public static void main(String[] args) {
        Uppercase obj=new Uppercase();
        System.out.println(obj.TCnormal());
        // not accepting nullvalues as a input so if you want to normal flow you comment TCnegative
        //System.out.println(obj.TCnegative());
        System.out.println(obj.TCempty());
        System.out.println(obj.TCnumber());
        System.out.println(obj.TCmixed());

    }
}
