package ru.dataart.academy.java;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println("Reverse integer works: " + reverseInteger.reverse(-456));
        System.out.println("Reverse integer works for big negative value: " + reverseInteger.reverse(-2147483648));
        System.out.println("Reverse integer works for big positive value: " + reverseInteger.reverse(2147483647));
    }
}
