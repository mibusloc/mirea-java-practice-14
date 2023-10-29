package ru.mirea.lab14.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "Prices string: 25.98 USD, 100 RUB, 219.23 RUB, 12.50 EU, 44 ERR, 0.004 EU.";

        Matcher matcher = Pattern.compile("[0-9]+\\.\\d\\d USD|[0-9]+\\.\\d\\d RUB|[0-9]+\\.\\d\\d EU").matcher(text);
        System.out.println("Prices:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
