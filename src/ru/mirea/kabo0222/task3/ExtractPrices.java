package ru.mirea.kabo0222.task3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractPrices {
    public static void main(String[] args) {
        // Входной текст со списками цен
        String inputText = "Примеры цен: 25.98 USD, 100 RUB, 10.50 EU, 44 ERR, 0.004 EU.";

        // Регулярное выражение для поиска цен в USD, RUB и EUR
        String regex = "(\\d+(\\.\\d{2})?)\\s+(USD|RUB|EU)";

        // Создание объекта Pattern для компиляции регулярного выражения
        Pattern pattern = Pattern.compile(regex);

        // Создание объекта Matcher для поиска соответствий в тексте
        Matcher matcher = pattern.matcher(inputText);

        // Извлечение и вывод цен по найденным соответствиям
        System.out.println("Извлеченные цены:");
        while (matcher.find()) {
            String price = matcher.group(1);
            String currency = matcher.group(3);
            System.out.println(price + " " + currency);
        }
    }
}